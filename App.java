    
    import javax.swing.JOptionPane;
    public class App {
    public static void main(String[] args) throws Exception {
        
        //Create questions 
        String message = "Choose A Trivia Catagory : 1) Gears Of War1. 2) Gears Of War2. 3) Gears Of War3. 4) Gears Of WarJ:";
        String title = "ENTER CATAGORY HERE";
        int guess = Integer.parseInt(JOptionPane.showInputDialog(message, title));
        
        if (guess == 1){
            GearsOfWar1Trivia Gears1Object = new  GearsOfWar1Trivia ();
            Gears1Object.Gears1();

            if (guess == 2){
        GearsOfWar2Trivia Gears2Object = new GearsOfWar2Trivia ();
        Gears2Object.Gears2();


        if (guess == 3){
            GearsOfWar3Trivia Gears3Object = new GearsOfWar3Trivia  ();
            Gears3Object.Gears3();


            if (guess == 4){
                GearsOfWarJudgmentTrivia GearsJudgmentObject = new GearsOfWarJudgmentTrivia();
                GearsJudgmentObject.GearsJudgment();
    }
    
}

    

}

    
    }

}

    }