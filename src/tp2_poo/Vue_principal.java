/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_poo;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Matthieu
 */
public class Vue_principal extends JFrame{

  Vue_liste liste;
  Vue_histogramme histogramme;
  Vue_formulaire formulaire;
  Vue_camembert camembert;
  Promotion p;
    
    public Vue_principal(){
        p = new Promotion();
        formulaire=new Vue_formulaire(p);
        liste = new Vue_liste(p);
        camembert = new Vue_camembert(p);
        histogramme = new Vue_histogramme(p);
        
        this.setContentPane(new JDesktopPane());
        
        this.add(formulaire);
        formulaire.setLocation(0, 0);
        
        this.add(liste);
        liste.setLocation(camembert.getWidth()+histogramme.getWidth(), 0);
        
        this.add(histogramme);
        histogramme.setLocation(camembert.getWidth(), formulaire.getHeight());
        
        this.add(camembert);
        camembert.setLocation(0,formulaire.getHeight());
       
        
        this.setVisible(true);
        this.setPreferredSize(new Dimension(1400,700));
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
    public static void main(String[] args) {
        Vue_principal vp=new Vue_principal();
        
       
    }
    
}
