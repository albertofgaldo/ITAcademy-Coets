package com.coets.application;

import com.coets.domain.Propeller;
import com.coets.domain.Rocket;

public class RocketDTO {

	protected String codi;
	protected Propeller propellers;
	
	public RocketDTO(Rocket rocket) {
		this.codi=rocket.getCodi();
		//this.propellers.setPower(rocket.getPropellers());
	}
	
}
