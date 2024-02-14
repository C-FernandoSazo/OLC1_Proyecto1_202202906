/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package olcproyecto1;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jflex.exceptions.SilentExit;

/**
 *
 * @author Cesar
 */
public class OLCProyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setTitle("Menu Principal");
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        String ruta = "C:/Users/Cesar/Documents/Programas/2024/OLC1_Proyecto1_202202906/OLCProyecto1/src/Analizadores/Lexico.jflex";
        String[] rutas = {"-parse","Sintax","C:/Users/Cesar/Documents/Programas/2024/OLC1_Proyecto1_202202906/OLCProyecto1/src/Analizadores/Sintax.cup"};
        generador(ruta,rutas);
    }
    
    public static void generador(String ruta, String[] rutas){
        File archivo;
        String[] jflexArgs = new String[]{ruta};
        try {
            jflex.Main.generate(jflexArgs);
        } catch (SilentExit ex) {
            Logger.getLogger(OLCProyecto1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {     
            java_cup.Main.main(rutas);
        } catch (IOException ex) {
            Logger.getLogger(OLCProyecto1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(OLCProyecto1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
