package coffee.shop.ingredient;

public class EspressoIngr implements Ingredient {

	private int quantity;
	private final String name = "espresso";
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

}
