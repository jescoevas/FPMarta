package tarea2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String texto = "";
		while(texto.length() < 5) {
			System.out.print("Introduzca un texto con al menos 5 caracteres: ");
			texto = sc.nextLine();
		}
		
		int multiplicador = 0;
		while(multiplicador != 1 && multiplicador != 3) {
			System.out.print("Introduzca el valor del multiplicador (entre 1-3): ");
			multiplicador = sc.nextInt();
		}
		
		int puntuacion = 0;
		
		for(int i = 0; i < texto.length(); i++) {
			char caracter = texto.charAt(i);
			switch(caracter) {
			case 'a':case 'A':case 'e':case 'E':case 'i':case 'I':case 'o':case 'O':case 'u':case 'U':
				puntuacion++;
				break;
			case 'x': case 'y': case 'z':
				puntuacion+=2;
				break;
			case 'X':
				puntuacion+=5;
				break;
			default:
				puntuacion--;
			}
		}
		
		puntuacion*=multiplicador;
		System.out.println("El valor del texto es: "+puntuacion);
		
		sc.close();
		
	}
	
}
