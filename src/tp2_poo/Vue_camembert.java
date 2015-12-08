/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_poo;

import javax.swing.JInternalFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Matthieu
 */
public class Vue_camembert extends JInternalFrame{
    
     public class Camembert extends JFreeChart{
        public Camembert(Plot p){
            super(p);
         
        
        
        // create a dataset...
        final PieDataset dataset = createSampleDataset();

        // create the chart...
        final JFreeChart chart = createChart(dataset);

        // add the chart to a panel...
        ChartPanel charti = new ChartPanel(chart);
        charti.setPreferredSize(new java.awt.Dimension(500, 270));
       
        

    }
     private PieDataset createSampleDataset(){
        final DefaultPieDataset result = new DefaultPieDataset();
        for(int i =0;i<10;i++){
            result.setValue("lol", i);
        }
        return result;
        
        
        
    }
     
     private JFreeChart createChart(final PieDataset dataset) {
        
        final JFreeChart chart = ChartFactory.createPieChart3D(
            "Camembert",  // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false
        );

        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        plot.setNoDataMessage("No data to display");
        return chart;
        
    }
        }
    }
    

