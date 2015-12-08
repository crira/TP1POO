/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obs;

/**
 *
 * @author Matthieu
 */
public interface Observable {
    void addObservateur(Observateur o);
    void removeObservateur(Observateur o);
    void notifyObservateur();
}
