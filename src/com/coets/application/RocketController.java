package com.coets.application;

import java.util.List;

import com.coets.domain.Propeller;
import com.coets.domain.Rocket;
import com.coets.persistance.RocketRepository;

public class RocketController {

		private RocketRepository rockets = new RocketRepository();
		
		public RocketController() {}
		
		//FASE 1
//		public void createRocket(String codi, int propellers)throws Exception {
//				Rocket rocket = new Rocket(codi, propellers);
//				rockets.addRocket(rocket);				
//		}		
//		
		//FASE 2 y FASE 3
		public void createRocket(String codi)throws Exception {
			Rocket rocket = new Rocket(codi);	
			rockets.addRocket(rocket);	
		}
		
		public void addPropeller(String codi, int maxPower) {
			for(Rocket r: this.getAllRockets()) {
				if(r.getCodi()==codi) {
					r.addPropeller(maxPower);
				}
			}			
		}
		
		public List<Rocket> getAllRockets() {
			
			return rockets.getAllRockets();
		}
		
		public void showRockets() {			
			System.out.println("COHETES: \n");			
			for(Rocket rocket: rockets.getAllRockets()) {
				int pos=1;
				System.out.println("El codigo es: " + rocket.getCodi());				
				System.out.println("Propulsores: " + rocket.getPropeller().size());
				System.out.println("Potencia de propulsores:");				
				for(Propeller p: rocket.getPropeller()) {
					System.out.println("Propulsor " + pos + " potencia actual: "+ p.getPower() + " potencia máxima: "+ p.getMaxPower());
					pos++;
				}
				System.out.println("\n");
			}
		}		

		public void acelerateRocket() {
			for(Rocket rocket: rockets.getAllRockets()) {
				rocket.changeSpeed(10);
			}
		}
		
		public void brakeRocket() {
			for(Rocket rocket: rockets.getAllRockets()) {
				rocket.changeSpeed(-10);
			}
		}
		
		public void showSpeed() {
			for(Rocket rocket: rockets.getAllRockets()) {
				System.out.println("Rocket: " + rocket.getCodi() + " velocidad: " + rocket.getSpeed());
				
			}
		}
		
		
}
