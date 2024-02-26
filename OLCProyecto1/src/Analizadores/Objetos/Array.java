/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores.Objetos;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class Array {
    String tipo;
    String identificador;
    ArrayList<Object> valores;

    public Array(String tipo, String identificador, ArrayList<Object> valores) {
        this.tipo = tipo;
        this.identificador = identificador;
        this.valores = valores;
    }
    
}
