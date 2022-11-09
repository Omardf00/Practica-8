package com.omar.vectores;

import java.util.ArrayList;
import java.util.List;

public class Vectores {

	public static void generarVector(Integer size, Integer num, Integer opcion) {

		Integer[] vector = new Integer[size];
		List<Integer> lista = new ArrayList<Integer>();

		for (Integer i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 10 + 1);
		}

		if (opcion == 1) {
			System.out.println("El vector es el siguiente");
			System.out.print("(");

			for (Integer i = 0; i < vector.length; i++) {
				if (i == vector.length - 1) {
					System.out.print(vector[i]);
					break;
				}
				System.out.print(vector[i] + ", ");
			}

			System.out.println(")");
		}

		for (Integer i = 0; i < vector.length; i++) {
			if (vector[i] == num) {
				lista.add(i);
			}
		}

		if (lista.isEmpty()) {
			System.out.println("No se encuentra el número que ha introducido en el array");
		} else {
			System.out.println("Las posiciones en las que se encuentra el número son las siguientes:");
			System.out.println(lista);
		}
	}

}
