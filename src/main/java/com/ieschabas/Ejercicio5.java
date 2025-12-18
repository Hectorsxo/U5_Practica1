package com.ieschabas;

/**
 * Ejercicio 5: El Bug de la Lista.
 * Simula la eliminación de una tarea en una posición fija (posición 2)de un array de
 * tamaño fijo, creando un nuevo array con un elemento menos y desplazando los elementos posteriores.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Ejercicio5 {

    /**
     * Método principal que define un array de 5 tareas pendientes
     * y elimina la tarea en la posición 2 (tercera tarea).
     * Muestra el array original y el resultado tras la eliminación.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        String[] tareasPendientes = {"Comprar comida", "Estudiar Java", "Limpiar el PC", "Dormir", "Jugar"};

        System.out.println("Tareas originales:");
        for (String tarea : tareasPendientes) {
            System.out.println(tarea);
        }

        // Se elimina siempre la posición 2
        String[] tareasActualizadas = eliminarTarea(tareasPendientes, 2);

        System.out.println("\nTareas después de eliminar la posición 2:");
        for (String tarea : tareasActualizadas) {
            System.out.println(tarea);
        }
    }

    /**
     * Elimina el elemento en la posición dada de un array de cadenas.
     * Crea un nuevo array con un tamaño menor y copia los elementos
     * anteriores y posteriores a la posición indicada.
     * Este método asume que la posición es válida (0 <= posicion < array.length).
     *
     * @param array array original de tareas.
     * @param posicion índice del elemento a eliminar (por ejemplo, 2).
     * @return nuevo array sin el elemento eliminado.
     */
    public static String[] eliminarTarea(String[] array, int posicion) {
        String[] nuevoArray = new String[array.length - 1];

        // Copiar elementos anteriores a la posición
        for (int i = 0; i < posicion; i++) {
            nuevoArray[i] = array[i];
        }

        // Copiar elementos posteriores (desplazamiento)
        for (int i = posicion + 1; i < array.length; i++) {
            nuevoArray[i - 1] = array[i];
        }
        return nuevoArray;
    }
}