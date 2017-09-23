package com.techelevator.view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techelevator.LogWriter;

public class LogWriterTest {
	static LogWriter  sut;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sut = new LogWriter();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
