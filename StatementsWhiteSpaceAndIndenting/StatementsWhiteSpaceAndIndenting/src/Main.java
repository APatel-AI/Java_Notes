public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // myVariable = 50 is the expression and "int myVariable = 50;" is the statement
        myVariable++; //with the semicolon this is a complete statement and without the semicolon it is just an expression
        myVariable--;

        System.out.println("This is a test");

        //you can continue to print statement on mutiple lines
        System.out.println("This is"
                + " another"
                + " still more."); // it is completed with the closing parenthesis and the semicolon

        //multiple statements can be written on a single line (not reccomended for readability)
        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);
        System.out.println("Converting the value of the variable 'myVariable' to equal 0 ");
        myVariable -= 49;

        if (myVariable == 0){
            System.out.println("It's now zero!!!!!");
        }
    }
}
