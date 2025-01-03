public class Main{
    public static void main(String args[]){
        System.out.println(getDurationString(3945));
        System.out.println(gettDurationString(65, 45));
    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int minutes = seconds / 60;
            return gettDurationString(minutes, seconds);
        }
        return "Not valid";
        
    }

    public static String gettDurationString(int minutes, int seconds){
        if (minutes >= 0 && seconds >= 0 && seconds <= 59){
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            int remainingSeconds = seconds % 60;
            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
        }
        return "Not valid";
    }
}