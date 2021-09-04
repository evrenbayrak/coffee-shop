package application;

import java.util.Optional;
import java.util.Scanner;

import coffee.shop.constants.MessageConstants;
import coffee.shop.model.Drink;
import coffee.shop.util.DrinkListUtil;

public class OrderManagement {
	
	private DrinkListUtil drinkListUtil;
	
	public void init() {
		drinkListUtil = new DrinkListUtil();
		drinkListUtil.generateIngredients();
		drinkListUtil.printDrinkOptions();
		int orderNo = getUserRequest();
		startOrderProcess(orderNo);
	}
	
	public int getUserRequest() {
		String userRequest = MessageConstants.USER_REQUEST;
		int requestOrder;

		 try(Scanner scanner = new Scanner(System.in)){
			do {
				System.out.print(userRequest);
			    while (!scanner.hasNextInt()) {		       
			        scanner.next();
			        System.out.print(MessageConstants.USER_WRONG_INPUT);
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
			System.out.print(String.format("%s seçtiniz.", drink.get().getName()));
			System.out.print(drink.get().getIngredients().getDetailMessage());
			System.out.println(MessageConstants.ORDER_COMPLETED);
		}
	}
	
	private boolean isRequestOrderInRange(int requestOrder) {
		return requestOrder < 0 || requestOrder > drinkListUtil.getDrinkList().size();
	}
	

}
