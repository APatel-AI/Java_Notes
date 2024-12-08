public class MethodChallenge{
    public static void main(String[] args){


        displayHighScorePosition("Arpan", calculateHighScorePosition(1500));
        displayHighScorePosition("Bobby", calculateHighScorePosition(1000));
        displayHighScorePosition("James", calculateHighScorePosition(500));
        displayHighScorePosition("Lupe", calculateHighScorePosition(100));
        displayHighScorePosition("Enzo", calculateHighScorePosition(25));

    }


    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the High score list.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }else if (playerScore >= 500){
            return 2;
        }else if (playerScore >= 100){
            return 3;
        }else{
            return 4;
        }

    }
   
}

