/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_poo;


import obs.Observateur;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Matthieu
 */
public class Vue_formulaire extends JInternalFrame implements ActionListener{
    JLabel titre,num,nom,prenom,bac,dept,titre2,numero;
    JTextField tnum,tnom,tprenom,tnumero;
    JComboBox cbac,cdept;
    JButton Ajout,supprimer;
    Promotion p;
    
    public Vue_formulaire(Promotion prom){
        p=prom;
        titre = new JLabel("Ajout d'un etudiant");
        num = new JLabel("Numero");
        nom = new JLabel("Prénom");
        prenom = new JLabel("Nom");
        bac = new JLabel("Bac");
        titre2 = new JLabel("Supprimer un etudiant");
        numero = new JLabel("numero");
        dept = new JLabel("Dept");
        tnum = new JTextField(10);
        tnom = new JTextField(10);
        tnumero=new JTextField(10);
        tprenom = new JTextField(10);
        Ajout = new JButton("Ajout");
        supprimer = new JButton("Supprimer");
        cbac = new JComboBox();
        cbac.addItem("S");
        cbac.addItem("ES");
        cbac.addItem("STI");
        cbac.addItem("L");
        
        cdept = new JComboBox();
            for (int i=1;i<97;i++)
                cdept.addItem(i);
        
        
        this.setLayout(new GridBagLayout());
        GridBagConstraints cont = new GridBagConstraints();
        
        cont.gridx=0;
        cont.gridy=0;
        this.add(titre,cont);
        
         cont.gridx=0;
        cont.gridy=1;
        this.add(num,cont);
        
        cont.gridx=1;
        cont.gridy=1;
        this.add(tnum,cont);
        
        cont.gridx=2;
        cont.gridy=1;
        this.add(nom,cont);
        
        cont.gridx=3;
        cont.gridy=1;
        this.add(tnom,cont);
        
        cont.gridx=4;
        cont.gridy=1;
        this.add(prenom,cont);
        
         cont.gridx=5;
        cont.gridy=1;
        this.add(tprenom,cont);
        
        
        
        cont.gridx=6;
        cont.gridy=1;
        this.add(bac,cont);
        
        cont.gridx=7;
        cont.gridy=1;
        this.add(cbac,cont);
        
        cont.gridx=8;
        cont.gridy=1;
        this.add(dept,cont);
        
        cont.gridx=9;
        cont.gridy=1;
        this.add(cdept,cont);
        
        cont.gridx=0;
        cont.gridy=3;
        cont.gridwidth=2;
        this.add(titre2,cont);
        
        cont.gridx=0;
        cont.gridy=4;
        cont.gridwidth=1;
        this.add(numero,cont);
        
        cont.gridx=1;
        cont.gridy=4;
        this.add(tnumero,cont);
        
        cont.gridx=9;
        cont.gridy=5;
        this.add(supprimer,cont);
        this.setVisible(true);
        
        cont.gridx=9;
        cont.gridy=2;
        this.add(Ajout,cont);
        this.setVisible(true);
        this.pack();
        supprimer.addActionListener(this);
        Ajout.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Ajout){
            System.out.println("Ajouté");
            Etudiant etu =new Etudiant(tnum.getText(), tnom.getText(), tprenom.getText(), (String) cbac.getSelectedItem(), (String) cdept.getSelectedItem());
            p.addEtudiant(etu);
        }
        if(e.getSource()==supprimer){
                System.out.println("Supprimé");
                }
    
}}
