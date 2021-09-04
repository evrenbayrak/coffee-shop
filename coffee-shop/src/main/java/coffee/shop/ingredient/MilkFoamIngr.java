package coffee.shop.ingredient;

public class MilkFoamIngr implements Ingredient {

	private int quantity;
	private final String name = "süt köpüğü";
	
	public MilkFoamIngr() {
		super();
	}

	public MilkFoamIngr(int quantity) {
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
