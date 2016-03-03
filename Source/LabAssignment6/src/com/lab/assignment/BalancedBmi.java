package com.lab.assignment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/balancebmi")
public class BalancedBmi {

	@GET
	@Path("/height/{height}")
	@Produces(MediaType.APPLICATION_XML)
	public String calculateweigth(@PathParam("height") Double h)
	{
		Double miw, maw;
		miw = 18.5 * (h *h);
		maw = 24.9 * (h * h);
		return "<BMICalculator>" + "<Height>" + h + "</Height>" + "<Weight>" + "<MinimumWeight>" + miw + "</MinimumWeight>" + "<MaximumWeight>" + maw + "</MaximumWeight>" + "</Weight>" + "</BMICalculator>";
	}
	
	@GET
	@Path("/weight/{weight}")
	@Produces(MediaType.APPLICATION_XML)
	public String calculateheight(@PathParam("weight") Double w)
	{
		Double mih, mah;
		mih = Math.sqrt(w/18.5);
		mah = Math.sqrt(w/24.9);
		return "<BMICalculator>" + "<Weight>" + w + "</Weight>" + "<Height>" + "<MinimumHeight>" + mah + "</MinimumHeight>" + "<MaximumHeight>" + mih + "</MaximumHeight>" + "</Height>" + "</BMICalculator>";
	}
}
