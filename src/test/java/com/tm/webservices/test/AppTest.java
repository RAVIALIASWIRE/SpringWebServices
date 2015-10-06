package com.tm.webservices.test;

import java.util.Arrays;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.tm.webservices.services.App;

@RunWith(Parameterized.class)
public class AppTest {
	private int expected;
	private int a;
	private int b;
	
	public AppTest(int expected, int a, int b) {
		super();
		this.expected = expected;
		this.a = a;
		this.b = b;
	}

	@Parameters
	public static Collection<Integer[]> getCreditScore() {
		return Arrays.asList(new Integer[][] { { -1, 1, 2 }, { 1, 3, 2 }, { 3, 7, 4 }, { 4, 9, 5 }, });
	}
	
	@Test
	public void testPrintHelloWorld2() {
		System.out.println("a :"+a+" b :"+b);

		Assert.assertEquals(expected, App.getCreditScore(a, b));

	}
}