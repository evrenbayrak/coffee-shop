package coffee.shop.ingredient;

import java.util.Iterator;
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
		StringBuilder sb = new StringBuilder();
		sb.append("Bu içeceğimiz ");	
		Iterator<Ingredient> iterator = ingredients.iterator();
		
		while(iterator.hasNext()) {
			sb.append(iterator.next().getMessage());
			if(iterator.hasNext()) {
				sb.append(" ve ");
			}
		}
		sb.append(" içermektedir. ");
		detailMessage = sb.toString();
		return detailMessage;		
	}
	
	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}
	
	
}
