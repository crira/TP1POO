/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_poo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Matthieu
 */
public class Vue_formulaire extends JInternalFrame{
    JLabel titre,num,nom,prenom,bac,dept;
    JTextField tnum,tnom,tprenom;
    JComboBox cbac,cdept;
    JButton Ajout;
    
    public Vue_formulaire(){
        titre = new JLabel("Ajout d'un etudiant");
        num = new JLabel("Numero");
        nom = new JLabel("Prénom");
        prenom = new JLabel("Nom");
        bac = new JLabel("Bac");
        dept = new JLabel("Dept");
        tnum = new JTextField(10);
        tnom = new JTextField(10);
        tprenom = new JTextField(10);
        Ajout = new JButton("Ajout");
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
        this.setVisible(true);
        
        cont.gridx=9;
        cont.gridy=2;
        this.add(Ajout,cont);
        this.setVisible(true);
        
    }
    
}
