package com.ieschabas;

/**
 * Ejercicio 7: Tablero de Proyectos.
 * Inicializa una matriz 4x4 de tipo double (matrizRecursos) asignando 10.0
 * a todos los elementos de la fila 0 y de la columna 3, usando la notación
 * correcta matriz[i][j] (i = fila, j = columna).
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Ejercicio7 {

    /**
     * Método principal que inicializa la matriz, asigna los valore solicitados y la imprime.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Declaración e inicialización de la matriz 4x4
        double[][] matrizRecursos = new double[4][4];

        // Inicializar toda la matriz a 0.0
        for (int i = 0; i < matrizRecursos.length; i++) {
            for (int j = 0; j < matrizRecursos[i].length; j++) {
                matrizRecursos[i][j] = 0.0;
            }
        }

        // Inicializar FILA 0
        for (int j = 0; j < matrizRecursos[0].length; j++) {
            matrizRecursos[0][j] = 10.0;
        }

        // Inicializar COLUMNA 3
        for (int i = 0; i < matrizRecursos.length; i++) {
            matrizRecursos[i][3] = 10.0;
        }

        // Mostrar la matriz usando SOLO println
        System.out.println("Matriz matrizRecursos (4x4):");

        for (int i = 0; i < matrizRecursos.length; i++) {
            String fila = "";
            for (int j = 0; j < matrizRecursos[i].length; j++) {
                fila = fila + matrizRecursos[i][j] + " ";
            }
            System.out.println(fila);
        }
    }
}