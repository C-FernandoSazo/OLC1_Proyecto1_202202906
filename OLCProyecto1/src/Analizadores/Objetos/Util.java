/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores.Objetos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cesar
 */
public class Util {
    
    public static ArrayList<Token> tokens = new ArrayList<>();
    public static HashMap<String, Variable> variables = new HashMap<>();
    public static HashMap<String, double[]> arrays = new HashMap<>();
    public static HashMap<String, String[]> arrayChar = new HashMap<>();
    public static HashMap<String, Object> atributesGraph = new HashMap<>();
    public static ArrayList<Errores> errores = new ArrayList<>();
    public static ArrayList<Token> insVariables = new ArrayList<>();
    
    public static void imprimirVariables() {
        System.out.println("Analizadores.ConEjecucion.imprimirVariables()");
        for (Map.Entry<String, Variable> entry : variables.entrySet()) {
            String nombre = entry.getKey();
            Variable var = entry.getValue();
            System.out.println("Nombre: " + nombre  + ", Valor: " + var.getValor());
        }
        for (Map.Entry<String, double[]> entry : arrays.entrySet()) {
            String nombre = entry.getKey();
            double[] arr = entry.getValue();
            System.out.print("Nombre: " + nombre + ", Valores: ");
            // Imprime los valores del arreglo de double
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
            System.out.println(); // Salto de línea después de imprimir todos los elementos de un arreglo
        }
        
        for (Map.Entry<String, String[]> entry : arrayChar.entrySet()) {
            String nombre = entry.getKey();
            String[] arr = entry.getValue();
            System.out.print("Nombre: " + nombre + ", Valores: ");
            // Imprime los valores del arreglo de double
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
            System.out.println(); // Salto de línea después de imprimir todos los elementos de un arreglo
        }        
    }

