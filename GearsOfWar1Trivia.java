//Import Library
import javax.swing.JOptionPane;
public class GearsOfWar1Trivia {
    //Method for guessing numbers 
    public void Gears1 (){
          //Declare variables
        String message = "Who is the leader of delta squad:1) Marcus , 2) Dom , 3) Baird , 4) Cole:";
        String title = "ENTER GUESS HERE";
        int Gears1 = Integer.parseInt(JOptionPane.showInputDialog(message, title));


        while ( Gears1 != 1) {
            message = "Incorrect, Try again: Who is the leader of delta squad 1) Marcus , 2) Dom , 3) Baird , 4) Cole:";
        Gears1 = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
        message = "Congrats you got the correct answer! Who is the leader of delta squad = Marcus!";
        JOptionPane.showMessageDialog(null, message);
        }





        }


        }