package coffee.shop.model;

import java.util.ArrayList;
import java.util.List;

import coffee.shop.ingredient.EspressoIngr;
import coffee.shop.ingredient.HotWaterIngr;
import coffee.shop.ingredient.Ingredient;
import coffee.shop.ingredient.Ingredients;

public class Americano extends Espresso implements Drink {
	
	private final int order = 6;
	private int price = 10;
	private Ingredients ingredients;
	private final String name = "Americano";
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
		
	}
	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return this.price + "₺";
	}
	
	@Override
	public void generateIngredients() {
		ingredients = new Ingredients();
		List<Ingredient> ingredientList = new ArrayList<>();
		
		ingredientList.add(new EspressoIngr(1));
		ingredientList.add(new HotWaterIngr(4));
		
		ingredients.setIngredients(ingredientList);		
		
	}

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

}
