package application;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import coffee.shop.model.Americano;
import coffee.shop.model.CaffeLatte;
import coffee.shop.model.Cappuccino;
import coffee.shop.model.DoubleEspresso;
import coffee.shop.model.Drink;
import coffee.shop.model.Espresso;
import coffee.shop.model.HotWater;
import coffee.shop.model.Mocha;
import coffee.shop.util.DrinkListUtil;


class OrderManagementTest {

	private final List<Drink> drinkList = new ArrayList<>();
	OrderManagement orderManagement = new OrderManagement();
	DrinkListUtil mocked = Mockito.mock(DrinkListUtil.class);
	
	@BeforeEach
	public void setup() {		
		drinkList.add(new Espresso());
		drinkList.add(new DoubleEspresso());
		drinkList.add(new Cappuccino());
		drinkList.add(new CaffeLatte());
		drinkList.add(new Mocha());
		drinkList.add(new Americano());
		drinkList.add(new HotWater());
	}	

	@Test
	void whenUserInputCorrect_expectReturnTrue() {
		String input = "5";
		Mockito.when(mocked.getDrinkList()).thenReturn(drinkList);
		orderManagement.drinkListUtil = mocked;
		InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    assertEquals("5", "" + orderManagement.getUserRequest());
	}
	
	@Test
	void whenUserInputInCorrect_expectError() {
		String input = "77";
		Mockito.when(mocked.getDrinkList()).thenReturn(drinkList);
		orderManagement.drinkListUtil = mocked;
		InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    assertThrows(NoSuchElementException.class, () -> {
	    	orderManagement.getUserRequest();
		   });	

	}

	@Test
	void whenWrongOrderNumber_expectNoException() {
		OrderManagement order = Mockito.mock(OrderManagement.class);
		Mockito.when(mocked.getSelectedDrink(99)).thenReturn(null);
		Mockito.verify(order, Mockito.times(0)).startOrderProcess(99);
		
	}
	
	@Test
	void whenCorrectOrderNumber_expectNoException() {
		OrderManagement order = Mockito.mock(OrderManagement.class);
		Mockito.when(mocked.getSelectedDrink(5)).thenReturn(null);
		Mockito.verify(order, Mockito.times(0)).startOrderProcess(5);
		
	}
	
	@Test
	void whenWrongOrderNumber_expectReturnTrue() {
		Mockito.when(mocked.getDrinkList()).thenReturn(drinkList);
		orderManagement.drinkListUtil = mocked;
		assertEquals(orderManagement.isRequestOrderNotInRange(99), true);
	}
	
	@Test
	void whenCorrectOrderNumber_expectReturnFalse() {
		Mockito.when(mocked.getDrinkList()).thenReturn(drinkList);
		orderManagement.drinkListUtil = mocked;
		assertEquals(orderManagement.isRequestOrderNotInRange(5), false);
	}
	
	@Test
	void whenCorrectListSize_expectReturnTrue() {	
		assertEquals(drinkList.size() == 7 , true);
	}
}
