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
public class SuppForm extends Controleur{

    public SuppForm(Promotion promotion) {
        super(promotion);
    }



    @Override
    public void control(ArrayList<String> s) {
        System.out.println("élève " + s.get(0));
        if(p.searchEtudiant(s.get(0))!=null){
            Etudiant etu;
            etu=p.searchEtudiant(s.get(0));
            p.removeEtudiant(etu);
            p.notifyObservateur();
        } else {
            System.out.println("l'etudiant n'existe pas");  
        }
    }
    
}
