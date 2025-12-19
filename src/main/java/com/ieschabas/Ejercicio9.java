package com.ieschabas;

/**
 * Ejercicio 9: El Módulo con Mejor Rendimiento.
 * Dada una matriz de calificaciones donde las filas son alumnos y las columnas son módulos,
 * este programa encuentra la nota máxima del alumno 2 (índice 2) recorriendo únicamente
 * los elementos de su fila.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Ejercicio9 {

    /**
     * Constructor por defecto
     */
    public Ejercicio9() {
    }

    /**
     * Método principal que:
     * Define una matriz de ejemplo calificacionesTrimestrales.
     * Recorre solo la fila del alumno 2 (índice 2).
     * Encuentra y muestra la calificación más alta de esa fila.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main (String[] args) {
        // Matriz en la que cada fila es un alumno y cada columna un módulo
        int[][] calificacionesTrimestrales = {
                {7, 8, 6, 9, 5, 8},   // Alumno 0
                {6, 7, 7, 8, 6, 7},   // Alumno 1
                {9, 10, 8, 9, 9, 10}, // Alumno 2**
                {5, 6, 5, 7, 6, 5}    // Alumno 3
        };

        int alumno = 2; // Índice del alumno a analizar
        int notaMaxima = calificacionesTrimestrales[alumno][0]; // Primer valor como referencia

        // Recorrer solo la fila del alumno 2
        for (int modulo = 1; modulo < calificacionesTrimestrales[alumno].length; modulo++) {
            if (calificacionesTrimestrales[alumno][modulo] > notaMaxima) {
                notaMaxima = calificacionesTrimestrales[alumno][modulo];
            }
        }
        System.out.println("La nota máxima del alumno " + alumno + " es: " + notaMaxima);
    }
}
