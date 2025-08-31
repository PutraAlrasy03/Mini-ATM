import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double Balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("********************");
            System.out.println("Banking Program");
            System.out.println("********************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("********************");
            System.out.print("Enter Your Choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(Balance);
                case 2 -> Balance = Balance + deposit();
                case 3 -> Balance = Balance - withdraw(Balance);
                case 4 -> {
                    isRunning = false;
                }
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("********************");
System.out.println("Thank You and Have a nice day !");
 System.out.println("********************");

        scanner.close();
    }

    static void showBalance(double Balance) {
        System.out.println("********************");
        System.out.printf("Your Current Balance: RM%.2f\n", Balance);
        System.out.println("********************");
    }

    static double deposit() {
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            System.out.println("Successfully deposited RM" + amount);
            return amount;
        }
    }

    static double withdraw(double Balance) {
        System.out.println("********************");
        System.out.println("WITHDRAW MENU");
        System.out.println("********************");
        System.out.print("Enter amount to be withdrawn: ");
        double amount = scanner.nextDouble();

        if (amount > Balance) {
            System.out.println("Insufficient Funds!");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;
        } else {
            System.out.println("Successfully withdrawn RM" + amount);
            return amount;
        }
    }


}
