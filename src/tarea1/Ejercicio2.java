package tarea1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaramos el objeto Scanner para poder introducir datos
		Scanner sc = new Scanner(System.in);
		
		//Pedimos los datos y los almacenamos en variables Double
		System.out.print("Introduce el primer n�mero: ");
		Double primero = sc.nextDouble();
		System.out.print("Introduce el segundo n�mero: ");
		Double segundo = sc.nextDouble();
		
		//Para el triple del primero n�mero basta con multiplicarlo por 3
		Double triplePrimero = primero*3;
		//Para la d�cima parte del segundo basta con dividir entre 10 o multiplicar por 0.1
		Double decimaParteSegundo = segundo*0.1;
		//Para el cuadrado del doble del producto de ambos n�meros primero los multiplicamos, y el resultado lo multiplicamos por 2. Y al resultado le calculamos el cuadrado con la clase Math
		Double dobleProducto = (primero*segundo)*2;
		Double cuadrado = Math.pow(dobleProducto, 2.0);
		//Para la mitad del cuadrado de la suma de ambos n�meros primero los sumamos y al resultado le calculamos el cuadrado con Math. Y el resultado lo dividimos entre 2 o lo multiplicamos por 0.5
		Double cuadrado2 = Math.pow((primero+segundo), 2.0);
		Double mitad = cuadrado2/2;
		
		//Imprimimos por pantalla los resultados
		System.out.println("El triple del primer n�mero: "+triplePrimero);
		System.out.println("La d�cima parte del segundo n�mero: "+decimaParteSegundo);
		System.out.println("El cuadrado del doble del producto de ambos n�meros: "+cuadrado);
		System.out.println("La mitad del cuadrado de la suma de ambos n�meros: "+mitad);
		
		//Cerramos el Scanner para ahorrar recursos
		sc.close();
		
	}
	
}
