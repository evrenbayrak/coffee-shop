package coffee.shop.model;

import coffee.shop.ingredient.Ingredients;

public class HotWater implements Drink {
	
	private final int order = 7;
	private int price = 3;
	private Ingredients ingredients;
	private final String name = "Hot Water";
	
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
	public String prepareOrderMessage() {
		// TODO Auto-generated method stub
		return "Teşekkürler siparişiniz hazırlanıyor.";
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
