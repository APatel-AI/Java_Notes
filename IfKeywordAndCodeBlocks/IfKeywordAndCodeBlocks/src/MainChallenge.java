public class MainChallenge {
    public static void main(String[] args){

        // The variables below are no longer required because of the calculateScore method

        // boolean gameOver = true; 
        // int score = 800; 
        // int levelCompleted = 5;
        // int bonus = 100;
        // int finalScore = score;

    
        // Call to method 1 
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The highScore is " + highScore);


        // Call to method 2
        System.out.println("The nex highScore is " +  
        calculateScore(true, 10000, 8, 200));


        // The actions below can be completed with the method, hence no longer needed.
        // score = 10000;
        // levelCompleted = 8;
        // bonus = 200;

        // if (gameOver){ // same thing as gameOver == true
        //     finalScore += (levelCompleted * bonus);
        //     System.out.println("Your final score was " + finalScore);
        // }
    }


    //define calculateScore method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ){

        int finalScore = score;

        if (gameOver){ // same thing as gameOver == true
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        return finalScore;

    }

}
