
package projectgame;

import javax.swing.ImageIcon;

/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class SpelerVakje extends CoordinaatVakje{
    ImageIcon Sp;
    
    //constructor
    public SpelerVakje() {
        //De afbeelding van de speler toevoegen
        Sp = new ImageIcon(this.getClass().getResource("/assets/Speler.png"));
        setIcon(Sp);
    }
}