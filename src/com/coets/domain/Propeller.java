package com.coets.domain;

public class Propeller {
	
	protected int[] power;
	
	public Propeller() {}
	
	//FASE 1
	public Propeller(int propellers) {
		this.power=new int[propellers];
		for(int i=0;i<propellers;i++) {
			this.power[i]=0;
		}
	}
	
	//FASE 2
	public Propeller(int propellers, int[] power){
		if(power!=null) {
			this.power=new int[propellers];
			for(int i=0;i<power.length;i++) {
				this.power[i]=power[i];			
			}
			if (propellers>power.length+1) {
				for(int i=power.length;i<propellers;i++) {
					this.power[i]=0;			
				}			
			}		
		}
	}
	
	//FASE 3
	public Propeller(int[] power) {
		this.power=new int[power.length];
		for(int i=0;i<power.length;i++) {
			this.power[i]=0;			
		}		
	}
	
	public int[] getPower() {		
		return this.power;
	}
	
	public void setPower(int[] power) {
		this.power=power;
	}
	
	public void upPower(int up) {
		int[] power=this.getPower();
		for(int i=0;i<power.length;i++) {
			power[i] +=10;
		}
		this.setPower(power);
	}
	
	public void downPower(int down) {
		int[] power=this.getPower();
		for(int i=0;i<power.length;i++) {
			if (power[i]<10) {
				power[i]=0;
			}else{
				power[i] -=10;
			}			
		}
		this.setPower(power);
	}
}
