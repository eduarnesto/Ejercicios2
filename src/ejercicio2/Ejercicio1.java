package ejercicio2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Constante donde guardar el precio por kilo de manzana
		final float PRECIO_MANZANA = 2.35f;
		
		//Constante donde guardar el precio por kilo de pera
		final float PRECIO_PERA = 1.95f;
		
		//Variable donde guardar los kilos de manzana
		float kilosManzana;
		
		//Variable donde guardar los kilos de pera
		float kilosPera;
		
		//Variable donde guardo los beneficiso
		float beneficios;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por los kilos de manzanas vendidos
		System.out.println("¿Cuántos kilos de manzanas se han vendido?");
		
		//Leo los kilos de manzanas vendidos del teclado
		kilosManzana = sc.nextFloat();
		
		//Pregunto por los kilos de peras vendidos
		System.out.println("¿Cuántos kilos de peras se han vendido?");
		
		//Leo los kilos de peras vendidos del teclado
		kilosPera = sc.nextFloat();
		
		//Calculo los beneficios totales
		beneficios = kilosManzana*PRECIO_MANZANA + kilosPera*PRECIO_PERA;
		
		//Mostramos los beneficios
		System.out.println("El beneficio anual es de " + beneficios + "€");
		
		//Cierro el escáner
		sc.close();
	}

}
