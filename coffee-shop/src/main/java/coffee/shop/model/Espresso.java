package coffee.shop.model;

import java.util.ArrayList;
import java.util.List;

import coffee.shop.constants.MessageConstants;
import coffee.shop.ingredient.EspressoIngr;
import coffee.shop.ingredient.Ingredient;
import coffee.shop.ingredient.Ingredients;

public class Espresso implements Drink {

	private final int order = 1;
	private int price = 7;
	private Ingredients ingredients;
	private final String name = "Espresso";
	
	@Override
	public Ingredients getIngredients() {		
		return ingredients;
	}

	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}

	public int getOrder() {
		return order;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String getPrice() {
		return this.price + "₺";
	}

	@Override
	public final String prepareOrderMessage() {
		return MessageConstants.COFFEE_ORDER_MESSAGE;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void generateIngredients() {
		ingredients = new Ingredients();
		List<Ingredient> ingredientList = new ArrayList<>();

		ingredientList.add(new EspressoIngr(1));
		
		ingredients.setIngredients(ingredientList);		
		
	}

}
