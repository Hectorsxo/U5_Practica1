package com.ieschabas;

/**
 * Ejercicio 1: Inventario del Mochilero.
 * Declara e inicializa un array de enteros con los puntos de daño de 5 armas principales
 * en un videojuego de rol, usando inicialización concisa.
 *
 * @author Héctor Crespo
 * @version 1.0
 */

public class Ejercicio1 {

    /**
     * Método principal de la clase.
     * Declara e inicializa el array 'puntosDano' con los valores de daño de cinco armas.
     * Luego, recorre el array mediante un bucle for tradicional e imprime cada valor
     * en una línea independiente para verificar su contenido.
     *
     * @param args argumentos de la línea de comandos (no utilizados en este contexto).
     */
    public static void main(String[] args){
        int[] puntosDano = {15, 8, 22, 11, 30};

        for(int i = 0; i < puntosDano.length; i++){
            System.out.println(puntosDano[i]);
        }
    }
}
