package com.techelevator.view;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techelevator.VendingMachine;

public class VendingMachineTest {
	private ByteArrayOutputStream output;
	 VendingMachine sut;
	

	@Before
	public void setUp()  {
		sut = new VendingMachine(null);
	}

	

	@Test
	public void test() {
		 sut=sut.addBalance(1);
		
	}
//	private Menu getMenuForTestingWithUserInput(String userInput) {
//		ByteArrayInputStream input = new ByteArrayInputStream(String.valueOf(userInput).getBytes());
//		return new Menu(input, output);
//	}
//
//	private Menu getMenuForTesting() {
//		return getMenuForTestingWithUserInput("1\n");
//	}

}
