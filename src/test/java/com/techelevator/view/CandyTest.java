package com.techelevator.view;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import com.techelevator.superclasses.Candy;

import junit.framework.Assert;

public class CandyTest {
	static Candy sut;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sut = new Candy(null, null, 0);
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCandy() {
		sut = new Candy("poprocks", new BigDecimal("1"), 6);
		assertEquals("poprocks", sut.getName());
		assertEquals(new BigDecimal("1"), sut.getPrice());
		assertEquals(6, sut.getQuantity());
	}
	@Test
	public void testCandyQuantity() {
		sut = new Candy("poprocks", new BigDecimal("1"), 6);
		sut.decrimentQuantity();
		sut.decrimentQuantity();
		assertEquals(4, sut.getQuantity());
	}
}
