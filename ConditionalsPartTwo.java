

public class ConditionalsPartTwo{
    public static void main(String[] args){
        
        System.out.println("Hello, Arpan! ");
        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien");
            System.out.println("And I'm scared of aliens! :(");
        }

        int topScore = 100; 
        // for conditionals you can us
        if (topScore != 100){ // "!=" top score is not equal to 100. which is a false statement so the print statement below would not execute
            System.out.println("You have gotten the highest score!!!!");   
        }


        int secondTopScore = 95;
        if (topScore > secondTopScore || topScore < 100 ){
            System.out.println("Greater than the second top score and less than 100");
        }

        //bitwise operator
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

    }
}