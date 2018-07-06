package com.coets.view;

import java.util.Scanner;
import com.coets.application.RocketController;

public class Main {
	
	private static RocketController cRocket = new RocketController();
	//private static List<Rocket> rockets = new ArrayList<>();
	
	
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
				opc=0;
				break;
			case 1:				
				cRocket.showRockets();							
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
			default:
				opc=9;
				break;
			}
		}while (opc!=0);
		
		sc.close();
		
	}
}
