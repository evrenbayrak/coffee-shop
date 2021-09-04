package coffee.shop.model;

import coffee.shop.ingredient.Ingredients;

public class Espresso implements Drink {

	private final int order = 1;
	private int price = 7;
	private Ingredients ingredients;
	private final String name = "Espresso";
	
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
		// TODO Auto-generated method stub
		return this.price + "₺";
	}

	@Override
	public final String prepareOrderMessage() {
		// TODO Auto-generated method stub
		return "Teşekkürler kahveniz hazırlanıyor.";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
