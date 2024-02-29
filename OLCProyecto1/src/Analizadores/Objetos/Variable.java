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
    
    String tipo;
    Object valor;

    public Variable(String tipo, Object valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }
    
}
