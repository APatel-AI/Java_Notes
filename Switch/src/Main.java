

public class Main{
    public static void main(String args[]){

        int switchValue = 3; 

        //traditional switch statement
        // switch (switchValue){
        //     case 1:
        //         System.out.println("Value was 1");
        //         break;

        //     case 2:
        //         System.out.println("Value was 2");
        //         break;
        //     case 3:
        //         System.out.println("Value was a 3, a 4, or a 5");
        //         System.out.println("Actually it was a " + switchValue);
        //         break;
        //     default:
        //         System.out.println("Was not 1, 2, 3, 4, or 5");
        //         break;
        // }
        
        // enhanced switch statement
        switch (switchValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");

        }

        //calling method
        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter") ;

    }

    public static String getQuarter(String month){
        return switch(month){
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad";
        };
    }
}