package coffee.shop.ingredient;

public class SteamedMilkIngr implements Ingredient {

	private int quantity;
	private final String name = "�s�t�lm�� s�t";
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}
}
