package com.techelevator.view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import superclasses.Candy;

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
		sut = sut.setName("bob");
	}

}
