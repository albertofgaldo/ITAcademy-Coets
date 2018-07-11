package com.coets.domain;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	
	protected String codi;
	protected List<Propeller> propeller;
	
	public Rocket() {}
	
	//FASE 2 y FASE 3
	public Rocket(String codi) {
		this.codi=codi;
		this.propeller= new ArrayList<>();	
	}	
	
	public void addPropeller(int maxPower)throws Exception {		
		this.propeller.add(new Propeller(maxPower));
	}
	
	public String getCodi() {
		return codi;
	}
	public void setCodi(String codi) {
		this.codi = codi;
	}
	public List<Propeller> getPropeller() {
		return this.propeller;
	}
	
	public void changeSpeed (int speed)throws Exception {
		for(Propeller p: this.getPropeller()) {			
			p.changeSpeed(speed);
		}		
		System.out.println("\n");
	}
	
	public int getSpeed() {
		int speed=0; 
		for(Propeller p :this.propeller) {
			speed += p.getPower();
		}
		return speed;
	}


}
