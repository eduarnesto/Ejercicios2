package ejercicio2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variable para guardar si va a la biblioteca
		boolean biblioteca;
		
		//Variable para guardar si llueve
		boolean lluvia;
		
		//Variable para guardar si tiene tarea
		boolean tareaFinalizada;
		
		//Variable para saber si puede salir de casa
		boolean salir;
		
		//Creo scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pido al usuario si tiene que ir a la biblioteca
		System.out.println("¿Tienes que ir a la biblioteca?");
		
		//Leo del teclado si tiene que ir
		biblioteca = sc.nextBoolean();
		
		//Pido al usuario si está lloviendo
		System.out.println("¿Está lluviendo?");
		
		//Leo del teclado si está lloviendo
		lluvia = sc.nextBoolean();
		
		//Pido al usuario si ha terminado la tarea
		System.out.println("¿Has terminado la tarea?");
		
		//Leo del teclado si ha terminado la tarea
		tareaFinalizada = sc.nextBoolean();
		
		//Compruebo si puede salir de casa
		salir = biblioteca||(!lluvia&&tareaFinalizada);
		
		//Muestro si puede salir
		System.out.println("¿Puede salir?: " + salir);
		
		//Cierro scanner
		sc.close();
	}

}
