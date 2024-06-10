//Import Library
import javax.swing.JOptionPane;
public class GearsOfWarJudgmentTrivia {
 //Method for guessing numbers 
    public void  GearsJudgment (){
    //Declare variables
    String message = " In Gears Judgment who was aprt of the UIR in Kilo squad:1) Baird , 2) Cole , 3) Sofila , 4) Paduk:";
    String title = "ENTER GUESS HERE";
int GearsJudgment = Integer.parseInt(JOptionPane.showInputDialog(message, title));



while ( GearsJudgment != 4){
    message = "Incorrect, Try again:In Gears Judgment who was aprt of the UIR in Kilo squad:1) Baird , 2) Cole , 3) Sofila , 4) Paduk:";
    GearsJudgment = Integer.parseInt(JOptionPane.showInputDialog(message ,title));
    message = "Congrats you got the correct answer!In Gears Judgment who was aprt of the UIR in Kilo squad:1) Baird , 2) Cole , 3) Sofila , 4) Paduk = Paduk!";
    JOptionPane.showMessageDialog(null, message);
    
}


}


}

