package com.coets.application;

import java.util.List;

import com.coets.domain.Rocket;
import com.coets.persistance.RocketRepository;

public class RocketController {

		private RocketRepository rockets = new RocketRepository();
		
		public RocketController() {}
		
		//FASE 1
		public void createRocket(String codi, int propellers)throws Exception {
				Rocket rocket = new Rocket(codi, propellers);
				rockets.addRocket(rocket);				
		}
		
		//FASE 2
		public void createRocket(String codi, int propellers, int[] power)throws Exception {
			Rocket rocket = new Rocket(codi, propellers, power);
			rockets.addRocket(rocket);				
		}
		
		public List<Rocket> getAllRockets() {
			
			return rockets.getAllRockets();
		}
		
		public void showRockets() {
			int[] p;
			System.out.println("COHETES: \n");			
			for(Rocket rocket: rockets.getAllRockets()) {
				System.out.println("El codigo es: " + rocket.getCodi());				
				System.out.println("Propulsores: " + rocket.getPropellers().length);
				System.out.println("Potencia de propulsores:");
				p=rocket.getPropellers();
				for(int i=1;i<=rocket.getPropellers().length;i++) {
					System.out.println("Propulsor " + i + " potencia: "+ p[i-1]);				
				}
				System.out.println("\n");
			}
		}
		

		public void acelerateRocket() {
			for(Rocket rocket: rockets.getAllRockets()) {
				rocket.acelerate();
				System.out.println("Rocket " + rocket.getCodi() + "Acelerado");
			}
		}
		
		public void brakeRocket() {
			for(Rocket rocket: rockets.getAllRockets()) {
				rocket.brake();
				System.out.println("Rocket " + rocket.getCodi() + "Frenado");
			}
		}
		
		
}
