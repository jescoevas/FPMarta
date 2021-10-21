package tarea1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String texto = sc.nextLine();
		
		System.out.println("Contiene mas de cinco caracteres: "+(texto.length() > 5));
		System.out.println("Empieza con mayúscula: "+empiezaConMayuscula(texto));
		System.out.println("Termina con minúscula: "+terminaConMinuscula(texto));
		System.out.println("Termina con puntos suspensivos: "+texto.endsWith("..."));
		
		sc.close();
		
	}

	private static Boolean terminaConMinuscula(String texto) {
		Character c = texto.charAt(texto.length()-1);
		return Character.isLowerCase(c);
	}

	private static Boolean empiezaConMayuscula(String texto) {
		Character c = texto.charAt(0);
		return Character.isUpperCase(c);
	}

	
	
}
