package com.ieschabas;

/**
 * Ejercicio 10: Clasificación de Héroes.
 * Este ejercicio explica la diferencia entre los algoritmos
 * de ordenación Burbuja (Bubble Sort) y Selección (Selection Sort).
 *
 * Se incluye una demostración con un array de puntuaciones para ilustrar
 * ambos métodos.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Ejercicio10 {

    /**
     * Implementación del algoritmo Bubble Sort.
     * Compara elementos adyacentes e intercambia si están desordenados.
     *
     * @param array array de enteros a ordenar.
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Implementación del algoritmo Selection Sort.
     * Busca el menor elemento en la sublista no ordenada y lo coloca
     * en la posición correcta.
     *
     * @param array array de enteros a ordenar.
     */
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Intercambiar el mínimo con el elemento en la posición i
            int temp = array[i];
            array[i] = array[indiceMinimo];
            array[indiceMinimo] = temp;
        }
    }

    /**
     * Método principal que muestra la diferencia entre Bubble Sort y Selection Sort.
     * Utiliza un array de 10 puntuaciones de héroes, ordena copias con ambos métodos
     * y explica conceptualmente la diferencia clave.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        int[] puntuacionHeroes = {85, 92, 78, 96, 88, 74, 91, 89, 93, 80};

        // Mostrar array original
        System.out.println("Puntuaciones originales:");
        for (int i = 0; i < puntuacionHeroes.length; i++) {
            System.out.println(puntuacionHeroes[i]);
        }

        // Bubble Sort
        int[] copiaBurbuja = puntuacionHeroes.clone();
        bubbleSort(copiaBurbuja);
        System.out.println("\nDespués de Bubble Sort:");
        for (int i = 0; i < copiaBurbuja.length; i++) {
            System.out.println(copiaBurbuja[i]);
        }

        // Selection Sort
        int[] copiaSeleccion = puntuacionHeroes.clone();
        selectionSort(copiaSeleccion);
        System.out.println("\nDespués de Selection Sort:");
        for (int i = 0; i < copiaSeleccion.length; i++) {
            System.out.println(copiaSeleccion[i]);
        }

        // Explicación
        System.out.println("\nDiferencia clave:");
        System.out.println("- Burbuja: intercambia elementos adyacentes repetidamente.");
        System.out.println("- Selección: busca el menor y lo coloca en su posición final.");
    }
}