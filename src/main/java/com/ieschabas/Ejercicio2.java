package com.ieschabas;

/**
 * Ejercicio 3: Media de Notas del Módulo.
 * Define un método que calcula la media de un array de calificaciones.
 * El array se pasa por referencia, y se recorre completamente para obtener la media.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Ejercicio2 {

    /**
     * Método principal que manipula un array de nombres de streamers.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args){
        String[] topStreamers = {"anddriuu", "TheDarkraimola", "iLuTVLIVE", "FolagorLives"};
        // a) Acceso al cuarto streamer (Índice 3)
        System.out.println("Cuarto streamer: " + topStreamers[3]);
        // b) Modificación del primer streamer para que el valor sea "MegaProGamer"
        topStreamers[0] = "MegaProGamer";
        System.out.println("Primer streamer actualizado a: " + topStreamers[0]);
    }
}
