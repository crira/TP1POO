/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_poo;

import control.Controleur;
import control.SuppListe;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import obs.Observateur;

/**
 *
 * @author Matthieu
 */
public class Vue_liste extends JInternalFrame implements ActionListener,Observateur{
   //JPanel pano;
   JList liste;
   JScrollPane scroll;
   JButton sup;
   Promotion prom;
  
   
   public Vue_liste(Promotion p) {
       
       prom=p;
       prom.addObservateur(this);
       sup = new JButton("Supprimer");
       liste = new JList(p.getListeEtudiants().toArray());
       ArrayList<Etudiant> list = p.getListeEtudiants();
       String t[]=new String[list.size()];
       for (int i=0;i<list.size();i++)
           t[i]=list.get(i).getId()+" "+list.get(i).getNom()+" "+list.get(i).getPrenom()+" ("+list.get(i).getDpt()+")";
       liste.setListData(t);
       
       scroll = new JScrollPane(liste);
       
       this.setLayout(new GridBagLayout());
        GridBagConstraints cont = new GridBagConstraints();
        
        cont.gridx=0;
        cont.gridy=0;
        this.add(scroll,cont);
        
        cont.gridx=0;
        cont.gridy=1;
        this.add(sup,cont);
        
       //this.add(scroll);
       
       this.setVisible(true);
       scroll.setPreferredSize(new Dimension(300,600));
       sup.addActionListener(this);
       this.pack();
   }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==sup){
          if(liste.getSelectedValue()!=null){
          ArrayList<String> modif;
          modif=new ArrayList();
          
          modif.add(liste.getSelectedValue().toString().substring(0,3));
          System.out.println(liste.getSelectedValue().toString().substring(0,3));
          Controleur controleur;
          controleur = new SuppListe(prom);
          controleur.control(modif);
      }else{
              System.out.println("personne n'est selectionné");
          }
          
      }}

    @Override
    public void update() {
      // liste = new JList(prom.getListeEtudiants().toArray());
       liste.setListData(prom.getListeEtudiants().toArray());
       ArrayList<Etudiant> list = prom.getListeEtudiants();
       String t[]=new String[list.size()];
       for (int i=0;i<list.size();i++){
           t[i]=list.get(i).getId()+" "+list.get(i).getNom()+" "+list.get(i).getPrenom()+" ("+list.get(i).getDpt()+")";  
       }
       liste.setListData(t);
    }
   
    
}
