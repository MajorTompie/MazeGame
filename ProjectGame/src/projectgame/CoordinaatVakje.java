
package projectgame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class CoordinaatVakje extends JLabel{
    ImageIcon V;
    
    //constructor
    public CoordinaatVakje() {
        //De afbeelding van het gewone vakje toevoegen 
        V = new ImageIcon(this.getClass().getResource("/assets/vakje.png"));
        setIcon(V);
    }
}
