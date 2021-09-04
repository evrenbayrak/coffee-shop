package coffee.shop.util;

import java.util.ArrayList;
import java.util.List;

import coffee.shop.model.Americano;
import coffee.shop.model.CaffeLatte;
import coffee.shop.model.Cappuccino;
import coffee.shop.model.DoubleEspresso;
import coffee.shop.model.Drink;
import coffee.shop.model.Espresso;
import coffee.shop.model.HotWater;
import coffee.shop.model.Mocha;

public class DrinkListUtil {
	
	private List<Drink> drinkList = new ArrayList<>();
	
	public DrinkListUtil() {		
		drinkList.add(new Espresso());
		drinkList.add(new DoubleEspresso());
		drinkList.add(new Cappuccino());
		drinkList.add(new CaffeLatte());
		drinkList.add(new Mocha());
		drinkList.add(new Americano());
		drinkList.add(new HotWater());
	}
	
	public void printDrinkOptions() {
		int index = 1;
		for (Drink drink : drinkList) {
			System.out.println(index + ". " + drink.getName() + " (" + drink.getPrice() + ")");
			index++;
		}
		
		
	}

	public List<Drink> getDrinkList() {
		return drinkList;
	}

	
}
