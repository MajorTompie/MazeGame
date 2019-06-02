
package projectgame;

import javax.swing.ImageIcon;

/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class EindveldVakje extends CoordinaatVakje{
    ImageIcon E;
    
    //constructor
    public EindveldVakje() {
        //De afbeelding van het eindveld vakje toevoegen
        E = new ImageIcon(this.getClass().getResource("/assets/Eindveld.png"));
        setIcon(E);
    }
}