    public static void generarHTML_TablaDeSimbolos() {
        try {
            FileWriter fileWriter = new FileWriter("tablaDeSimbolos.html");
            try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
                printWriter.println("<!DOCTYPE html>");
                printWriter.println("<html>");
                printWriter.println("<head><title>Tabla de Símbolos</title>");
                // Estilos CSS
                printWriter.println("<style>");
                printWriter.println("body { display: flex; justify-content: center; align-items: center; flex-direction: column; }");
                printWriter.println("table { width: 50%; border-collapse: collapse; }");
                printWriter.println("th, td { padding: 8px; text-align: left; }");
                printWriter.println("th#numero { width: 10%; }"); 
                printWriter.println("</style>");
                printWriter.println("</head>");
                printWriter.println("<body>");
                printWriter.println("<h1>Tabla de Simbolos</h1>");
                printWriter.println("<table border=\"1\">");
                printWriter.println("<tr><th>Nombre</th><th>Tipo</th><th>Valor</th><th>Columna</th><th>Fila</th></tr>");

                // Imprimir variables
                for (String key : variables.keySet()) {
                    Variable var = variables.get(key);
                    Token tokenInfo = findTokenInfo(key);
                    if (var.getTipo().equals("double")){
                    printWriter.println("<tr><td>" + key + "</td><td>Double</td><td>" + var.getValor() + "</td><td>" + tokenInfo.getColumna() + "</td><td>" + tokenInfo.getLinea() + "</td></tr>");
                    } else if(var.getTipo().equals("string")) {
                        printWriter.println("<tr><td>" + key + "</td><td>String</td><td>" + var.getValor() + "</td><td>" + tokenInfo.getColumna() + "</td><td>" + tokenInfo.getLinea() + "</td></tr>");
                    }
                }

                // Imprimir arrays
                for (String key : arrays.keySet()) {
                    Token tokenInfo = findTokenInfo(key);
                    printWriter.println("<tr><td>" + key + "</td><td>Array de double</td><td>" + arrayToString(arrays.get(key)) + "</td><td>" + tokenInfo.getColumna() + "</td><td>" + tokenInfo.getLinea() + "</td></tr>");
                }

                // Imprimir arrayChar
                for (String key : arrayChar.keySet()) {
                    Token tokenInfo = findTokenInfo(key);
                    printWriter.println("<tr><td>" + key + "</td><td>Array de String</td><td>" + arrayToString(arrayChar.get(key)) + "</td><td>" + tokenInfo.getColumna() + "</td><td>" + tokenInfo.getLinea() + "</td></tr>");
                }

                printWriter.println("</table>");
                printWriter.println("</body>");
                printWriter.println("</html>");

                System.out.println("ARCHIVO HTML DE TABLA DE SÍMBOLOS GENERADO CON ÉXITO");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void generarHTML_Tokens() {
        int contador = 1;
        try {
            FileWriter fileWriter = new FileWriter("tokens.html");
            try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
                printWriter.println("<!DOCTYPE html>");
                printWriter.println("<html>");
                printWriter.println("<head><title>Tokens Reconocidos</title>");
                // Agregar algo de CSS para centrar la tabla y dar más ancho a la columna #
                printWriter.println("<style>");
                printWriter.println("body { display: flex; justify-content: center; align-items: center; flex-direction: column; }");
                printWriter.println("table { width: 50%; border-collapse: collapse; }");
                printWriter.println("th, td { padding: 8px; text-align: left; }");
                printWriter.println("th#numero { width: 10%; }"); 
                printWriter.println("</style>");
                printWriter.println("</head>");
                printWriter.println("<body>");
                printWriter.println("<h1>Tokens</h1>");
                printWriter.println("<table border=\"1\">");
                printWriter.println("<tr><th id=\"numero\">#</th><th>Lexema</th><th>Tipo</th><th>Línea</th><th>Columna</th></tr>");
                for (Token token : tokens) {
                    printWriter.println("<tr><td>" + contador + "</td><td>" + token.getValor() + "</td><td>" +
                            token.getTipo() + "</td><td>" + token.getLinea() + "</td><td>" + token.getColumna() + "</td></tr>");
                    contador++;
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
    
   public static void generarHTML_Errores() {
       int contador = 1;
        try {
            FileWriter fileWriter = new FileWriter("Errores.html");
            try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
                printWriter.println("<!DOCTYPE html>");
                printWriter.println("<html>");
                printWriter.println("<head><title>Errores Reconocidos</title></head>");
                printWriter.println("<style>");
                printWriter.println("body { display: flex; justify-content: center; align-items: center; flex-direction: column; }");
                printWriter.println("table { width: 50%; border-collapse: collapse; }");
                printWriter.println("th, td { padding: 8px; text-align: left; }");
                printWriter.println("th#numero { width: 10%; }"); 
                printWriter.println("</style>");
                printWriter.println("<body>");
                printWriter.println("<h1>Errores</h1>");
                printWriter.println("<table border=\"1\">");
                printWriter.println("<tr><th>#</th><th>Tipo</th><th>Lexema</th><th>Línea</th><th>Columna</th></tr>");
                for (Errores error : errores) {
                    printWriter.println("<tr><td>" + contador + "</td><td>" + error.getTipo() + "</td><td>" + error.getLexema() + "</td><td>" + 
                            error.getLinea() + "</td><td>" + error.getColumna() + "</td></tr>");
                    contador++;
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
   
    private static Token findTokenInfo(String key) {
        // Este método busca en insVariables por el token con el nombre 'key' y devuelve su información
        for (Token token : insVariables) {
            if (token.getValor().equals(key)) {
                return token;
            }
        }
        return new Token("NULL",0,0,"NULL");
    }
        
    private static String arrayToString(double[] arr) {
        StringBuilder sb = new StringBuilder();
        for (double val : arr) {
            sb.append(val).append(", ");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "";
    }

    private static String arrayToString(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String val : arr) {
            sb.append(val).append(", ");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 2) : "";
    }
}
