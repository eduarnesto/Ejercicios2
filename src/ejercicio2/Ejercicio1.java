package ejercicio2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaro la variable kilos como int ya que es entera y beneficios como float porque puede ser decimal
		int kilos;
		float beneficios;
		
		//Creo un scanner
		Scanner sc = new Scanner (System.in);
		
		//Pregunto por los kilos vendidos y calculo el beneficio
		System.out.println("¿Cuántos kilos de manzanas se han vendido?");
		kilos = sc.nextInt();
		beneficios = (float)(kilos*2.35);
		System.out.println("¿Cuántos kilos de peras se han vendido?");
		kilos = sc.nextInt();
		beneficios = (float)(beneficios+kilos*1.95);
		
		//Doy el resultado
		System.out.println("El beneficio anual es de " + beneficios + "€");
		
		//Cierro el escáner
		sc.close();
	}

}
