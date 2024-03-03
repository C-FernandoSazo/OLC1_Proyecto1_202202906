/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author Cesar
 */
public class NodoImagen {

    private String ruta;
    private NodoImagen siguiente;
    private NodoImagen anterior;

    public NodoImagen(String ruta) {
        this.ruta = ruta;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getRuta() {
        return ruta;
    }

    public NodoImagen getSiguiente() {
        return siguiente;
    }

    public NodoImagen getAnterior() {
        return anterior;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setSiguiente(NodoImagen siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoImagen anterior) {
        this.anterior = anterior;
    }
    
}
