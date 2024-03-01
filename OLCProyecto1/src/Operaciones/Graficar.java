/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import java.io.File;
import java.text.DecimalFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;

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
        try {
            ChartUtilities.saveChartAsPNG(new File("GraficaBarras.png"), barChart, 800, 600);
        } catch (Exception e) {
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
        try {
            ChartUtilities.saveChartAsPNG(new File("GraficaPie.png"), pieChart, 800, 600);
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
        try {
            ChartUtilities.saveChartAsPNG(new File("GraficaLineas.png"), barChart, 800, 600);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
