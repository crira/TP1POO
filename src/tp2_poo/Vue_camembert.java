/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_poo;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import obs.Observateur;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Matthieu
 */
public class Vue_camembert extends JInternalFrame implements Observateur{
    Camembert c;
    ChartPanel panel;
    JFreeChart charts;
    Promotion prom;
    
    public Vue_camembert(Promotion p){
        prom=p;
        c = new Camembert(p);
        charts = c.createChart(c.createSampleDataset(p));
        panel=new ChartPanel(charts);
        p.addObservateur(this);
        this.add(panel);
        this.setPreferredSize(new Dimension(500,370));
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void update() {
        this.remove(panel);
        charts = c.createChart(c.createSampleDataset(prom));
        panel=new ChartPanel(charts);
        this.add(panel);
    }
    
     public class Camembert{
        public Camembert(Promotion p) {
        
        
        // create a dataset...
        final PieDataset dataset = createSampleDataset(p);

        // create the chart...
        final JFreeChart chart = createChart(dataset);

        // add the chart to a panel...
        final ChartPanel charti = new ChartPanel(chart);
        charti.setPreferredSize(new java.awt.Dimension(500, 270));
       
        

    }
     private PieDataset createSampleDataset(Promotion p){
        int nb = 1;
            final DefaultPieDataset result = new DefaultPieDataset();
            for(int i =0; i<p.getListeEtudiants().size(); i++){
               result.setValue(p.getListeEtudiants().get(i).getDpt(), p.ComptDpt(p.getListeEtudiants().get(i).getDpt()));
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
    

