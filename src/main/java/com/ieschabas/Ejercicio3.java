package com.ieschabas;

/**
 * Ejercicio 3: Media de Notas del Módulo.
 * Calcula la media de un array de calificaciones (tipo double).
 * Se incluye un método reutilizable para el cálculo de la media.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Ejercicio3 {

    /**
     * Constructor por defecto
     */
    public Ejercicio3() {
    }

    /**
     * Método principal que declara un array de calificaciones,
     * llama al método calcularMedia y muestra el resultado.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        double[] calificaciones = {7.5, 6.0, 8.5, 9.0, 5.5, 7.0};
        double media = calcularMedia(calificaciones);
        System.out.println("La media de las calificaciones es: " + media);
    }

    /**
     * Calcula la media aritmética de un array de números reales.
     *
     * @param notas array de tipo double con las calificaciones.
     * @return la media como valor double.
     */
    public static double calcularMedia(double[] notas) {
        double suma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }
}