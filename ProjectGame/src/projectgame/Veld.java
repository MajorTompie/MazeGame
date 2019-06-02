
package projectgame;

import javax.swing.JFrame;

/*
 * @authors
 * Tim Bekema               14062615  
 * Parminder Singh Maseeh   17087783
 * Tom Verschoor            17131022
 */
public class Veld extends JFrame{
    SpeelVeld panel = new SpeelVeld();
    
    //constructor
    public Veld(){
        super("Indiana Joints and the Crystal Bong"); //naam toevoegen
        setSize(1000 ,1000); //de size aan de JFrame toevoegen
        setResizable(false); //zorgen dat je de size niet kan aanpassen
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); //de applicatie sluiten bij het afsluiten
        add(panel); //panel aan JFrame toevoegen
        addKeyListener(panel); //keylistener aan JFrame toevoegen
        setVisible(true); //de frame visible maken
    } 
}
