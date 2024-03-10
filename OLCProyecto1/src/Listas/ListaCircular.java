/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author Cesar
 */
public class ListaCircular {
    
     private NodoImagen inicio;
     private NodoImagen fin;
        
    public ListaCircular(){
        this.inicio = null;
        this.fin = null;
    }      
    
    public void add(Object ruta) {
        NodoImagen nuevo = new NodoImagen(ruta.toString());
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
            inicio.setAnterior(fin);
            fin.setSiguiente(inicio);
        } else {
            nuevo.setSiguiente(inicio);
            nuevo.setAnterior(fin);
            fin.setSiguiente(nuevo);
            inicio.setAnterior(nuevo);
            fin = nuevo;
        }
    }
    
    public void vaciar() {
        inicio = null;
        fin = null;
    }
    
    public NodoImagen peek() {
        return inicio;
    }
    
}
