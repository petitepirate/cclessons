public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
  //_______________________________________________________________________
// HELLO WORLD
// Hello Java File!
// Java runs on different platforms, but programmers write it the same way. 
// Let’s explore some rules for writing Java.

// In the last exercise, we saw the file HelloWorld.java. Java files have a 
// .java extension. Some programs are one file, others are hundreds of files!

// Inside HelloWorld.java, we had a class:

public class HelloWorld2 {

}
// We’ll talk about classes more in the future, but for now think of them 
// as a single concept.

// The HelloWorld concept is: Hello World Printer. Other class concepts 
// could be: Bicycle, or: Savings Account.

// We marked the domain of this concept using curly braces: {}. Syntax 
// inside the curly braces is part of the class.

// Each file has one primary class named after the file. Our class name: 
// HelloWorld and our file name: HelloWorld. Every word is capitalized.

// Inside the class we had a main() method which lists our program tasks:

public static void main(String[] args) {

}
// Like classes, we used curly braces to mark the beginning and end of a 
// method.

// public, static, and void are syntax we’ll learn about in future lessons. 
// String[] args is a placeholder for information we want to pass into our 
// program. This syntax is necessary for the program to run but more advanced 
// than we need to explore at the moment.

// Our program printed “Hello World” with the line:

System.out.println("Hello World");
// println is short for “print line”. We’ll use System.out.println() whenever 
// we want a program to write a message to the screen.
//________________________________________________________________________
// 1.
// The text editor has a file, HelloYou.java, that contains a HelloYou class with 
// a main() method.

// Inside main(), add a statement which prints Hello someName!, with your name 
// replacing someName. Make sure to end the statement with a semicolon.

// For example, if your name were “Maria,” the program would print Hello Maria!.
public class HelloYou {
    public static void main(String[] args) {
      System.out.println("Hello Megan!");
      }
  }
  //_______________________________________________________________________
//   Commenting Code
// Writing code is an exciting process of instructing the computer to complete 
// fantastic tasks.

// Code is also read by people, and we want our intentions to be clear to humans 
// just like we want our instructions to be clear to the computer.

// Fortunately, we’re not limited to writing syntax that performs a task. We can 
// also write comments, notes to human readers of our code. These comments are 
// not executed, so there’s no need for valid syntax within a comment.

// When comments are short we use the single-line syntax: //.

// calculate customer satisfaction rating
// When comments are long we use the multi-line syntax: /* and */.

/*
We chose to store information across multiple databases to
minimize the possibility of data loss. We'll need to be careful
to make sure it does not go out of sync!
*/
// Here’s how a comment would look in a complete program:

public class CommentExample {
  // I'm a comment inside the class
  public static void main(String[] args) {
    // I'm a comment inside a method
    System.out.println("This program has comments!");
  }
}
// Comments are different from printing to the screen, when we use 
// System.out.println(). These comments won’t show up in our terminal, 
// they’re only for people who read our code in the text editor.
// 1.
// The file Timeline.java has plain text information about Java.

// Plain text facts aren’t valid syntax. We’ll use comments to avoid breaking the program.

// Use the single-line comment syntax for the first fact.

// Change this line into a comment:

// Sun Microsystems announced the release of Java in 1995


// 2.
// Our program is still broken!

// Use the multi-line syntax to make these lines into a single comment:

//     James Gosling is a Canadian engineer who created Java while
//     working at Sun Microsystems. His favorite number is the
//     square root of 2!
// You should still see You are a fun language! printed!

public class Timeline {
    public static void main(String[] args) {
      System.out.println("Hello Java!");
      
      System.out.println("You were born in 1995");
  
      //Sun Microsystems announced the release of Java in 1995
      
      System.out.println("You were created by James Gosling");
      
          /*James Gosling is a Canadian engineer who 
          created Java while working at Sun Microsystems. 
          His favorite number is the square root of 2!*/
      
      System.out.println("You are a fun language!");
    }
  } 
  
