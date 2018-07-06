package com.coets.domain;

public class Propeller {
	
	protected int power;
	protected int maxPower;
	
	public Propeller() {
		this.power=0;
		this.maxPower=0;
	}
	
	public Propeller(int maxPower){
		this.power=0;
		this.maxPower=maxPower;
	}
	
	public int getPower() {		
		return this.power;
	}
	
	public void setPower(int power) {
		this.power=power;
	}
	
	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower) {
		this.maxPower = maxPower;
	}
	
	public void changeSpeed(int speed) {
		if(((this.power + speed) <= this.maxPower && speed > 0) || ((this.power + speed) >=0 && speed < 0)){
			this.power +=speed;			
		}
	}
	
}
