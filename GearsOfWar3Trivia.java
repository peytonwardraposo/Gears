//Import Library
import javax.swing.JOptionPane;
public class GearsOfWar3Trivia {
     //Method for guessing numbers 
    public void Gears3 (){
//Declare variables
        String message = "In Gears3 Who has the Biggest Death:1) Clayton carmine  , 2) Dom , 3) Adam Fenix , 4) Jace :";
String title = "ENTER GUESS HERE";
int Gears3 = Integer.parseInt(JOptionPane.showInputDialog(message, title));

while ( Gears3 != 3) {
    message = "Incorrect, Try again:In Gears3 Who has the Biggest Death:1) Clayton carmine  , 2) Dom , 3) Adam Fenix , 4) Jace :";
    Gears3 = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
    message = "Congrats you got the correct answer!In Gears3 Who has the Biggest Death:1) Clayton carmine  , 2) Dom , 3) Adam Fenix , 4) Jace : = Dom!";
    JOptionPane.showMessageDialog(null, message);
}




}

}





