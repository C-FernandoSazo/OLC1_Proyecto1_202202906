/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import java.util.Arrays;

/**
 *
 * @author Cesar
 */
public class Estadistica {
    
    public static double media(double[] array){
        double media = 0;
        for (int i=0; i < array.length; i++) {
            media += array[i];
        }
        media = media / array.length;
        return media;
    }
    
    public static double mediana(double[] array){
        double[] newArray = array.clone();
        Arrays.sort(newArray);
        int n = newArray.length;
        double mediana;
        if (n % 2 != 0) {
            mediana =  newArray[n/2];
            return mediana;
        } else {
            mediana = (newArray[(n/2)-1] + newArray[n/2]) / 2;
            return mediana;
          }
    }
    
    public static double moda(double[] array) {
        int maxRepeticion = 0;
        double moda = 0;
        for (int i=0; i < array.length; i++) {
            int numRepeticiones = 0;
            for (int j=0; j<array.length; j++) {
                if(array[i] == array[j]) {
                    numRepeticiones++;
                }
                if (numRepeticiones>maxRepeticion) {    
                    moda = array[i];
                    maxRepeticion = numRepeticiones;
                }
            }
        }
        return moda;
    }
    
    public static double varianza(double[] array) {
            double media = media(array);
            double sumaCuadrados = 0;
            double varianza = 0;
            for (double num : array){
                sumaCuadrados += Math.pow(num - media, 2);
                }
            varianza = sumaCuadrados / array.length;
            return varianza;
    }
    
    public static double max(double[] array){
        double max = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                }
            }
        return max;
    }
    
    public static double min(double[] array){
        double min = 0;
        for (int i = 0; i<array.length; i++) {
            if (min == 0){
             min = array[i];
                }
            else if (array[i] < min) {
                min = array[i];
                    }
            }
        return min;
    }
    
}
