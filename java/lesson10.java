
// _________________________________________________________
import java.util.Arrays;

class Shopping {
  
  public static void main(String[] args) {
    
    String[] groceryItems = {"steak", "milk", "jelly beans"};
    double[] prices = {25.00, 2.95, 2.50};
    
    // Adding ham to the groceries
    groceryItems[3] = "ham";
    prices[3] = 4.99;
    
  }
  
}// throws an error due to having the array length already defined
 // _________________________________________________________
 // import the ArrayList package here:
import java.util.ArrayList;

class ToDos {
  
  public static void main(String[] args) {
    
    // Create toDoList below:
    ArrayList<String> toDoList = new ArrayList<String>();
  }
  
}
// _________________________________________________________
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    ArrayList<String> toDoList = new ArrayList<String>();
    String toDo1 = "Water plants";
    // Add more to-dos here:
    String toDo2 = "Shenanigans";
    String toDo3 = "Shenanigans2";
    
    // Add to-dos to toDoList
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    
    System.out.println(toDoList);
      
    
  }
  
}
// _________________________________________________________
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Print the size of each ArrayList below:
    System.out.println(poirotsToDos.size());
    System.out.println(sherlocksToDos.size());
      
    // Print the name of the detective with the larger to-do list:
    if (sherlocksToDos.size() > poirotsToDos.size()) {
      System.out.println("Sherlock");
    } else {
      System.out.println("Poirot");
    }
  }
  
}
// _________________________________________________________
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    System.out.println("Sherlock's third to-do:");
    // Print Sherlock's third to-do:
    System.out.println(sherlocksToDos.get(2));
    
    System.out.println("\nPoirot's second to-do:");
    // Print Poirot's second to-do:
    System.out.println(poirotsToDos.get(1));
    
  }
  
}
// _________________________________________________________
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Set each to-do below:
    sherlocksToDos.set(1, "listen to Dr. Watson for amusement");
    poirotsToDos.set(3, "listen to Captain Hastings for amusement");
    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());
  }
  
}
// _________________________________________________________
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
    // Remove each to-do below:
    sherlocksToDos.remove("visit the crime scene");
    poirotsToDos.remove("visit the crime scene");
    sherlocksToDos.remove("play violin");  
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println(poirotsToDos.toString());
  }
  
}
// _________________________________________________________
import java.util.ArrayList;

class ToDos {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("listen to Dr. Watson for amusement");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    sherlocksToDos.remove("visit the crime scene");
    
    // Calculate to-dos until case is solved:
    int numRemaining = sherlocksToDos.indexOf("solve the case");
      
    // Change the value printed:
    System.out.println(numRemaining);

  }
  
}
// _________________________________________________________
// Review
// Nice work! You now know the basics of ArrayLists including:

// Creating an ArrayList.
// Adding a new ArrayList item using add().
// Accessing the size of an ArrayList using size().
// Finding an item by index using get().
// Changing the value of an ArrayList item using set().
// Removing an item with a specific value using remove().
// Retrieving the index of an item with a specific value using indexOf().
// Now if only there were some way to move through an array or ArrayList, item
// by item…

import java.util.ArrayList;

class List {

    public static void main(String[] args) {

    }

}

// RUN YOUR CODE IN TERMINAL BY RUNNING: java List

// _________________________________________________________
