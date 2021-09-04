package coffee.shop.ingredient;

public class HotWaterIngr implements Ingredient {

	private int quantity;
	private final String name = "sýcak su";
	
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
