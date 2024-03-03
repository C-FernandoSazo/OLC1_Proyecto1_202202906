/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olcproyecto1;

import Analizadores.Objetos.Util;
import Analizadores.Parser;
import Analizadores.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringReader;

/**
 *
 * @author Cesar
 */
public class Ejecutar {
    
    public void ejecucion(String texto){
        try {
            StringReader stringReader = new StringReader(texto);
            BufferedReader bufferedReader = new BufferedReader(stringReader);
            Scanner scanner = new Scanner(bufferedReader);         
            Parser parser = new Parser(scanner);
            parser.parse();
            System.out.println("Analisis terminado");
        } catch (Exception e) {
          //  System.out.println(e);
          e.printStackTrace();
        }
    }
    
}
