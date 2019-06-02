
package projectgame;

import javax.swing.ImageIcon;

/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class SleutelVakje extends CoordinaatVakje{
    ImageIcon S;
    //waarde van de sleutel voor de naam van de afbeelding
    private int waarde;
    
    //constructor
    public SleutelVakje(int waarde) {
        this.waarde = waarde;
        
        //De afbeelding van de sleutel toevoegen
        S = new ImageIcon(this.getClass().getResource("/assets/Sleutel" + waarde + ".png"));
        setIcon(S);
    }
}
