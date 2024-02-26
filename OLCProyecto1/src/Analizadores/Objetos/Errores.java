/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores.Objetos;

/**
 *
 * @author Cesar
 */
public class Errores {
    
    private String tipo;
    private int linea;
    private int columna;
    private String lexema;
    
    public Errores(String tipo, int linea, int columna, String lexema){
        this.tipo = tipo;
        this.linea = linea;
        this.columna = columna;
        this.lexema = lexema;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public String getLexema() {
        return lexema;
    }
    
}
