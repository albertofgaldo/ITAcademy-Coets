package com.coets.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.coets.application.PropellerDTO;
import com.coets.application.RocketController;
import com.coets.application.RocketDTO;
import com.coets.domain.Propeller;
import com.coets.domain.Rocket;

public class Main {
	
	private static RocketController cRocket = new RocketController();
	
	
	public static void main(String args[])throws Exception {				
		
		//FASE 1
//		cRocket.createRocket("32WESSDS", 3);
//		cRocket.createRocket("LDSFJA32", 6);		
		
		//FASE 2 Y FASE 3
		
		cRocket.createRocket("32WESSDS");		
		cRocket.addPropeller("32WESSDS", 10);
		cRocket.addPropeller("32WESSDS", 30);
		cRocket.addPropeller("32WESSDS", 80);
		
		cRocket.createRocket("LDSFJA32");
		cRocket.addPropeller("LDSFJA32", 30);
		cRocket.addPropeller("LDSFJA32", 40);
		cRocket.addPropeller("LDSFJA32", 50);
		cRocket.addPropeller("LDSFJA32", 50);
		cRocket.addPropeller("LDSFJA32", 30);
		cRocket.addPropeller("LDSFJA32", 10);
		
		List<RocketDTO>rocketsDTO = new ArrayList<>();		
		rocketsDTO.add(cRocket.getRocket("32WESSDS"));
		rocketsDTO.add(cRocket.getRocket("LDSFJA32"));
		
		int opc=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n");
			System.out.println("[1] Ver cohetes");
			System.out.println("[2] Aumentar velocidad");
			System.out.println("[3] Disminuir velocidad");
			System.out.println("[4] Ver velocidad de los cohetes");
			System.out.println("[0] Salir");
			opc=Integer.parseInt(sc.nextLine());
		
			switch (opc) {
			case 0:
				opc=-1;
				break;
			case 1:						
				
				System.out.println("COHETES: \n");			
				for(RocketDTO rocket: rocketsDTO) {
					int pos=1;
					System.out.println("El codigo es: " + rocket.getCodi());				
					System.out.println("Propulsores: " + rocket.getPropellers().size());
					System.out.println("Potencia de propulsores:");				
					for(PropellerDTO p: rocket.getPropellers()) {
						System.out.println("Propulsor " + pos + " potencia actual: "+ p.getPower() + " potencia máxima: "+ p.maxPower());
						pos++;
					}
					System.out.println("\n");
				}
				break;
			case 2:
				cRocket.acelerateRocket();
				break;
			case 3:
				cRocket.brakeRocket();
				break;
			case 4:
				cRocket.showSpeed();
				break;
			}
		}while (opc!=-1);
		
		sc.close();
		
	}
}
