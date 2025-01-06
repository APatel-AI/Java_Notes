# Hierarchy of exceptions Notes
Java is primarily an objected-oriented language. In such a paradigm, all exceptions are considered objects of special classes organized into a classs hierarchy. Understanding this hierarchy is essential both for interviews and daily programming practice. 

![Screen Shot 2025-01-06 at 4 05 56 PM](https://github.com/user-attachments/assets/f3e99465-3c52-4910-b7f5-a4e9d822ad1b)

- The base class for all exceptions is `java.lang.Throwable`. This class provides a set of common methods for all exceptions:
  - `String getMessage()` returns the detailed string message of this exception object;
  - `Throwable getCasue()` returns the cause of this exception or `null` if the clause is nonexsistent or unknown;
  - `printStackTrace()` prints the stack tree on the standard error stream.
  - WHAT IS StackTrace: In Java, a stack trace is a feature that helps you understand the sequence of method calls during program execution, and can be useful for debugging applications.

 The `Throwable` class has 2 direct subclasses: 
    - `java.lang.Error`
    - `java.lang.Exception`
 - subclasses of the Error class represent low-level exceptions in the JVM, for example: OutOfMemoryError, StackOverflowError;

- subclasses of the Exception class deal with exceptional events inside applications, such as: RuntimeException, IOException;

- the RuntimeException class is a rather special subclass of Exception. It represents so-called unchecked exceptions, including: ArithmeticException, NumberFormatException, NullPointerException.

# Checked and Unchecked exceptions
All exceptions can be divided into 2 groups: checked and unchecked. They are functionally equivalent but there is a difference from the compiler's POV. 

1. Checked Exceptions are represented by the `Exception ` class, excluding the `RuntimeException` subclass. The compiler checks whether the programmer expects the occurrence of such exceptions in a program or not. If a method throws a checked exception, this must be marked in the `declaration` using the special `throws` keyword. Otherwise, the program will not compile. A declaration in java is a statement that introduces a variable, method, or a class into the program.

## Example
In the code below, we use the `Scanner` class
```
public static String readLineFromFile() throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("file.txt")); // throws java.io.FileNotFoundException
    return scanner.nextLine();
}
```
FileNotFoundException is a standard checked exception. This constructor of Scanner declares that it may throw the FileNotFoundException exception if the specified file does not exist. To ensure that this method can be compiled successfully, we must include the throws keyword in the method declaration to indicate that the method may throw the FileNotFoundException exception. As a result, the caller of this method will need to decide whether to either handle the exception internally or throw it further to its caller method.

2. Unchecked exceptions are represented by `RuntimeException` class and all its subclasses. The compiler does not check whether the programmer expects the occurrence of such exceptions in a program. Below is a method that throws a `NumberFormatException` when the input string has an invalid format (e.g., "abc")

```
public static Long convertStringToLong(String str) {
    return Long.parseLong(str); // It may throw a NumberFormatException
}

```
This code always successfully compiles without the throws keyword in the declaration.

# CONCLUSION
All exceptions are represented by the Throwable class, which has two subclasses: Exception and Error. There are also two types of exceptions: checked and unchecked.

Unchecked exceptions are not validated by the compiler, so you don't have to handle them. They are represented by the RuntimeException subclass of the Exception class. Errors from the Error class are also considered unchecked.

Checked exceptions have to be handled and indicated explicitly. They are located in all the other subclasses of Exception.
