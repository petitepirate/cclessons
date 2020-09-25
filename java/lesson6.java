// METHODS
// _________________________________________________________
// We have made a SavingsAccount class without using any methods 
// beyond main() and the constructor, SavingsAccount().

// Run the code to see some account behavior happen.

// Look at the main method! It’s so long! There is so much repeated 
// code! Can you imagine how messy it would look if you needed to 
// make 10 deposits?

// Throughout this lesson, we will learn how to make methods that 
// would make checking the balance, depositing, and withdrawing 
// all behavior that would take only one line of code.

public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);

        // Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

        // Withdrawing:
        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew " + 300);

        // Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

        // Deposit:
        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposited " + 600);

        // Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

        // Deposit:
        int afterDeposit2 = savings.balance + 600;
        savings.balance = afterDeposit2;
        System.out.println("You just deposited " + 600);

        // Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is " + savings.balance);

    }
}

// _________________________________________________________

public class Store {
    // instance fields
    String productType;

    // constructor method
    public Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }

    // main method
    public static void main(String[] args) {

    }
}
// _________________________________________________________

public class Store {
    // instance fields
    String productType;

    // constructor method
    public Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}

// _________________________________________________________
public class Store {
    // instance fields
    String productType;

    // constructor method
    public Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        String cookie = "Cookies";
        Store cookieShop = new Store(cookie);

        cookieShop.advertise();
    }
}

// _________________________________________________________

public class Store {
    // instance fields
    String productType;

    // constructor method
    public Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade");
        lemonadeStand.greetCustomer("Wanda");
    }
}

// _________________________________________________________
public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        lemonadeStand.increasePrice(1.5);
        System.out.println(lemonadeStand.price);
    }
}
// _________________________________________________________

public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax() {
        double totalPrice = price + price * 0.08;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        double lemonadePrice = lemonadeStand.getPriceWithTax();
        System.out.println(lemonadePrice);
    }
}

// _________________________________________________________

public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax() {
        double tax = 0.08;
        double totalPrice = price + price * tax;
        return totalPrice;
    }

    public String toString() {
        return "This store sells " + productType + " at a price of " + price + ".";
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        Store cookieShop = new Store("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }
}

// _________________________________________________________
public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit) {
        balance = amountToDeposit + balance;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    public String toString() {
        return "This is a savings account with " + balance + " saved.";
    }

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(2000);

        // Check balance:
        savings.checkBalance();

        // Withdrawing:
        savings.withdraw(300);

        // Check balance:
        savings.checkBalance();

        // Deposit:
        savings.deposit(600);

        // Check balance:
        savings.checkBalance();

        // Deposit:
        savings.deposit(600);

        // Check balance:
        savings.checkBalance();

        System.out.println(savings);
    }
}
// _________________________________________________________
