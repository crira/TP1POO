/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
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
    Etudiant etu = new Etudiant(s.get(0), s.get(1), s.get(2), s.get(3), s.get(3));
    p.addEtudiant(etu); 
    p.notifyObservateur();
    }


    
}
