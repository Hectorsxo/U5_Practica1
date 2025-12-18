package com.ieschabas;

/**
 * Ejercicio 6: Matriz de Horarios.
 * Declara e inicializa una matriz bidimensional de tipo String que representa
 * el horario semanal de un estudiante de DAM, con 5 días (Lunes a Viernes) y 6 módulos por día.
 *
 * @author Héctor Crespo
 * @version 1.0
 */
public class Ejercicio6 {

    /**
     * Método principal que declara la matriz horarioDAM y la inicializa
     * con nombres genéricos de módulos. Luego la imprime en la consola.
     *
     * @param args argumentos de la línea de comandos (no utilizados).
     */
    public static void main (String[] args){
        //Declaración de LA matriz horarioDAM
        String[][] horarioDAM = new String[5][6];
        //Inicialización de los modulos de DAM (Programación, Bases de Datos, Sistemas Informáticos, Lenguajes de Marcas, Entornos de Desarrollo e Inglés Técnico)
        String[] modulos = {"Programación", "BBDD", "SI", "LM", "ED", "IT"};

        for (int dia = 0; dia < horarioDAM.length; dia++) {
            for (int modulo = 0; modulo < horarioDAM[dia].length; modulo++) {
                horarioDAM[dia][modulo] = modulos[modulo];
            }
        }

        // Mostrar el horario
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        for (int i = 0; i < horarioDAM.length; i++) {
            System.out.print(dias[i] + ": ");
            for (int j = 0; j < horarioDAM[i].length; j++) {
                System.out.print(horarioDAM[i][j] + " ");
            }
            System.out.println();
        }
    }
}
