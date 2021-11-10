package tarea2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int filas = 0;
		while(filas < 2 || filas > 10) {
			System.out.print("Introduzca número de filas (2-10): ");
			filas = sc.nextInt();
		}
		
		int columnas = 0;
		while(columnas < 2 || columnas > 10) {
			System.out.print("Introduzca número de columnas (2-10): ");
			columnas = sc.nextInt();
		}
		
		System.out.print("¿Caja rellena? (0: vacía, cualquier otro número rellena) ");
		int rellena = sc.nextInt();
		
		String resultado = "";
		
		for(int i = 1; i <= columnas; i++) {
			if(i == 1) {
				resultado+="+";
			} else if(i == columnas) {
				resultado+="+\n";
			} else {
				resultado+="-";
			}
		}
		
		for(int i = 1; i <= filas; i++) {
			for(int j = 1; j <= columnas; j++) {
				if(i == 1 || i == filas) {
					break;
				} else if(j == 1 || j == columnas) {
					resultado+="|";
				} else if(rellena == 0) {
					resultado+=" ";
				} else {
					resultado+=i-1;
				} 
				
				if(j == columnas) {
					resultado+="\n";
				}
			}
		}
		
		for(int i = 1; i <= columnas; i++) {
			if(i == 1 || i == columnas) {
				resultado+="+";
			}else {
				resultado+="-";
			}
		}
		
		System.out.println(resultado);
		
		sc.close();
		
	}
	
}
