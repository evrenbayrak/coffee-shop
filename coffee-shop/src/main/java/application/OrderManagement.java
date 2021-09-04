package application;

import java.util.Optional;
import java.util.Scanner;

import coffee.shop.constants.MessageConstants;
import coffee.shop.model.Drink;
import coffee.shop.util.DrinkListUtil;

public class OrderManagement {
	
	public DrinkListUtil drinkListUtil;
	
	/**
	 * Uygulamanın başlangıç gereksinimlerini tanımlar. tüm süreçte tek nesne üzerinden içecek ve tarif bilgilerini yönetir.
	 */
	public void init() {
		drinkListUtil = new DrinkListUtil();
		drinkListUtil.generateIngredients();
		drinkListUtil.printDrinkOptions();
		int orderNo = getUserRequest();
		startOrderProcess(orderNo);
	}
	
	/**
	 * Kullanıcıdan içecek numarasını seçmesini bekler, hatalı karakter veya aralık dışı seçimlerde tekrar seçim yapılması beklenir.
	 */
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
			} while (isRequestOrderNotInRange(requestOrder));
		 }
		 return requestOrder;
	}
	
	/**
	 * Sipariş seçildikten sonra üretim metodları çağrılır. Kullanıcıya bilgilendirme mesajı verilir.
	 */
	public void startOrderProcess(int orderNo) {
		//seçilen sipariş numarasına karşılık tanımlı içecek nesnesini bulur.
		Optional<Drink> drink = drinkListUtil.getSelectedDrink(orderNo);
		
		if(drink.isPresent()) {
			System.out.println(drink.get().prepareOrderMessage());
			System.out.print(String.format("%s seçtiniz.", drink.get().getName()));
			System.out.print(drink.get().getIngredients().getDetailMessage());
			System.out.println(MessageConstants.ORDER_COMPLETED);
		}
		else {
			System.out.println(MessageConstants.DRINK_NOT_FOUND);
		}
	}
	
	/**
	 * Kullanıcının girdiği input değeri mevcut ürün listesi için uygun aralıkta mı kontrol eder.
	 */
	public boolean isRequestOrderNotInRange(int requestOrder) {
		return requestOrder < 0 || requestOrder > drinkListUtil.getDrinkList().size();
	}
	

}
