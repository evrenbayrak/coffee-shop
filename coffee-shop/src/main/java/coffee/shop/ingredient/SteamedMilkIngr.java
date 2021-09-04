package coffee.shop.ingredient;

public class SteamedMilkIngr implements Ingredient {

	private int quantity;
	private final String name = "ısıtılmış süt";
	
	
	public SteamedMilkIngr() {
		super();
	}

	public SteamedMilkIngr(int quantity) {
		super();
		this.quantity = quantity;
	}

	@Override
	public String getMessage() {		
		return String.format("%d doz %s", quantity, name);
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

	@Override
	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		
	}
}
