# JAR files
## What is a Java Archive ? 
A Java Archive (JAR) is a platform-independent file format to pack multiple files together and distribute them as a single unit. So it comes in handy if your application contains lots of files.

### Main benefits of a JAR file: 
- it can aggregate multiple files of different types
- it is a compressed archive (with a ZIP algorithm) that reduces the size of the application and makes it easier to move it over a network;
- you can digitally sign it (this feature won't be discussed in this topic).

A JRE can start an application packed into a JAR, but to create a JAR you need to use a JDK.

## The structure of a JAR file
A JAR file is simply an aggregation of bytecode files (.class), configuration files (e.g., .json, .xml), images, and even sound clips into a single compressed file. All files except bytecode files are usually called resources. It is also recommended that a JAR file contains a special file named MANIFEST.MF in a special folder named META-INF. This file should describe the JAR file itself (a manifest is a kind of metadata): its version, the author, and so on.

Usually, a JAR file has a set of .class files grouped by packages. For now, just imagine a package as a directory or some nested directories. In our example, there are two packages: second and third/another. Also, to represent a specific package name dots are used instead of slashes (so third.another notation would be correct in this case). Finally, there are some rules for naming the packages. For instance, a name can contain letters and digits, but no hyphens (-).

As you can see, a JAR may have several packages and many .class files and/or resources in these packages.

The manifest file has a set of headers. The name and the value are separated by a colon (:). Take a look at a small example below:
```
Manifest-Version: 1.0
Created-By: 9.0.1 (Oracle Corporation)
Main-Class: second.Main
```
The key feature here is the optional header Main-Class that defines the relative path of a class with the main method to start the application. The value shouldn't have the .class extension appended to the class name.


## Running a JAR file
There are two ways to run a JAR file, depending on whether you want to use the Main-Class header in the manifest file or not.

- if this header is not present or you want to specify the main class manually, run:
  - `java -cp app-without-main-class-header.jar path.to.Main`
- The last parameter here is the full class name (with packages). The -cp option means classpath, i.e., paths to all the JARs which the JRE should scan for bytecode and resources. If you want, you can repeat multiple -cp path-to-Nth.jar pairs of parameters to provide the JRE with multiple different JAR files.

- if this header is present, then run:
`java -jar app-with-main-class-header.jar`

