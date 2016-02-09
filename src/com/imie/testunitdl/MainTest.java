package com.imie.testunitdl;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 2;
		int b = 3;
		int c = 5;
		
		MainClass main = new MainClass();
		/**Assert.assert.*/
		int r = main.add(a, b);
		Assert.assertEquals(r, c);
		
				
	}
	
	@Test
	public void multi() {
		int a = 2;
		int b = 3;
		int c = 6;
		
		MainClass main = new MainClass();
		/**Assert.assert.*/
		int r = main.multi(a, b);
		Assert.assertEquals(r, c);
	}

}
