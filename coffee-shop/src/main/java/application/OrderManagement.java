package application;

import java.util.Optional;
import java.util.Scanner;

import coffee.shop.model.Drink;
import coffee.shop.util.DrinkListUtil;

public class OrderManagement {
	
	private DrinkListUtil drinkListUtil;
	
	public void init() {
		drinkListUtil = new DrinkListUtil();
		drinkListUtil.printDrinkOptions();
		int orderNo = getUserRequest();
		startOrderProcess(orderNo);
	}
	
	public int getUserRequest() {
		String userRequest = "Lütfen sipariş vermek istediğiniz içecek numarasını giriniz : ";
		int requestOrder;

		 try(Scanner scanner = new Scanner(System.in)){
			do {
				System.out.print(userRequest);
			    while (!scanner.hasNextInt()) {		       
			        scanner.next();
			        System.out.print("Sipariş verebilmek için sayısal ürün değeri girilmelidir : ");
			    }
			    requestOrder = scanner.nextInt();
			} while (isRequestOrderInRange(requestOrder));
		 }
		 return requestOrder;
	}
	
	public void startOrderProcess(int orderNo) {
		Optional<Drink> drink = drinkListUtil.getSelectedDrink(orderNo);
		if(drink.isPresent()) {
			System.out.println(drink.get().prepareOrderMessage());
		}
	}
	
	private boolean isRequestOrderInRange(int requestOrder) {
		return requestOrder < 0 || requestOrder > drinkListUtil.getDrinkList().size();
	}
	

}
