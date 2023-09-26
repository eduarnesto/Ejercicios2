package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		//Variable donde guardar la edad
		int edad;
		
		//Cadena donde guardo si es mayor
		boolean mayoria;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pido la edad
		System.out.println("Introduzca la edad");
		
		//Leemos la edad
		edad = sc.nextInt();
		
		//Comprobamos si es mayor de edad
		mayoria = edad>=18;
		
		//Mostramos si es mayor o menor de edad
		System.out.println("¿El usuario es mayor de edad?: " + mayoria);
		
		//Cerrar el scanner
		sc.close();
		
	}
	
}
