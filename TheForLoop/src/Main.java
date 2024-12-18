public class Main{
    public static void main(String[] args){
        // // prints 1-6
        // for(int counter = 1; counter <= 6; counter ++){
        //     System.out.println(counter);
        // }


        int count = 0;

        for(int i = 10; i <= 50; i++){
            if (isPrime(i)){
                System.out.println(i);
                count++;
                if (count == 3){
                    break;
                }
            }
            
        }
    }

    public static boolean isPrime(int number){
        if (number <= 2){
            return (number == 2);
        }

        for (int divisor = 2; divisor <= number / 2; divisor ++){
            if(number % divisor == 0 ){
                return false;
            }
        }
        return true;
    }
}