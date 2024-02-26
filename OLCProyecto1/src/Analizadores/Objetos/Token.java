/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores.Objetos;

/**
 *
 * @author Cesar
 */
public class Token {
    
    public String tipo;
    public int linea;
    public int columna;

    public String getTipo() {
        return tipo;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public String getValor() {
        return valor;
    }
    public String valor;

    public Token(String tipo, int linea, int columna, String valor) {
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
        this.valor = valor;
    }
    
}
