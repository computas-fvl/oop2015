package com.computas.booster2014;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

import org.junit.Test;

public class ExampleUnitTest {
	private static final int[] ZERO = new int[] { 0 };
	private static final int[] ONE = new int[] { 1 };
	private static final int[] ZERO_ONE = new int[] { 0, 1 };

	private Example instance;

	@Before
	public void setup() {
		instance = new Example();
	}

	@Test
	public void aZeroMustHaveMax0() {
		assertEquals(instance.max(ZERO), 0);
	}

	@Test
	public void aOneMustHaveMax1() {
		assertEquals(instance.max(ONE), 1);
	}

	@Test
	public void aZeroAndOneMustHaveMax1() {
		assertEquals(instance.max(ZERO_ONE), 1);
	}

}
