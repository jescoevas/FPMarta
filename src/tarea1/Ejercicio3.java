package tarea1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número entero: ");
		Integer numero = sc.nextInt();
		
		System.out.println("Distinto de 0: "+(numero != 0));
		System.out.println("Negativo: "+(numero < 0));
		System.out.println("Entre 0 y 10, ambos incluidos: "+ (numero >= 0 && numero <= 10));
		System.out.println("Múltiplo de 3, positivo y menor que 20: "+(numero % 3 == 0 && numero >= 0 && numero < 20));
		
		sc.close();
		
	}
	
}