//_______________________________________________________________________

// Semicolons and Whitespace
// As we saw with comments, reading code is just as important as writing code.

// We should write code that is easy for other people to read. Those people can 
// be co-workers, friends, or even yourself!

// Java does not interpret whitespace, the areas of the code without syntax, 
// but humans use whitespace to read code without difficulty.

// Functionally, these two code samples are identical:

// System.out.println("Java");System.out.println("Lava");System.out.println("Guava");
// System.out.println("Java");

// System.out.println("Lava");

// System.out.println("Guava");
// They will print the same text to the screen, but which would you prefer to 
// read? Imagine if it was hundreds of instructions! Whitespace would be essential.

// Java does interpret semicolons. Semicolons are used to mark the end of a 
// statement, one line of code that performs a single task.

// The only statements we’ve seen so far are System.out.println("My message!");.

// Let’s contrast statements with the curly brace, {}. Curly braces mark the 
// scope of our classes and methods. There are no semicolons at the end of a 
// curly brace.

// Instructions
// 1.
// The LanguageFacts.java file prints information about Java to the screen.

// Unfortunately, the writer of the file has avoided using whitespace.

// Make the file easier to read by adding a newline after each statement!

// Checkpoint 2 Passed

// Stuck? Get a hint
// 2.
// Inside main(), add a new statement printing how you feel about coding.

// Start the message with: “Programming is… “.

// Remember to place a semicolon at the end of the statement!
public class LanguageFacts {
    public static void main(String[] args) {
      // Press enter or return on your keyboard after each semicolon!
      System.out.println("Programming is wonderful.");   
      System.out.println("Java is a class-based language.");
      System.out.println("Java classes have a 'main' method.");
      System.out.println("Java statements end with a semicolon.");
    }
  }
//_______________________________________________________________________
// Compilation: Catching Errors
// Java is a compiled programming language, meaning the code we write in a 
// .java file is transformed into byte code by a compiler before it is executed 
// by the Java Virtual Machine on your computer.

// A compiler is a program that translates human-friendly programming languages 
// into other programming languages that computers can execute.

// Steps of Java Compilation
// Previous exercises have automatically compiled and run the files for you. 
// Off-platform development environments can also compile and run files for 
// you, but it’s important to understand this aspect of Java development so 
// we’ll do it ourselves.

// The compiling process catches mistakes before the computer runs our code.

// The Java compiler runs a series of checks while it transforms the code. 
// Code that does not pass these checks will not be compiled.

// This exercise will use an interactive terminal. Codecademy has a lesson 
// on the command line if you’d like to learn more.

// For example, with a file called Plankton.java, we could compile it with 
// the terminal command:

// javac Plankton.java
// A successful compilation produces a .class file: Plankton.class, that 
// we execute with the terminal command:

// java Plankton
// An unsuccessful compilation produces a list of errors. No .class file 
// is made until the errors are corrected and the compile command is run again.

// Instructions
// 1.
// Let’s practice compiling and executing a file by entering commands 
// in the terminal!

// Our text editor contains a broken program so we can see how compilers 
// help us catch mistakes. Don’t make any corrections!

// In the terminal, type this command: javac Compiling.java and press 
// enter or return.

// Use the Check Work button to progress through checkpoints.

// Checkpoint 2 Passed

// Stuck? Get a hint
// 2.
// Do you see the error?

// The compiler is telling us one of the print statements is missing a s
// emicolon.

// In the terminal, type ls and press return or enter.

// ls is short for "list" and this command lists all the available files.

// There is only one file: Compiling.java, we did not successfully compile 
// the file because of the error.

// Checkpoint 3 Passed

// Stuck? Get a hint
// 3.
// Add the missing semicolon in the text editor.

// We’ll compile and execute this file in the next exercise!
public class Compiling {
    public static void main(String[] args) {
      
      System.out.println("Java is a class-based language.");
      System.out.println("Java classes have a 'main' method.");
      System.out.println("Java statements end with a semicolon.");
  
      System.out.println("Programming is... fun!");
      
    }
  }
  //In Terminal
