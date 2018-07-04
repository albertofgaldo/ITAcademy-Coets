package com.coets.view;

import java.util.Scanner;
import com.coets.application.RocketController;

public class Main {
	
	private static RocketController cRocket = new RocketController();
	
	public static void main(String args[])throws Exception {				
		
		int[] powerR1={10,30,80};
		int[] powerR2={30,40,50,50,30,10};
		
		cRocket.createRocket("32WESSDS", 3, powerR1);
		cRocket.createRocket("LDSFJA32", 6, powerR2);		
		
		int opc=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("[1] Ver cohetes");
			System.out.println("[2] Aumentar velocidad");
			System.out.println("[3] Disminuir velocidad");
			System.out.println("[0] Salir");
			opc=Integer.parseInt(sc.nextLine());
		
			switch (opc) {
			case 1:				
				cRocket.showRockets();							
				break;
			case 2:
				cRocket.acelerateRocket();
				break;
			case 3:
				cRocket.brakeRocket();
				break;
			default:
			opc=0;
				break;
			}
		}while (opc!=0);
		
		sc.close();
		
	}
}
