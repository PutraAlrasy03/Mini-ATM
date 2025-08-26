import java.util.Scanner;

public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[]args)
{
    
    double Balance = 0;

    boolean isRunning = true;
    int choice;

    while(isRunning){

    System.out.println("********************");
    System.out.println("Banking Program");
    System.out.println("********************");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");
    System.out.println("********************");

    System.out.println("Enter Your Choice (1-4): ");
    choice = scanner. nextInt();

    switch (choice) {
        case 1 -> showBalance(Balance);
        case 2 -> Balance = Balance + deposit();
        case 3 -> System.out.println("WITHDRAW");
        case 4 -> isRunning = false;
        default -> System.out.println("INVALID CHOICE");
    }
    }


    scanner.close();
}
static void showBalance(double Balance){
    
    System.out.println("********************");
    System.out.printf("RM%.2f\n",Balance);
}

static double deposit(){
    double amount;
    System.out.println("Enter an amount to be deposited:");
    amount = scanner.nextDouble();
    if(amount < 0){
        System.out.println("Amounr cant be negative");
        return 0;
    }
    else{
        return amount;
    }
    
}
}
