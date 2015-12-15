/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tp2_poo.Etudiant;
import tp2_poo.Promotion;

/**
 *
 * @author mattc
 */
public class AjoutForm extends Controleur{

    public AjoutForm(Promotion promotion) {
        super(promotion);
    }

    @Override
    public void control(ArrayList<String> s) {
        boolean continu = true;
        if(p.searchEtudiant(s.get(0))==null){
            try{
                Integer.parseInt(s.get(0));
            }
            catch(Exception e){
                continu=false;
                JOptionPane.showMessageDialog(new JFrame(),"le numéro n'est pas un nombre","Erreur", JOptionPane.WARNING_MESSAGE);
            }
            if(continu==true){
                if(s.get(1).length()==0||s.get(2).length()==0){
                 JOptionPane.showMessageDialog(new JFrame(),"l'un des champs est vide","Erreur", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    Etudiant etu = new Etudiant(s.get(0), s.get(1), s.get(2), s.get(3), s.get(4));
                 p.addEtudiant(etu); 
                 p.notifyObservateur();
                }
            }
        }else{
            JOptionPane.showMessageDialog(new JFrame(),"Le numero d'étdiant existe déjà","Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }


    
}