//   $ javac Compiling.java
//   Compiling.java:6: error: ';' expected
//       System.out.println("Java statements end with a semicolon.")
//                                                                  ^
//   1 error
//   $ ls
//   Compiling.java
//   $ ls
//   Compiling.java
//_______________________________________________________________________

// Compilation: Creating Executables
// Compilation helped us catch an error. Now that we’ve corrected the file, 
// let’s walk through a successful compilation.

// As a reminder, we can compile a .java file from the terminal with the command:

// javac Whales.java
// If the file compiles successfully, this command produces an executable 
// class: FileName.class. Executable means we can run this program from the 
// terminal.

// We run the executable with the command:

// java Whales
// Note that we leave off the .class part of the filename.

// Here’s a full compilation cycle as an example:

// within the file: Welcome.java
public class Welcome {
  public static void main(String[] args) {
    System.out.println("Welcome to Codecademy's Java course!");
  }
}
// We have one file: Welcome.java. We compile with the command:

// javac Welcome.java
// The terminal shows no errors, which indicates a successful compilation.

// We now have two files:

// Welcome.java, our original file with Java syntax.
// Welcome.class, our compiled file with Java bytecode, ready to be executed 
// by the Java Virtual Machine.
// We can execute the compiled class with the command:

// java Welcome
// The following is printed to the screen:

// Welcome to Codecademy's Java course!

// 1.
// Let’s compile and execute our program!

// Run the ls command in the terminal to see the uncompiled .java file.

// Checkpoint 2 Passed

// Stuck? Get a hint
// 2.
// Compile the file from the terminal!

// Checkpoint 3 Passed

// Stuck? Get a hint
// 3.
// Enter ls again to see the new .class file.

// Run the executable file from the terminal!

public class Compiling {
    public static void main(String[] args) {
      
      System.out.println("Java is a class-based language.");
      System.out.println("Java classes have a 'main' method.");
      System.out.println("Java statements end with a semicolon.");
  
      System.out.println("Programming is... fun!");
      
    }
  }

//   In Terminal
//   $ ls
//   Compiling.java
//   $ javac Compiling.java
//   $ ls
//   Compiling.class  Compiling.java
//   $ java Compiling
//   Java is a class-based language.
//   Java classes have a 'main' method.
//   Java statements end with a semicolon.
//   Programming is... fun!
//_______________________________________________________________________

// Java Review: Putting It All Together
// In this lesson, we’ve started writing our first programs in Java.

// We’ve also learned rules and guidelines for how to write Java programs:

// Java programs have at least one class and one main() method.
// Each class represents one real-world idea.
// The main() method runs the tasks of the program.
// Java comments add helpful context to human readers.
// Java has whitespace, curly braces, and semicolons.
// Whitespace is for humans to read code easily.
// Curly braces mark the scope of a class and method.
// Semicolons mark the end of a statement.
// Java is a compiled language.
// Compiling catches mistakes in our code.
// Compilers transform code into an executable class.
// Instructions
// 1.
// The text editor holds an empty file named Review.java. Fill it in!

// Define a public class named Review.

// Use opening and closing curly braces for the scope of the class.

// Remember, no semicolons for classes or methods!

// Checkpoint 2 Passed

// Stuck? Get a hint
// 2.
// This code produces an error because Java programs need a main() method.

// Define the main() method within the curly braces of the Review class.

// Checkpoint 3 Passed

// Stuck? Get a hint
// 3.
// Inside of the curly braces for the main() method, write The main method 
// executes the tasks of the class as a single-line comment.

// Checkpoint 4 Passed

// Stuck? Get a hint
// 4.
// Below the comment, write a statement that prints the following: My first 
// Java program from scratch!.

public class Review {
    public static void main(String[] args) {
      
      //The main method executes the tasks of the class
      System.out.println("My first Java program from scratch!");
      
    }  
}
//_______________________________________________________________________
