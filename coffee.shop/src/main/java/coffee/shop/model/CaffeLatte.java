package coffee.shop.model;

import coffee.shop.ingredient.Ingredients;

public class CaffeLatte extends Espresso implements Drink {
	
	private final int order = 4;
	private int price = 12;
	private Ingredients ingredients;
	private final String name = "Caffe Latte";
	
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
