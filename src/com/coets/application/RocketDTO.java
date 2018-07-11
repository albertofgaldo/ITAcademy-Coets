package com.coets.application;

import java.util.List;

import com.coets.domain.Propeller;
import com.coets.domain.Rocket;

public class RocketDTO {

	protected String codi;
	protected List<PropellerDTO> propellers;
		
	public RocketDTO(Rocket rocket) {
		this.codi=rocket.getCodi();
		this.addPropellerDTO(rocket);
	}
	
	public void addPropellerDTO(Rocket rocket) {
		for (Propeller p: rocket.getPropeller()) {
			propellers.add(new PropellerDTO(p));
		}
	}
	public String getCodi() {
		return this.codi;
	}
	
	public List<PropellerDTO> getPropellers(){
		return this.propellers;
	}
}


