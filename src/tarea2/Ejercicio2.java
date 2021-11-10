package tarea2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un año (entre 1801-2100):" );
		int anyo = sc.nextInt();
		
		if(anyo < 1801 || anyo > 2100) {
			System.out.println("El año introducido no es válido");
		}else {
			String siglo;
			int anyosDiferencia = 2021 - anyo;
			String mensajeDiferencia = "El año introducido es anterior al actual. Han pasado "+anyosDiferencia+" años";
			if(anyo < 1901) {
				siglo = "XIX";
			}else if(anyo < 2001) {
				siglo = "XX";
			}else {
				siglo = "XXI";
				if(anyo == 2021) {
					anyosDiferencia = 0;
					mensajeDiferencia = "El año introducido coincide con el actual";
				}else {
					anyosDiferencia = anyo - 2021;
					mensajeDiferencia = "El año introducido es posterior al actual. Faltan "+anyosDiferencia+" años";
				}
			}
			
			
			System.out.println(mensajeDiferencia);
			System.out.println("El año pertenece al siglo "+siglo);
		}
		
		sc.close();
		
	}
	
}
