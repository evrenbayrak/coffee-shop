package coffee.shop.ingredient;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {

	private List<Ingredient> ingredients;
	private String detailMessage;
	
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public String getDetailMessage() {
		return detailMessage;
	}
	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}
	
	
}
