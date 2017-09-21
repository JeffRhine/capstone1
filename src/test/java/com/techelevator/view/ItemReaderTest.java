package com.techelevator.view;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.techelevator.ItemReader;

public class ItemReaderTest {

	ItemReader sut;
	
	@Before
	public void setUp() {
		sut = new ItemReader();
	}
	
	@Test
	public void testFile() {
		File products = new File("vendingmachine.csv");
		assertEquals(products, new File("vendingmachine.csv"));
	}
}
