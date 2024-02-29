/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores.Objetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cesar
 */
public class ConEjecucion {
    
    public static HashMap<String, Variable> variables = new HashMap<>();
    public static HashMap<String, double[]> arrays = new HashMap<>();
    public static HashMap<String, String[]> arrayChar = new HashMap<>();
    public static ArrayList<Errores> errores = new ArrayList<>();
    
    public static void imprimirVariables() {
        System.out.println("Analizadores.ConEjecucion.imprimirVariables()");
        for (Map.Entry<String, Variable> entry : variables.entrySet()) {
            String nombre = entry.getKey();
            Variable var = entry.getValue();
            System.out.println("Nombre: " + nombre  + ", Valor: " + var.getValor());
        }
        for (Map.Entry<String, double[]> entry : arrays.entrySet()) {
            String nombre = entry.getKey();
            double[] arr = entry.getValue();
            System.out.print("Nombre: " + nombre + ", Valores: ");
            // Imprime los valores del arreglo de double
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
            System.out.println(); // Salto de línea después de imprimir todos los elementos de un arreglo
        }
        
        for (Map.Entry<String, String[]> entry : arrayChar.entrySet()) {
            String nombre = entry.getKey();
            String[] arr = entry.getValue();
            System.out.print("Nombre: " + nombre + ", Valores: ");
            // Imprime los valores del arreglo de double
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
            System.out.println(); // Salto de línea después de imprimir todos los elementos de un arreglo
        }        
    }    
    
}
