package coffee.shop.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import coffee.shop.model.Americano;
import coffee.shop.model.CaffeLatte;
import coffee.shop.model.Cappuccino;
import coffee.shop.model.DoubleEspresso;
import coffee.shop.model.Drink;
import coffee.shop.model.Espresso;
import coffee.shop.model.HotWater;
import coffee.shop.model.Mocha;

class DrinkListUtilTest {

	DrinkListUtil drinkListUtil = new DrinkListUtil();

	@Test
	void whenEspressoOrdered_expectEspressoReturn() {
		Optional<Drink> drink = drinkListUtil.getSelectedDrink(1);
		assertEquals(drink.get().getClass(), Espresso.class)
		;
	}
	
	@Test
	void whenDoubleEspressoOrdered_expectDoubleEspressoReturn() {
		Optional<Drink> drink = drinkListUtil.getSelectedDrink(2);
		assertEquals(drink.get().getClass(), DoubleEspresso.class)
		;
	}
	
	@Test
	void whenCappuccinoOrdered_expectCappuccinoReturn() {
		Optional<Drink> drink = drinkListUtil.getSelectedDrink(3);
		assertEquals(drink.get().getClass(), Cappuccino.class)
		;
	}
	
	@Test
	void whenCaffeLatteOrdered_expectCaffeLatteReturn() {
		Optional<Drink> drink = drinkListUtil.getSelectedDrink(4);
		assertEquals(drink.get().getClass(), CaffeLatte.class)
		;
	}
	
	@Test
	void whenMochaOrdered_expectMochaReturn() {
		Optional<Drink> drink = drinkListUtil.getSelectedDrink(5);
		assertEquals(drink.get().getClass(), Mocha.class)
		;
	}
	
	@Test
	void whenAmericanoOrdered_expectAmericanoReturn() {
		Optional<Drink> drink = drinkListUtil.getSelectedDrink(6);
		assertEquals(drink.get().getClass(), Americano.class)
		;
	}
	
	@Test
	void whenHotWaterOrdered_expectHotWaterReturn() {
		Optional<Drink> drink = drinkListUtil.getSelectedDrink(7);
		assertEquals(drink.get().getClass(), HotWater.class)
		;
	}
	
}
