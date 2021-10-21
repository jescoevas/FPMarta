package tarea1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de litros iniciales: ");
		Double litrosIniciales = sc.nextDouble();
		
		Double litrosConsumidosTrayecto1 = litrosIniciales*0.5;
		Double litrosConsumidosTrayecto2 = litrosConsumidosTrayecto1*0.25;
		Double litrosFinales = litrosIniciales - litrosConsumidosTrayecto1 - litrosConsumidosTrayecto2;
		
		System.out.println("Litros iniciales: "+litrosIniciales);
		System.out.println("Litros consumidos en el primer trayecto: "+litrosConsumidosTrayecto1);
		System.out.println("Litros consumidos en el segundo trayecto: "+litrosConsumidosTrayecto2);
		System.out.println("Litros finales: "+litrosFinales);
		
		sc.close();
	}
	
}
