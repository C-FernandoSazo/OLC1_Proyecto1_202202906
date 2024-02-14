/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores;

/**
 *
 * @author Cesar
 */
public class Generador {
    public static void main(String[] args){
        try{
            String ruta = "./src/Analizadores/";
            String[] opJflex = {ruta+"Lexico.jflex","-d",ruta};
            jflex.Main.generate(opJflex);
            String[] opCup = {"-destdir",ruta,"-parser","Parser",ruta+"Sintax.cup"};
            java_cup.Main.main(opCup);                        
        } catch (Exception e){
            }
    }
}
    
