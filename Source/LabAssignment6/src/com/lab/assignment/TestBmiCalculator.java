package com.lab.assignment;

public class TestBmiCalculator {

	Double bmi = 0.0;
	Double hei = 0.0;
	Double wei = 0.0;
	public Double TestBmi(Double h, Double w)
	{
		bmi = w/(h*h);
		return bmi;
	}
	public Double TestHeight(Double w)
	{
		hei = Math.sqrt(w/18.5);
		return hei;
	}
	public Double TestWeight(Double h)
	{
		wei = 18.5 * (h * h);
		return wei;
	}
	
}
