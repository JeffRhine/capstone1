package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import superclasses.Candy;
import superclasses.Chips;
import superclasses.Drinks;
import superclasses.Gum;
import supersuperclass.Product;

public class ItemReader {
	List<String> productList = new ArrayList<>();
	Map<String, Product> productMap = new TreeMap<>();
	File products = new File("vendingmachine.csv");
	
	public Map<String, Product> loadInventory () {
	try(Scanner readProducts = new Scanner(products)) {
		while(readProducts.hasNextLine()) {	
			String line = readProducts.nextLine();
			String [] parts = line.split("\\|");
			if(parts[0].contains("A")) {
				BigDecimal thePrice = new BigDecimal(parts[2]);
				productMap.put(parts[0] , new Chips (parts[1], thePrice, new Integer("5")));
			} else if(parts[0].contains("B")) {
				BigDecimal thePrice = new BigDecimal(parts[2]);
				productMap.put(parts[0] , new Candy (parts[1], thePrice, new Integer("5"))); 
			} else if(parts[0].contains("C")) {
				BigDecimal thePrice = new BigDecimal(parts[2]);
				productMap.put(parts[0] , new Drinks (parts[1], thePrice, new Integer("5"))); 
			} else if(parts[0].contains("D")) {
				BigDecimal thePrice = new BigDecimal(parts[2]);
				productMap.put(parts[0] , new Gum (parts[1], thePrice, new Integer("5"))); 
			} 
		}
		} catch(FileNotFoundException e) {
			System.out.println("This is not a file. Please try again.");
		}
		return productMap;
	}
	
}
