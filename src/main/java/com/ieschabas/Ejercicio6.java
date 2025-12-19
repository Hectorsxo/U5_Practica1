package com.ieschabas;

/**
 * Ejercicio 6: Matriz de Horarios.
 * Declara e inicializa una matriz bidimensional de tipo String que representa
 * el horario semanal real de un estudiante de DAM, con 5 días (Lunes a Viernes)
 * y 6 módulos por día, usando una distribución diferente para cada día.
 *
 * @author Héctor Crespo
 * @version 2.0
 */
public class Ejercicio6 {

    /**
     * Constructor por defecto
     */
    public Ejercicio6() {
    }

    /**
     * Método principal que inicializa la matriz horarioDAM directamente al declararla,
     * con el horario real proporcionado, y la imprime en la consola.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */


    public static void main(String[] args) {
        // Inicialización concisa de la matriz 5x6 con el horario real
        String[][] horarioDAM = {
                {"Sistemas Informáticos", "Sistemas Informáticos", "Programación", "Bases de Datos", "Bases de Datos", "Entornos de Desarrollo"},             // Lunes
                {"Lenguajes de Marcas", "Lenguajes de Marcas", "IPO", "IPO", "Programación", "Programación"},     // Martes
                {"Programación", "Programación", "Bases de Datos", "IPO", "Sistemas Informáticos", "Sistemas Informáticos"},    // Miércoles
                {"Bases de Datos", "Bases de Datos", "Sistemas Informáticos", "Entornos de Desarrollo", "Entornos de Desarrollo", "Programación"},             // Jueves
                {"Programación", "Programación", "Lenguajes de Marcas", "Inglés Técnico", "Inglés Técnico", "Tutoría"}   // Viernes
        };

        // Nombres de los días para la impresión
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        // Mostrar el horario
        for (int i = 0; i < horarioDAM.length; i++) {
            System.out.println(dias[i] + ": ");
            for (int j = 0; j < horarioDAM[i].length; j++) {
                System.out.println(horarioDAM[i][j] + " ");
            }
            System.out.println();
        }
    }
}