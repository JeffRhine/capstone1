package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.exceptions.SoldOutException;
import com.techelevator.supersuperclass.Product;
import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };
	private static final String PURCHASE_MENU_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select a Product";
	private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCAHSE_MENU_OPTIONS = { PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION }; 
	
	private Menu menu;
	private VendingMachine vm;
	private Change changeReturned = new Change();
	private LogWriter lw = new LogWriter();
	
	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}
	
	public void run() {
		vm = new VendingMachine(new ItemReader().loadInventory());
		while(true) {
			String choice = (String)menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			
			if(choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
	
				showInventory(vm.getInventory());
					
				
			} else if(choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				while(true) {
					System.out.println("");
					System.out.println("Current money provided: $" + vm.getBalance());
					String choice2 = (String)menu.getChoiceFromOptions(PURCAHSE_MENU_OPTIONS);
					
					if(choice2.equals(PURCHASE_MENU_FEED_MONEY)) {
						BigDecimal userInput = menu.getDecimalFromUser("Please enter $1, $2, $5, or $10");
						if(userInput.equals(new BigDecimal("1")) || userInput.equals(new BigDecimal("2")) || userInput.equals(new BigDecimal("5")) || userInput.equals(new BigDecimal("10"))) {
							userInput.setScale(2);
							vm.feedMoney(userInput);
						} else {
							System.out.println("Please enter a valid dollar amount.");
						}
					}
					if(choice2.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
						
						showInventory(vm.getInventory());
						
						System.out.println("Please make a selection from the options >>> ");
						Scanner userChoice = new Scanner (System.in);
						String line = userChoice.nextLine().toUpperCase();
						try {
							vm.purchase(line);
						} catch (SoldOutException e) {
							System.out.println("That item is sold out.");
						}	
						
								
					}
					if(choice2.equals(PURCHASE_MENU_FINISH_TRANSACTION)) {
						changeReturned.change(vm.getBalance());
						System.out.println(changeReturned.toString());
						vm.change(new BigDecimal("0.00"));
						vm.removeBalance();

						for(String sound: vm.getSoundArray()){
//							System.out.println(" ");
							System.out.print(sound);
						}

						break;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
	
	private void showInventory(Map<String, Product>  inventory) {
		for(Map.Entry<String, Product> entry : inventory.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue().getName() + " " + entry.getValue().getPrice() + " " + entry.getValue().getQuantity());
		}
	}
	
}
