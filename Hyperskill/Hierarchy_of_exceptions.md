# Null PointerException

## What is NPE
Java provides a special type of value called `null` to indicate that no actual value is assigned to reference variable.

- Reference Variable: In Java, a reference variable is a variable that refers to an object or instance of a class.

This Value may cause one of the most frequent exceptions called `NullPointerException` (often reffered to as NPE for short).
It occurs when a program attempts to use a variable with the null value. To avoid an NPE, the programmer must ensure that the objects are initialized before their use.

## Fun fact:
Here is one interesting fact about the concept of a null reference and errors associated with it. Not only is it not unique for Java, but in 2009, Tony Hoare, a British Computer Scientist who invented the concept of null reference, described it as a "billion-dollar mistake":


## NPE when invoking a method
Since `String` is a regular reference type, its variables can be `null`. If we invoke a method or apply an operation to such a variable, the code throws an NPE.

In the following code, an uninitialized variable of String is created and then the method length() is invoked. The code throws an NPE because the object someString is actually null.


```
String someString = null; // a reference type can be null

int size = someString.length(); // NullPointerException (NPE)
```

The same exception will occur if we use uninitialized variables of any other reference type, not only `String`.



To avoid the exception we should explicitly check whether a string is `null` or not and depending on the result perform different code. It's similar to the default value.

```
int size = someString != null ? someString.length() : 0; // if the string is null, the size is 0
```


## Comparing Strings
A very common situation occurs when we try to compare a `String` variable and a string literal.

```
String str = null;

if (str.equals("abc")) { // it throws an NPE
    System.out.println("The same");
}
```

To avoid an NPE here we can use Yoda notation and call the equals method on the literal rather than the object:

