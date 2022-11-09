package com.omar.vectores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer programa = null;
		Integer size = null;
		Integer num = null;

		System.out.println("En esta pr�ctica haremos b�squeda de datos dentro de vectores");
		System.out.println("Generaremos dos posibles aplicaciones en el proyecto: ");
		System.out.println("Nuestra primera app generar� un array aleatorio de 10 valores y pedir� que introduzca un n�mero por teclado");
		System.out.println("En caso de que el valor est�, se devolver� la posici�n o las posiciones en las que se encuentre.");
		System.out.println("En caso de que no est�, devolveremos un mensaje indicandolo");
		System.out.println("Nuestra segunda app har� exactamente lo mismo pero con un array de 25.000.000 de posiciones");
		System.out.println("LOS VALORES PARA EL PROGRAMA VARIAR�N ENTRE 1 y 10");
		
		System.out.println("");
		System.out.println("Por favor introduzca 1 � 2 en base a la app que quiera ejecutar");
		
		try {
			
			programa = sc.nextInt();
			
			switch (programa) {
			case 1: {
				System.out.println("Introduzca el valor que quiere comprobar");
				num = sc.nextInt();
				
				size = 10;
				Vectores.generarVector(size, num, programa);
				break;
			}
			case 2: {
				System.out.println("Introduzca el valor que quiere comprobar");
				num = sc.nextInt();
				
				size = 25000000;
				Vectores.generarVector(size, num, programa);
				break;
			}
			default:
				System.out.println("Por favor introduzca 1 � 2");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Por favor introduzca n�meros enteros");
		}

	}

}
