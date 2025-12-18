package com.ieschabas;

/**
 * Ejercicio 4: El Nivel Secreto.
 * Implementa una búsqueda secuencial para determinar si el código 99 (que representa el "Nivel Secreto") está presente en un array desordenado.
 * Si se encuentra, se devuelve su posición.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Ejercicio4 {

    /**
     * Método principal que prueba la búsqueda del código 99.
     * Se simula un array en el que el código 99 está en la posición 7.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args){
        int[] codigosNivel = {12, 45, 67, 23, 89, 34, 55, 99, 11, 78};
        int posicion = buscarNivelSecreto(codigosNivel, 99);

        if (posicion != -1) {
            System.out.println("Nivel Secreto encontrado en la posición: " + posicion);
        } else {
            System.out.println("Nivel Secreto no encontrado.");
        }
    }

    /**
     * Busca secuencialmente un valor objetivo en un array de enteros.
     *
     * @param array el array de enteros en el que buscar.
     * @param objetivo el valor a buscar (en este caso, 99).
     * @return la posición (índice) del valor si se encuentra, o -1 si no está.
     */
    public static int buscarNivelSecreto(int[] array, int objetivo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == objetivo) {
                return i;
            }
        }
        return -1; // No encontrado
    }
}
