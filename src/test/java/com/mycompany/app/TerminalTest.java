package com.mycompany.app;

import junit.framework.Assert;
import org.junit.Test;


public class TerminalTest {
	@Test
	public void caseOne() {
		Terminal testTerminal = new Terminal();

		testTerminal.setPricing("A", new PriceUnit(2, 4, 7));
		testTerminal.setPricing("B", new PriceUnit(12, 0, 0));
		testTerminal.setPricing("C", new PriceUnit(1.25, 6, 6));
		testTerminal.setPricing("D", new PriceUnit(0.15, 0, 0));

		testTerminal.scan("A");
		testTerminal.scan("B");
		testTerminal.scan("C");
		testTerminal.scan("D");
		testTerminal.scan("A");
		testTerminal.scan("B");
		testTerminal.scan("A");
		testTerminal.scan("A");

		Assert.assertEquals(32.40, testTerminal.total);
	}


	@Test
	public void caseTwo() {
		Terminal testTerminal = new Terminal();

		testTerminal.setPricing("A", new PriceUnit(2, 4, 7));
		testTerminal.setPricing("B", new PriceUnit(12, 0, 0));
		testTerminal.setPricing("C", new PriceUnit(1.25, 6, 6));
		testTerminal.setPricing("D", new PriceUnit(0.15, 0, 0));

		//CCCCCCC

		testTerminal.scan("C");
		testTerminal.scan("C");
		testTerminal.scan("C");
		testTerminal.scan("C");
		testTerminal.scan("C");
		testTerminal.scan("C");
		testTerminal.scan("C");

		Assert.assertEquals(7.250, testTerminal.total);
	}

	@Test
	public void caseThree() {
		Terminal testTerminal = new Terminal();

		testTerminal.setPricing("A", new PriceUnit(2, 4, 7));
		testTerminal.setPricing("B", new PriceUnit(12, 0, 0));
		testTerminal.setPricing("C", new PriceUnit(1.25, 6, 6));
		testTerminal.setPricing("D", new PriceUnit(0.15, 0, 0));

		testTerminal.scan("A");
		testTerminal.scan("B");
		testTerminal.scan("C");
		testTerminal.scan("D");

		Assert.assertEquals(15.40, testTerminal.total);
	}


}
