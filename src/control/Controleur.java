/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import tp2_poo.Promotion;

/**
 *
 * @author mattc
 */
public abstract class Controleur {
    Promotion p;
    public Controleur(Promotion promotion){
        this.p=promotion;
    }
    
    public abstract void control(ArrayList<String> s);
}
