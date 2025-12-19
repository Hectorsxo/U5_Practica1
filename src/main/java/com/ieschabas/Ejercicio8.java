package com.ieschabas;

/**
 * Ejercicio 8: Puntuaciones Irregulares.
 * Usa una matriz irregular para representar los puntos de 3 equipos con distinto número de miembros:
 * - Equipo 0: 4 miembros
 * - Equipo 1: 5 miembros
 * - Equipo 2: 2 miembros
 *
 * Este ejercicio explica el uso de los atributos .length en matrices irregulares:
 * - puntuacionesEquipo.length devuelve el número de filas (equipos).
 * - puntuacionesEquipo[i].length devuelve el número de columnas (miembros) en la fila i.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Ejercicio8 {

    /**
     * Constructor por defecto
     */
    public Ejercicio8() {
    }

    /**
     * Método principal que declara una matriz irregular, la recorre con bucles anidados,
     * y muestra en la consola el número de equipos y el número de miembros por equipo.
     * También imprime todas las puntuaciones para verificar el recorrido.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main (String[] args){
        // Declaración e inicialización de una matriz irregular
        int[][] puntuacionesEquipo = {
                {85, 92, 78, 88},        // Equipo 0: 4 miembros
                {90, 87, 95, 89, 91},    // Equipo 1: 5 miembros
                {76, 82}                 //Equipo 2: 2 miembros
        };
        // puntuacionesEquipo.length → número de filas = número de equipos
        System.out.println("Número total de equipo: " + puntuacionesEquipo.length);

        // Recorrido con bucles anidados
        for (int i = 0; i < puntuacionesEquipo.length; i++) {
            // puntuacionesEquipo[i].length → número de miembros en el equipo i
            System.out.println("Equipo " + i + " tiene " + puntuacionesEquipo[i].length + " miembros");

            for (int j = 0; j < puntuacionesEquipo[i].length; j++){
                System.out.println("Miembro " + j + ": " + puntuacionesEquipo[i][j] + " puntos");
            }
        }
        System.out.println();
    }
}
