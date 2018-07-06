package com.coets.domain;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
	
	protected String codi;
	protected List<Propeller> propeller;
	
	public Rocket() {}

	//FASE 1
//	public Rocket(String codi, int propellers) {
//		this.codi=codi;
//		this.propeller= new ArrayList<>();
//		for (int i=0;i<propellers;i++) {
//			this.propeller.add(new Propeller());
//		}
//	}
	
	//FASE 2 y FASE 3
	public Rocket(String codi) {
		this.codi=codi;
		this.propeller= new ArrayList<>();	
	}	
	
	public void addPropeller(int maxPower) {
		this.propeller.add(new Propeller(maxPower));
	}
	
	public String getCodi() {
		return codi;
	}
	public void setCodi(String codi) {
		this.codi = codi;
	}
	public ArrayList<Propeller> getPropeller() {
		return (ArrayList<Propeller>) this.propeller;
	}
	
	public void changeSpeed (int speed) {
		//System.out.println("Rocket: " + this.getCodi());
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
