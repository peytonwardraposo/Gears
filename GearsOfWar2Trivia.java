//Import Library
import javax.swing.JOptionPane;
public class GearsOfWar2Trivia {
    //Method for guessing numbers 
    public void Gears2 (){
        //Declare variables
        String message = "Who dies in gears2 stroy that left a affect on Dom?:1) Tai , 2) Carmine B , 3) Kim , 4) Maria:";
        String title = "ENTER GUESS HERE";
        int Gears2 = Integer.parseInt(JOptionPane.showInputDialog(message, title));

        while ( Gears2 != 2) {
            message = "Incorrect, Try again: Who dies in gears2 stroy that left a affect on Dom?:1) Tai , 2) Carmine B , 3) Kim , 4) Maria:";
            Gears2 = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
            message = "Congrats you got the correct answer!Who dies in gears2 stroy that left a affect on Dom = Maria!";
            JOptionPane.showMessageDialog(null, message);
        }


        }


    }



        