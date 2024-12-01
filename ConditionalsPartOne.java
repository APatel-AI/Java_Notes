// if-then statement: the most basic of all the control flow statments. It tells your program to execute a certain section of code, on if a particular test evaluates to true.
// which is known as conditional logic: statements in Java used to allow us to check a condition, and execute certain code based on whether that condition (the expression) is true or false

public class ConditionalsPartOne {
    public static void main(String[] args){
        
        System.out.println("Hello, Arpan");

        boolean isAlien = false; //isAlien is a variable with the assigned "=" boolean value "false"
        if (isAlien == false){ // here we are checking if the value of the variable "isAlien" is indeed equal to "false" by using the comparison operation "==". 
            System.out.println("It is not an alien!"); // since the condition is true that isAlien is indeed false, the system will print "It is not an alien"
            System.out.println("And I am scared of aliens :(");
        } // without the start and end curly braces, a code block is not present

    }
    
}
