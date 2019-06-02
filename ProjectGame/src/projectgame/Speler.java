
package projectgame;

import java.awt.event.KeyEvent;

/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class Speler{
    //coördinaten
    private int x;
    private int y;
    
    //de sleutel die de speler bezit
    private int sleutelWaarde;
    
    //constructor
    public Speler(int x, int y, int sleutelWaarde){
        this.x = x;
        this.y = y;
        this.sleutelWaarde = sleutelWaarde;
    }
    
    //lopen over een barricade
    public void barricadeLopen(KeyEvent e, int veld[][], int waarde){
        int input = e.getKeyCode();
        
        //waardes voor de barricades waar je niet over kan
        int niet1;
        int niet2;
        switch (waarde) {
            case 3:
                niet1 = 4;
                niet2 = 5;
                break;
            case 4:
                niet1 = 3;
                niet2 = 5;
                break;
            default: 
                niet1 = 3;
                niet2 = 4;
                        break;
        }
        
        //lopen over de barricades
        if(input == KeyEvent.VK_LEFT && x > 0 && veld[y][x-1] != 2 && veld[y][x-1] != niet1 && veld[y][x-1] != niet2)  {
            x--;
            System.out.println(x); 
        }
        else if(input == KeyEvent.VK_RIGHT && x < 9 && veld[y][x+1] != 2 && veld[y][x+1] != niet1 && veld[y][x+1] != niet2){
            x++;
            System.out.println(x);
        }
        else if(input == KeyEvent.VK_UP && y > 0 && veld[y-1][x] != 2 && veld[y-1][x] != niet1 && veld[y-1][x] != niet2){
            y--;
            System.out.println(y);
        }
        else if(input == KeyEvent.VK_DOWN && y < 9 && veld[y+1][x] != 2 && veld[y+1][x] != niet1 && veld[y+1][x] != niet2){
            //(veld[y+1][x] == 3 && getSleutelWaarde() == barricade.getBarricadeWaarde())
            y++;
            System.out.println(y);
        }
    }
    
    //lopen over de andere vakken
    public void lopen(KeyEvent e, int veld[][]){
        int input = e.getKeyCode();
        
        if(input == KeyEvent.VK_LEFT && x > 0 && veld[y][x-1] < 2)  {
            x--;
            System.out.println(x); 
        }
        else if(input == KeyEvent.VK_RIGHT && x < 9 && veld[y][x+1] < 2){
            x++;
            System.out.println(x);
        }
        else if(input == KeyEvent.VK_UP && y > 0 && veld[y-1][x] < 2){
            y--;
            System.out.println(y);
        }
        else if(input == KeyEvent.VK_DOWN && y < 9 && veld[y+1][x] < 2){
            //(veld[y+1][x] == 3 && getSleutelWaarde() == barricade.getBarricadeWaarde())
            y++;
            System.out.println(y);
        }
    }
    
    //vernieuwd veld maken
    public int[][] nieuwVeld(int veld[][]) {
        if(veld[y][x] >= 1) {
            veld[y][x] = 0;
        }
        return veld;
    }   
    
    //getters
    public int getSleutelWaarde() {
        return sleutelWaarde;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    //setter
    public void setSleutelWaarde(int sleutelWaarde) {
        this.sleutelWaarde = sleutelWaarde;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
