package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import supersuperclass.Product;

public class ItemReader {
	List<String> productList = new ArrayList<>();
	File products = new File("vendingmachine.csv");
	Map<String, List<String>> productMap = new HashMap<>();
	
	public void productItems () {
	try(Scanner readProducts = new Scanner(products)) {
			String line = readProducts.nextLine();
			String [] parts = line.split("\\|");
			for(int i = 0; i < 5; i++) {
				productList.add(parts[0]);
				productList.add(parts[1]);
				productList.add(parts[2]);
				
				productMap.put(parts[0], productList);
			} 
			
		} catch(FileNotFoundException e) {
			System.out.println("This is not a file. Please try again.");
		}
	}
}
