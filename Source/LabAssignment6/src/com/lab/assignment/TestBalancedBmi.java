package com.lab.assignment;

import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class TestBalancedBmi {

	TestBmiCalculator tbmi = new TestBmiCalculator();
	Double abmi = 24.97;
	Double ebmi = tbmi.TestBmi(1.65,68.0);
	Double ahei = 1.92, ehei = tbmi.TestHeight(68.0);
	Double awei = 50.37, ewei = tbmi.TestWeight(1.65);
	DecimalFormat f = new DecimalFormat("##.00");
	String sbmi = f.format(ebmi);
	String shei = f.format(ehei);
	String swei = f.format(ewei);
	Double cbmi = Double.parseDouble(sbmi);
	Double chei = Double.parseDouble(shei);
	Double cwei = Double.parseDouble(swei);
	
	@Test
	public void test() {
		
		System.out.println("@Test TestHeight(68): " + chei + " = " + ahei);
		assertEquals(ahei, chei);
		//assertEquals(abmi, cbmi);
		//assertEquals(awei, cwei);
	}

}
