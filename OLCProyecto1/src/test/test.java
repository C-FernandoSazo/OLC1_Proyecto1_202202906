/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test;
import java.io.BufferedReader;
import java.io.StringReader;
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
            generarHTML_Tokens(scanner.tokens);
            generarHTML_Errores(ConEjecucion.errores);
            System.out.println("Analisis terminado");
        } catch (Exception e) {
          //  System.out.println(e);
          e.printStackTrace();
        }
    }
   
   public static void generarHTML_Tokens(ArrayList<Token> tokens) {
    try {
        FileWriter fileWriter = new FileWriter("tokens.html");
        try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println("<!DOCTYPE html>");
            printWriter.println("<html>");
            printWriter.println("<head><title>Tokens Reconocidos</title></head>");
            printWriter.println("<body>");
            printWriter.println("<h1>Tokens</h1>");
            printWriter.println("<table border=\"1\">");
            printWriter.println("<tr><th>Tipo</th><th>Línea</th><th>Columna</th><th>Valor</th></tr>");
            for (Token token : tokens) {
                printWriter.println("<tr><td>" + token.getTipo() + "</td><td>" + token.getLinea() + "</td><td>" + 
                        token.getColumna() + "</td><td>" + token.getValor() + "</td></tr>");
            }
            printWriter.println("</table>");
            printWriter.println("</body>");
            printWriter.println("</html>");
            System.out.println("ARCHIVO HTML REALIZADO CON EXITO");
        }
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
   
   public static void generarHTML_Errores(ArrayList<Errores> errores) {
    try {
        FileWriter fileWriter = new FileWriter("Errores.html");
        try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println("<!DOCTYPE html>");
            printWriter.println("<html>");
            printWriter.println("<head><title>Errores Reconocidos</title></head>");
            printWriter.println("<body>");
            printWriter.println("<h1>Errores</h1>");
            printWriter.println("<table border=\"1\">");
            printWriter.println("<tr><th>Tipo</th><th>Línea</th><th>Columna</th><th>Lexema</th></tr>");
            for (Errores error : errores) {
                printWriter.println("<tr><td>" + error.getTipo() + "</td><td>" + error.getLinea() + "</td><td>" + 
                        error.getColumna() + "</td><td>" + error.getLexema() + "</td></tr>");
            }
            printWriter.println("</table>");
            printWriter.println("</body>");
            printWriter.println("</html>");
            System.out.println("ARCHIVO HTML REALIZADO CON EXITO");
        }
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
}