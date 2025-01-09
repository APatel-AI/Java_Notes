# Retrieving class instances
- The `java.lang.Class` takes a central place in the reflection package. It represents a structure of classes and interfaces by aggregating information on constructors, fields, methods, superclasses, interfaces, and so on.
- In other words, if you have an instance of a class of a specific type, you can obtain all information about the type. That's why java.lang.Class is so important

# The `.class` Syntax
- To retrieve a `Class` instance for a given type we can use `.class` construction.
- `Class stringClass = String.class;`
- The `.class` is simply added to the name of the type. This way of obtaining a  `Class` object is useful if we don't have any instances of the class availabel.

- This is also the easiest way to obtain the Class for a primitive type and even void:

- In Java, a primitive type is one of eight built-in data types provided by the language.

  
