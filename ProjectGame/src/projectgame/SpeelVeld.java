
package projectgame;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class SpeelVeld extends JPanel implements KeyListener{
    //gridlayout van 10 bij 10 toevoegen
    GridLayout layout = new GridLayout(10,10);
    
    //2D array voor veld
    CoordinaatVakje coordinaten[][] = new CoordinaatVakje[10][10];
    
    //speler aanmaken
    Speler speler = new Speler(0,0,0);
    
    //sleutels aanmaken
    Sleutel sleutel300 = new Sleutel(5,1, 300);
    Sleutel sleutel100 = new Sleutel(4,1, 100);
    Sleutel sleutel1002 = new Sleutel(9,2,100);
    Sleutel sleutel200 = new Sleutel(0,8, 200);
    
    //barricades aanmaken
    BarricadeVakje barricade100 = new BarricadeVakje(100); 
    BarricadeVakje barricade200 = new BarricadeVakje(200);
    BarricadeVakje barricade300 = new BarricadeVakje(300);
    
    //array om objecten met nummer aan te duiden
    int veld[][] = new int[10][10];
    
    //boolean voor eerste keer tekenen
    Boolean tekenEerste = true;
    
    //contructor
    public SpeelVeld(){
        //layout toevoegen
        setLayout(layout);
        
        //methode die het veld tekent aanroepen
        teken();
    }
    
    //methode die het veld tekent
    public void teken(){
        removeAll();
        
        //eerste tekening
        if(tekenEerste != false){
        tekenMuur();
        tekenSleutel();
        veld[9][9] = 6;
        tekenEerste = false;
        tekenBarricade();
        }
        
        //methode die de speler de waarde van de sleutel geeft aanroepen
        sleutelWaarde();
        
        //de methode van het spel einde aanroepen
        einde();
        
        //vernieuwd veld aanroepen
        veld = speler.nieuwVeld(veld);
        
        //het veld tekenen
        for(int i = 0; i < coordinaten.length; i++) {
            for(int j = 0; j < coordinaten[1].length; j++){
                switch (veld[i][j]) {
                    case 1: //de sleutels
                        if(i == sleutel100.getY() && j == sleutel100.getX()){
                            coordinaten[i][j] = new SleutelVakje(100);
                        }
                         else if (i == sleutel1002.getY() && j == sleutel1002.getX()){
                            coordinaten[i][j] = new SleutelVakje(100);
                        }
                        else if (i == sleutel200.getY() && j == sleutel200.getX()){
                            coordinaten[i][j] = new SleutelVakje(200);
                        }
                        else if (i == sleutel300.getY() && j == sleutel300.getX()){
                            coordinaten[i][j] = new SleutelVakje(300);
                        }   break;
                    case 2: //de muren
                        coordinaten[i][j] = new MuurVakje();
                        break;
                    // de barricades
                    case 3:
                        coordinaten[i][j] = new BarricadeVakje(100);
                        break;
                    case 4:
                        coordinaten[i][j] = new BarricadeVakje(200);
                        break;
                    case 5:
                        coordinaten[i][j] = new BarricadeVakje(300);
                        break;
                    case 6: // het eindveld vakje
                        coordinaten[i][j] = new EindveldVakje();
                        break;
                    default: // het normale vakje
                        coordinaten[i][j] = new CoordinaatVakje();
                        break;
                }
                //de speler
                coordinaten[speler.getY()][speler.getX()] = new SpelerVakje();
                
                //het veld aan de JPanel toevoegen
                add(coordinaten[i][j]);
            }
        }
        System.out.println("Speler waarde = " + speler.getSleutelWaarde());
        revalidate();
        repaint();
    }
    
    //de sleutelwaarde aan de speler geven als hij hem oppakt
    public void sleutelWaarde(){
        if(sleutel100.getX() == speler.getX() && sleutel100.getY() == speler.getY() && veld[speler.getY()][speler.getX()] == 1){
            speler.setSleutelWaarde(sleutel100.getWaarde());
        }
        else if(sleutel1002.getX() == speler.getX() && sleutel1002.getY() == speler.getY() && veld[speler.getY()][speler.getX()] == 1){
            speler.setSleutelWaarde(sleutel1002.getWaarde());
        }
        else if(sleutel200.getX() == speler.getX() && sleutel200.getY() == speler.getY() && veld[speler.getY()][speler.getX()] == 1){
            speler.setSleutelWaarde(sleutel200.getWaarde());
        }
        else if(sleutel300.getX() == speler.getX() && sleutel300.getY() == speler.getY() && veld[speler.getY()][speler.getX()] == 1){
            speler.setSleutelWaarde(sleutel300.getWaarde());
        }
    }
    
    //methode van het spel halen
    public void einde(){
        if(veld[speler.getY()][speler.getX()] == 6){
            System.exit(0);
        }
    }
    
    //de muren tekenen
    public void tekenMuur() {
        veld[0][1] = 2;
        veld[3][1] = 2;
        veld[4][1] = 2;
        veld[6][1] = 2;
        veld[7][1] = 2;
        veld[8][1] = 2;
        veld[9][1] = 2;
        veld[4][4] = 2;
        veld[4][5] = 2;
        veld[4][6] = 2;
        veld[6][3] = 2;
        veld[6][4] = 2;
        veld[5][6] = 2;
        veld[6][6] = 2;
        veld[6][7] = 2;
        veld[9][7] = 2;
        veld[8][7] = 2;
        veld[0][7] = 2;
        veld[0][8] = 2;
        veld[0][9] = 2;
        veld[1][7] = 2;
        veld[1][8] = 2;
        veld[1][9] = 2;
        veld[3][7] = 2;
        veld[3][8] = 2;
        veld[3][9] = 2;
        veld[4][7] = 2;
        veld[4][8] = 2;
        veld[4][9] = 2;
        veld[5][7] = 2;
        veld[5][8] = 2;
        veld[7][3] = 2;
        veld[7][4] = 2;
        veld[8][3] = 2;
        veld[9][3] = 2;      
    }
    
    //de sleutels tekenen
    public void tekenSleutel() {
        veld[1][5] = 1;
        veld[1][4] = 1;
        veld[8][0] = 1;
        veld[2][9] = 1;
    }

    //de barricade tekenen
    public void tekenBarricade() {
        veld[2][7] = 4;
        veld[2][8] = 5;
        veld[6][5] = 5;
        veld[7][5] = 3;
        veld[1][6] = 3;
        veld[2][6] = 3;
        veld[3][6] = 3;
        veld[4][3] = 3;
        veld[2][0] = 3;
        veld[5][1] = 4;
        
        for(int i = 2; i < 10; i++){
            veld[i][2] = 3;
        }
    }
    
    //keybindings aanroepen
    @Override
    public void keyPressed(KeyEvent e) {
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int input = e.getKeyCode();

        //het lopen over een barricade aanroepen van speler
        if(speler.getSleutelWaarde() == barricade100.getBarricadeWaarde()){
            speler.barricadeLopen(e, veld, 3);
        }
        else if(speler.getSleutelWaarde() == barricade200.getBarricadeWaarde()){
            speler.barricadeLopen(e, veld, 4);
        }
        else if(speler.getSleutelWaarde() == barricade300.getBarricadeWaarde()){
            speler.barricadeLopen(e, veld, 5);
        }
        //het gewone lopen van speler aanroepen
        else{
            speler.lopen(e, veld);
        }
        
        //resetten
        if(input == KeyEvent.VK_R){
            tekenEerste = true;
            speler.setX(0);
            speler.setY(0);
            speler.setSleutelWaarde(0);
        }
        
        //het veld hertekenen
        teken();
    }
}

