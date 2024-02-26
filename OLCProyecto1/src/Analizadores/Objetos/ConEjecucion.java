/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores.Objetos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cesar
 */
public class ConEjecucion {
    
    public static HashMap<String, Variable> variables = new HashMap<>();
    
    public static void imprimirVariables() {
        System.out.println("Analizadores.ConEjecucion.imprimirVariables()");
        for (Map.Entry<String, Variable> entry : variables.entrySet()) {
            String nombre = entry.getKey();
            Variable var = entry.getValue();
            System.out.println("Nombre: " + nombre + ", Tipo: " + var.tipo + ", Valor: " + var.valor);
        }
    }    
    
}
