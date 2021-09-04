package coffee.shop.model;

import java.util.ArrayList;
import java.util.List;

import coffee.shop.constants.MessageConstants;
import coffee.shop.ingredient.HotWaterIngr;
import coffee.shop.ingredient.Ingredient;
import coffee.shop.ingredient.Ingredients;

public class HotWater implements Drink {
	
	private final int order = 7;
	private int price = 3;
	private Ingredients ingredients;
	private final String name = "Hot Water";
	
	@Override
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String getPrice() {
		return this.price + "₺";
	}

	/**
	 * Sıcak su kahve türevi olmadığı için bilgilendirme mesajı ayrı tanımlandı.
	 */
	@Override
	public String prepareOrderMessage() {
		return MessageConstants.DEFAULT_ORDER_MESSAGE;
	}
	
	@Override
	public void generateIngredients() {
		ingredients = new Ingredients();
		List<Ingredient> ingredientList = new ArrayList<>();
		
		Ingredient ingredient = new HotWaterIngr();		
		ingredient.setQuantity(5);
		ingredientList.add(ingredient);
		
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
