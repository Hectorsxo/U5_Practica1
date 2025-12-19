package com.ieschabas;

/**
 * Ejercicio 2: Ranking de Streamers.
 * a) Accede al cuarto streamer (índice 3) y lo imprime.
 * b) Modifica el nombre del primer streamer (índice 0) a "MegaProGamer".
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
