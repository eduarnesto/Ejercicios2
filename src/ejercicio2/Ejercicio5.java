package ejercicio2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		//Variable para nota primer trimestre
		int nota1;
		
		//Variable para nota segundo trimestre
		int nota2;
		
		//Variable para nota tercer trimestre
		int nota3;
		
		//Variable de la media como se muestra en el boletín
		int notaBoletin;
		
		//Variable de la media como se usa en el expediente académico
		float notaExpediente;
		
		//Scanner para leer las notas del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto la nota del primer trimestre
		System.out.println("Nota del pimer trimestre:");
		
		//Leo la nota del teclado
		nota1 = sc.nextInt();
		
		//Pregunto la nota del segundo trimestre
		System.out.println("Nota del segundo trimestre:");
		
		//Leo la nota del teclado
		nota2 = sc.nextInt();
		
		//Pregunto la nota del tercer trimestre
		System.out.println("Nota del tercer trimestre:");		
		
		//Leo la nota del teclado
		nota3 = sc.nextInt();
		
		//Calculo la nota media como se muestra en el boletin
		notaBoletin = (nota1+nota2+nota3)/3;
		
		//Calculo la nota media como se muestra en el expediente
		notaExpediente = (float)(nota1+nota2+nota3)/3;
		
		//Muestro la nota media como se muestra en el boletín y como se usa en el expediente
		System.out.println("La nota media como se muestra en el boletín es " + notaBoletin + " y como se usa en el expediente es " + notaExpediente);
	}
}
