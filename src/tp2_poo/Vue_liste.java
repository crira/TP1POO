/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_poo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Matthieu
 */
public class Vue_liste extends JInternalFrame{
   //JPanel pano;
   Promotion p;
   JList liste;
   JScrollPane scroll;
   
   public Vue_liste(){
       p=new Promotion();
       liste = new JList(p.getListeEtudiants().toArray());
       ArrayList<Etudiant> list = p.getListeEtudiants();
       String t[]=new String[list.size()];
       for (int i=0;i<list.size();i++)
           t[i]=list.get(i).getId()+" "+list.get(i).getNom()+" "+list.get(i).getPrenom()+" ("+list.get(i).getDpt()+")";
       liste.setListData(t);
       
       scroll = new JScrollPane(liste);
       this.add(scroll);
       
       this.setVisible(true);
   }
   
    
}
