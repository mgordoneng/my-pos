package com.mycompany.app;

import junit.framework.Assert;
import org.junit.Test;


public class TerminalTest
{
	@Test
	public void caseOne() {
		Terminal testTerminal = new Terminal();
		//TODO set pricing


		testTerminal.scan("A");
		testTerminal.scan("B");
		testTerminal.scan("C");
		testTerminal.scan("D");
		testTerminal.scan("A");
		testTerminal.scan("B");
		testTerminal.scan("A");
		testTerminal.scan("A");

		Assert.assertEquals(32.40, testTerminal.result);
	}


	//@Test
	public void caseTwo() {
		Terminal testTerminal = new Terminal();
		//TODO set pricing

		//CCCCCCC

		testTerminal.scan("C");
		testTerminal.scan("C");
		testTerminal.scan("C");
		testTerminal.scan("C");
		testTerminal.scan("C");
		testTerminal.scan("C");

		Assert.assertEquals(7.25, testTerminal.result);
	}

	//@Test
	public void caseThree() {
		Terminal testTerminal = new Terminal();
		//TODO set pricing

		testTerminal.scan("A");
		testTerminal.scan("B");
		testTerminal.scan("C");
		testTerminal.scan("D");

		Assert.assertEquals(15.40, testTerminal.result);
	}


}
