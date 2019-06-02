
package projectgame;

import javax.swing.ImageIcon;


/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class BarricadeVakje extends CoordinaatVakje {
    ImageIcon B; 
    //De waarde van de barricade
    private int barricadeWaarde;
    
    //constructor
    public BarricadeVakje(int barricadeWaarde) {
        this.barricadeWaarde = barricadeWaarde;
        
        //De afbeelding van de barricade toevoegen    
        B = new ImageIcon(this.getClass().getResource("/assets/Barricade" + barricadeWaarde + ".png"));
        setIcon(B);
    }
    
    //getter van de barricadeWaarde
    public int getBarricadeWaarde() {
        return barricadeWaarde;
    }
}