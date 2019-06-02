
package projectgame;

import javax.swing.ImageIcon;

/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class MuurVakje extends CoordinaatVakje{
    ImageIcon M;
    
    //constructor
    public MuurVakje() {
        //De afbeelding van de muur toevoegen
        M = new ImageIcon(this.getClass().getResource("/assets/muur.png"));
        setIcon(M);
    }
}