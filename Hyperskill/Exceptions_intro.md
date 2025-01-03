# First glance at exceptions
Some errors in your code do not prevent the program from running and, in this case, the program will only crash while trying to execute a "broken" line: a line with an error called an exception. Thus, exceptions are the errors detected during the program execution (at runtime), whereas syntax errors are those detected during compiling the program into byte-code. An exception interrupts the normal execution of a program.

# ArithmeticException
Suppose you are writing a program that reads two integers from the standard input and then outputs the result of the integer division of the first number by the second one. Take a look at the code below.

```
import java.util.Scanner;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a / b); // an exception is possible here!
        System.out.println("finished");
    }
}

```

If the user passes 9 and 3 as the input values, the program outputs 3 as well as the "finished" string. But if the second number is 0, the program throws an exception because of the division by zero, and the "finished" string is not printed at all.

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
  at ArithmeticExceptionDemo.main(ArithmeticExceptionDemo.java:11)
```

