
package projectgame;

/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class Sleutel{
    //coördinaten van de sleutel
    private int x;
    private int y;
    //waarde van de sleutel
    private int waarde;
    
    //constructor
    public Sleutel(int x, int y, int waarde){
        this.x = x;
        this.y = y;
        this.waarde = waarde; 
    }    
    
    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWaarde() {
        return waarde;
    }
}
