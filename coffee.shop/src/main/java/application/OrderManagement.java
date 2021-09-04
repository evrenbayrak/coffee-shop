package application;

import java.util.Scanner;

import coffee.shop.util.DrinkListUtil;

public class OrderManagement {
	
	private DrinkListUtil drinkListUtil;
	
	public void init() {
		drinkListUtil = new DrinkListUtil();
		drinkListUtil.printDrinkOptions();
		getUserRequest();
	}
	
	public void getUserRequest() {
		String userRequest = "Lütfen sipariş vermek istediğiniz içecek numarasını giriniz : ";
		int requestOrder;

		 try(Scanner scanner = new Scanner(System.in)){
			do {
			    System.out.print(userRequest);
			    while (!scanner.hasNextInt()) {
			        System.out.println("Sipariş verebilmek için sayısal ürün değeri girilmelidir.");
			        scanner.next(); // this is important!
			    }
			    requestOrder = scanner.nextInt();
			} while (isRequestOrderInRange(requestOrder));
		 }

	}
	
	public boolean isRequestOrderInRange(int requestOrder) {
		return requestOrder < 0 || requestOrder > drinkListUtil.getDrinkList().size();
	}
	
}
