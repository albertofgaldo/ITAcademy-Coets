package com.coets.application;

import java.util.ArrayList;

import com.coets.domain.Propeller;
import com.coets.domain.Rocket;

public class PropellerDTO {

	protected int power;
	protected int maxPower;
		
	public PropellerDTO(Propeller propeller) {
		this.power=propeller.getPower();
		this.maxPower=propeller.getMaxPower();
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int maxPower() {
		return this.maxPower;
	}
}


