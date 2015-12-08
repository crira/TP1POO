/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_poo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
    
    public Vue_principal(){
        formulaire=new Vue_formulaire();
        liste = new Vue_liste();
        camembert = new Vue_camembert();
        
         this.setLayout(new GridBagLayout());
        GridBagConstraints cont = new GridBagConstraints();
        
        
        
        cont.gridx=0;
        cont.gridy=0;
        this.add(formulaire,cont);
        
        cont.gridx=1;
        cont.gridy=0;
        cont.gridheight=2;
        this.add(liste,cont);
        
        cont.gridx=0;
        cont.gridy=1;
        cont.gridheight=1;
        this.add(camembert,cont);
        
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  
    public static void main(String[] args) {
        Vue_principal vp=new Vue_principal();
        
       
    }
    
}
