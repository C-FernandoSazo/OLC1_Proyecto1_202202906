/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test;
import java.io.BufferedReader;
import Analizadores.Parser;
import Analizadores.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import Analizadores.Objetos.Token;
import Analizadores.Objetos.Errores;
import Analizadores.Objetos.ConEjecucion;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class test {
   public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:/Users/Cesar/Documents/Programas/2024/OLC1_Proyecto1_202202906/OLCProyecto1/src/test/prueba.df");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(bufferedReader);         
            Parser parser = new Parser(scanner);
            parser.parse();
            ConEjecucion.generarHTML_Tokens(scanner.tokens);
            ConEjecucion.generarHTML_Errores();
            ConEjecucion.generarHTML_TablaDeSimbolos();
            System.out.println("Analisis terminado");
        } catch (Exception e) {
          //  System.out.println(e);
          e.printStackTrace();
        }
    }
}
