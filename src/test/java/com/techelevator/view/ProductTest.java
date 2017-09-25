package com.techelevator.view;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import supersuperclass.Product;

public class ProductTest  {
	

	

	

	
	

	@Test
	public void testProduct() {
		Product product=getProduct("Tootsie Roll",new BigDecimal("1.00"),1);
		String name=("Tootsie Roll");
		String answer=product.getName();
		BigDecimal result = new BigDecimal("1.00");
		BigDecimal expected = product.getPrice();
		int num=1;
		int q=product.getQuantity();
		assertEquals(name,answer);
		assertEquals(result,expected);
		assertEquals(num,q);
	}
	private Product getProduct(String string, BigDecimal decimal, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testGetSound() {
		
	}
//	@Test
//	public void takes_a_decimal() {
//		Menu menu = getMenuForTestingWithUserInput("4.55\n");
//		BigDecimal expected = new BigDecimal("4.55");
//
//		BigDecimal result = menu.getDecimalFromUser("please enter");
//
//		Assert.assertEquals(expected, result);
//	}

}
