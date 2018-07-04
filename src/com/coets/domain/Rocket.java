package com.coets.domain;

public class Rocket {
	
	protected String codi;
	protected Propeller propellers;
	
	//protected int speed;
	
	public Rocket() {}

	//FASE 1
	public Rocket(String codi, int propellers) {
		this.codi=codi;
		this.propellers= new Propeller(propellers);
	}
	
	//FASE 2
	public Rocket(String codi, int propellers, int[] power) {
		this.codi=codi;
		this.propellers= new Propeller(propellers, power);		
	}
	
	public String getCodi() {
		return codi;
	}
	public void setCodi(String codi) {
		this.codi = codi;
	}
	
	public int[] getPropellers() {
		return this.propellers.getPower();
	}
	
	public void setPropellers(Propeller propellers) {
		this.propellers = propellers;
	}

	
	public void acelerate () {
		this.propellers.upPower(10);
	}
	
	public void brake () {
		this.propellers.downPower(10);
	}	
	
	public int getSpeed() {
		int speed=0; 
		for(int p :this.propellers.getPower()) {
			speed +=p;
		}
		return speed;
	}

}
