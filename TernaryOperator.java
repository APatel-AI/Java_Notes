public class TernaryOperator {
    public static void main(String[] args){
        // Ternary Operator: has 3 operands. The only operator currently in java that does have 3. Officially java calls it the conditional operator.
        // operand1 ? operand2 : operand3
        // if true ? return this : else return this
        // must be boolean : does not have to be boolean : does not have to be boolean

        String makeOfCar = "Volkswagen"; 
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true; // if makeOfCar is true then ? set it to false : else set it true

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }else{
            System.out.print("NOPE");
        }


    }
    
}
