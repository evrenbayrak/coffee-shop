package coffee.shop.ingredient;

public class EspressoIngr implements Ingredient {

	private int quantity;
	private final String name = "espresso";
	
	
	public EspressoIngr() {
		super();
	}

	public EspressoIngr(int quantity) {
		super();
		this.quantity = quantity;
	}
	
	@Override
	public String getMessage() {		
		return String.format("%d doz %s", quantity, name);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return this.quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
