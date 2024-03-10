/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Arrays;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import Analizadores.Objetos.Util;

public class Graficar {
    
    public static void grafica_barras(String titulo, String[] nombres, double[] datos, String titulox, String tituloy)    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < nombres.length; i++){
            dataset.addValue(datos[i], "Serie 1", nombres[i]);
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                titulo, // Título de la Gráfica
                titulox, // Eje X
                tituloy,
                dataset);
        String tituloLimpio = titulo.replace(" ", "_").replaceAll("[^a-zA-Z0-9_]", ""); 
        try {
            ChartUtilities.saveChartAsPNG(new File("img/"+tituloLimpio+".png"), barChart, 360, 310);
            Util.imagenes.add("img/"+tituloLimpio+".png");
            System.out.println("SE GUARDO LA GRAFICA");
        } catch (Exception e) {
            System.out.println("ERROR GRAFICO");
            e.printStackTrace();
        }
    }
        
    public static void graficar_pie(String titulo, double[] values, String[] label)   {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int i=0; i<values.length; i++){
            dataset.setValue(label[i], values[i]);
        }
        JFreeChart pieChart = ChartFactory.createPieChart(
                titulo,
                dataset,
                true, // leyenda
                true,
                false);
        PiePlot plot = (PiePlot) pieChart.getPlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
            "{0} : {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%")
        ));
        String tituloLimpio = titulo.replace(" ", "_").replaceAll("[^a-zA-Z0-9_]", "");
        try {
            ChartUtilities.saveChartAsPNG(new File("img/"+tituloLimpio+".png"), pieChart, 360, 310);
            Util.imagenes.add("img/"+tituloLimpio+".png");
            System.out.println("SE GUARDO LA GRAFICA");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void grafica_linea(String titulo, String[] nombres, double[] datos, String titulox, String tituloy)    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < nombres.length; i++){
            dataset.addValue(datos[i], "Serie 1", nombres[i]);
        }
        JFreeChart barChart = ChartFactory.createLineChart(
                titulo, // Título de la Gráfica
                titulox, // Eje X
                tituloy,
                dataset);
        String tituloLimpio = titulo.replace(" ", "_").replaceAll("[^a-zA-Z0-9_]", "");
        try {
            ChartUtilities.saveChartAsPNG(new File("img/"+tituloLimpio+".png"), barChart, 360, 310);
            Util.imagenes.add("img/"+tituloLimpio+".png");
            System.out.println("SE GUARDO LA GRAFICA");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void grafica_histograma(String titulo, double[] datos)    {
        String temp;
        HistogramDataset dataset = new HistogramDataset();
        dataset.setType(HistogramType.FREQUENCY);
        dataset.addSeries("Histogram", datos, datos.length);
        JFreeChart histogram = ChartFactory.createHistogram(
                    titulo, 
                    "Valor", 
                    "Frecuencia"
                    , dataset, 
                    PlotOrientation.VERTICAL, 
                    true, 
                    false
                    , false);
        String tituloLimpio = titulo.replace(" ", "_").replaceAll("[^a-zA-Z0-9_]", "");
        try {
            ChartUtilities.saveChartAsPNG(new File("img/"+tituloLimpio+".png"), histogram, 360, 310);
            Util.imagenes.add("img/"+tituloLimpio+".png");
            System.out.println("SE GUARDO LA GRAFICA");
        } catch (Exception e) {
                e.printStackTrace();
            }
                
        //Imprimir en Consola
        Arrays.sort(datos);
        int fb = 0, fa = 0;
        double fr;
        double total = datos.length;
        double prevValue = -1;

        Util.agregarTexto(titulo);
        Util.agregarTexto("Valor\tFb\tFa\tFr");

        for (double value : datos) {
            if (value != prevValue) {
                if (fb > 0) {
                    fa += fb;
                    fr = (fb / total) * 100;
                    temp = String.format("%d\t%d\t%d\t%.0f%%\n", (int) prevValue, fb, fa, fr);
                    Util.agregarTexto(temp);
                }
                prevValue = value;
                fb = 1;
                } else {
                    fb++;
                }
            }
            if (fb > 0) {
                fa += fb;
                fr = (fb / total) * 100;
                temp = String.format("%d\t%d\t%d\t%.0f%%\n", (int) prevValue, fb, fa, fr);
                Util.agregarTexto(temp);
            }

            Util.agregarTexto("Totales:\t" + (int) total + "\t" + (int) total + "\t100%");
        
    }
      
}
