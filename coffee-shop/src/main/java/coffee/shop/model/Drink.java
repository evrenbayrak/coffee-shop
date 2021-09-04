package coffee.shop.model;

import coffee.shop.ingredient.Ingredients;

public interface Drink {
	
	String getPrice();
	String getName();
	String prepareOrderMessage();
	int getOrder();
	void generateIngredients();
	Ingredients getIngredients();
	
}
