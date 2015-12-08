/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_poo;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.*;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetUtilities;


/**
 *
 * @author Matthieu
 */
public class Vue_histogramme extends JInternalFrame{
    Histogramme h;
    ChartPanel panel;
    JFreeChart charts;

    
    public Vue_histogramme(Promotion p){
        h = new Histogramme(p);
        charts = h.createChart(h.createDataset(p));
        panel=new ChartPanel(charts);

       
        this.add(panel);
        this.setPreferredSize(new Dimension(500,370));
        this.pack();
        this.setVisible(true);
    }
    
    public class Histogramme{
        public Histogramme(Promotion p) {
        final CategoryDataset dataset = createDataset(p);
       final JFreeChart chart = createChart(dataset);

        // add the chart to a panel...
        final ChartPanel charti = new ChartPanel(chart);
        
        charti.setPreferredSize(new java.awt.Dimension(500, 270));
        

    }
    
    CategoryDataset createDataset(Promotion p) {
        
        final String series1 = "S";
        final String series2 = "ES";
        final String series3 = "STI";
        final String series4 = "STG";
        final String series5 = "Etr";
        final String series6 = "Autre";

        // column keys...
        final String category1 = "Bacs";

        // create the dataset...
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(p.seriesbacs()[0], series1, category1);
        dataset.addValue(p.seriesbacs()[1], series2, category1);
        dataset.addValue(p.seriesbacs()[2], series3, category1);
        dataset.addValue(p.seriesbacs()[3], series4, category1);
        dataset.addValue(p.seriesbacs()[4], series5, category1);
        dataset.addValue(p.seriesbacs()[5], series6, category1);
        
        
        return dataset;


    }
    JFreeChart createChart(final CategoryDataset dataset) {
        
        final JFreeChart chart = ChartFactory.createBarChart3D(
            "Barre",      // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips
            false                     // urls
        );

        final CategoryPlot plot = chart.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 8.0)
        );
        final BarRenderer3D renderer = (BarRenderer3D) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        return chart;

    }
    }
    
}
