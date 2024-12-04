

public class challenge{
    public static void main(String[] args){
        double firstDoubleValue = 20.00;
        double secondDoubleValue = 80.00;

        double result = 100 *(firstDoubleValue + secondDoubleValue);
        double remainder = result % 40;

        System.out.println("The total value is " + result);

        System.out.println("The remainder is " + remainder );

        boolean value = (remainder == 0.00) ? true : false;

        System.out.println(value);
        

        if (remainder > 0.00){
            System.out.println("got some remainder");
        } else {
            System.out.print("no remainder");
        }

        


    }
}