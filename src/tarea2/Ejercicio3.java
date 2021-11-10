package tarea2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca número (1-7, 10-12): ");
		int numero = sc.nextInt();
		int valor;
		switch(numero) {
		case 1:
			valor = 11;
			break;
		case 3:
			valor = 10;
			break;
		case 10:
			valor = 2;
			break;
		case 11:
			valor = 3;
			break;
		case 12:
			valor = 4;
			break;
		case 2:
		case 4:
		case 5:
		case 6:
		case 7:
			valor = 0;
			break;
		default:
			valor = -1;
		}
		
		System.out.println("El valor del naipe con ese número es: "+valor);
		
		sc.close();
		
	}
	
}
