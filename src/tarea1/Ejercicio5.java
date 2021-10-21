package tarea1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//Monedas de veinte c�ntimos, diez c�ntimos, cinco c�ntimos, dos c�ntimos y un c�ntimo de euro
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el precio del producto: ");
		Integer precio = sc.nextInt();
		System.out.print("Introduce el dinero introducido: ");
		Integer dinero = sc.nextInt();
		
		Integer cambio = dinero - precio;
		
		System.out.println("EL cambio a recibir es "+cambio+" c�ntimos");
		
		Integer veinte = 0, diez = 0, cinco = 0, dos = 0, uno = 0;
		Integer cambioActual = 0;
		while(cambioActual < cambio) {
			cambioActual+=20;
			veinte++;
			if(cambioActual > cambio) {
				cambioActual-=20;
				veinte--;
				cambioActual+=10;
				diez++;
				if(cambioActual > cambio) {
					cambioActual-=10;
					diez--;
					cambioActual+=5;
					cinco++;
					if(cambioActual > cambio) {
						cambioActual-=5;
						cinco--;
						cambioActual+=2;
						dos++;
						if(cambioActual > cambio) {
							cambioActual-=2;
							dos--;
							cambioActual++;
							uno++;
						}
					}
				}
			}
		}
		
		System.out.println("El cambio se ha dado de la siguiente forma: ");
		System.out.println("Monedas de 20 c�ntimos: "+veinte);
		System.out.println("Monedas de 10 c�ntimos: "+diez);
		System.out.println("Monedas de 5 c�ntimos: "+cinco);
		System.out.println("Monedas de 2 c�ntimos: "+dos);
		System.out.println("Monedas de 1 c�ntimos: "+uno);
		
		sc.close();
		
	}
	
}
