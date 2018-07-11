package com.coets.domain;

public class Propeller {
	
	protected int power;
	protected int maxPower;
	
	public Propeller() {
		this.power=0;
		this.maxPower=0;
	}
	
	public Propeller(int maxPower)throws Exception{
		if(maxPower<0)throw new Exception();
		this.maxPower=maxPower;		
		this.power=0;		
	}
	
	public int getPower() {		
		return this.power;
	}
	
	
	public int getMaxPower() {
		return maxPower;
	}

	public void setMaxPower(int maxPower)throws Exception {
		if(maxPower<0)throw new Exception();
		this.maxPower = maxPower;
	}
	
	public void changeSpeed(int speed)throws Exception {
		if(speed>this.getMaxPower())throw new Exception();
	
		if(this.getPower()+speed > this.getMaxPower()) {
				this.power=this.getMaxPower();
		}else if(this.getPower()+speed < 0)  {
				this.power=0;
		}else {
			this.power+=speed;
		}		
	}
	
}
