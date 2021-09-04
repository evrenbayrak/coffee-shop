package coffee.shop.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	
	/**
	 * Satışa uygun içecekleri tanımlar ve listeye ekler
	 */
	public DrinkListUtil() {		
		drinkList.add(new Espresso());
		drinkList.add(new DoubleEspresso());
		drinkList.add(new Cappuccino());
		drinkList.add(new CaffeLatte());
		drinkList.add(new Mocha());
		drinkList.add(new Americano());
		drinkList.add(new HotWater());
	}
	
	/**
	 * Kullanıcıya sıralı şekilde içecek listesini sunar.
	 * "1. Espresso (7)" formatında tüm içecekler sıralanır.
	 */
	public void printDrinkOptions() {
		int index = 1;
		for (Drink drink : drinkList) {			
			System.out.println(String.format("%d. %s (%s)",index, drink.getName(), drink.getPrice()));
			index++;
		}
			
	}
	
	/**
	 * Tüm içecekler ile üretim tariflerini ilişkilendirir.
	 */
	public void generateIngredients() {
		for (Drink drink : drinkList) {
			drink.generateIngredients();
		}
	}
	
	public List<Drink> getDrinkList() {
		return drinkList;
	}

	/**
	 * Seçilen kullanıcı sipariş no'su ile mevcut ürün listesini filtreler. Eşleşen ürün bilgisini döner.
	 * @param orderNo
	 * @return Drink Object
	 */
	public Optional<Drink> getSelectedDrink(int orderNo) {
		
		//Null pointer exception alınmaması için Optional nesnesi ile ilerlendi.
		Optional<Drink> selectedDrink = drinkList.stream()
		.filter(x -> x.getOrder() == orderNo)
		.findFirst();
		
		return selectedDrink;
	}
}
