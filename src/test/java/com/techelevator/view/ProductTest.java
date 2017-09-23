package com.techelevator.view;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import supersuperclass.Product;

public class ProductTest extends Product {
	

	public ProductTest(String name, BigDecimal price, Integer quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	static Product sut;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testName() {
		super.setName("Tootsie Roll");
		assertEquals("Tootsie Roll",name);
	}

	@Override
	public char[] getSound() {
		// TODO Auto-generated method stub
		return null;
	}

}
