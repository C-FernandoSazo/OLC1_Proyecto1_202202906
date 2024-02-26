/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores.Objetos;

/**
 *
 * @author Cesar
 */
public class Variable {
    String nombre;
    String tipo;
    Object valor; // Puede ser int, double, String, etc., dependiendo del tipo de variable.

    public Variable(String nombre, String tipo, Object valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
    }  

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }
}

