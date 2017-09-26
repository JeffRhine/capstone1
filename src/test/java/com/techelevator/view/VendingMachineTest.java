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
	 VendingMachine sut;
	

	@Before
	public void setUp()  {
		sut = new VendingMachine(null);
	}

	

	@Test
	public void testFeedMoney() {
		 sut.feedMoney(new BigDecimal("1"));
		assertEquals(new BigDecimal("1.00"), sut.getBalance());
	}
	
	@Test
	public void testFeedMoneyMultiple() {
		 sut.feedMoney(new BigDecimal("1"));
		 sut.feedMoney(new BigDecimal("1"));
		assertEquals(new BigDecimal("2.00"), sut.getBalance());
	}


}
