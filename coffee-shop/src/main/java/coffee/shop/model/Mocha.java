package coffee.shop.model;

import java.util.ArrayList;
import java.util.List;

import coffee.shop.ingredient.EspressoIngr;
import coffee.shop.ingredient.HotChocolateIngr;
import coffee.shop.ingredient.Ingredient;
import coffee.shop.ingredient.Ingredients;
import coffee.shop.ingredient.MilkFoamIngr;
import coffee.shop.ingredient.SteamedMilkIngr;

public class Mocha extends Espresso implements Drink {
	
	private final int order = 5;
	private int price = 13;
	private Ingredients ingredients;
	private final String name = "Mocha";
	
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
		ingredientList.add(new SteamedMilkIngr(1));
		ingredientList.add(new MilkFoamIngr(1));
		ingredientList.add(new HotChocolateIngr(2));
		
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
