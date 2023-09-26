package ejercicio2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable donde guardar el número
		int num;
		
		//Booleano para saber si es par
		boolean par;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto el número
		System.out.println("Introduzca un número:");
		
		//Leo el número del teclado
		num = sc.nextInt();
		
		//Compruebo si es par
		par=(num%2==0);
		
		//Muestro si el número es par
		System.out.println("¿El número es par?: " + par);
		
		//Cierro scanner
		sc.close();

	}

}
