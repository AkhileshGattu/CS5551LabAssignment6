package com.lab.assignment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bmicalculator")
public class BMICalculator {

	@GET
	@Path("/bmi/{height}/{weight}")
	@Produces(MediaType.APPLICATION_XML)
	public String calculateheight(@PathParam("height") Double h,@PathParam("weight") Double w)
	{
		Double bmi;
		bmi = w/(h * h);
		return "<BMICalculator>" + "<Weight>" + w + "</Weight>" + "<Height>" + h + "</Height>" + "<BMIValue>" + bmi + "</BMIValue>" + "</BMICalculator>";
	}
}
