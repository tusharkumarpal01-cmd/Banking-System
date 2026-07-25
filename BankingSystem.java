import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANK ACCOUNT CREATION =====");

        System.out.print("Enter Account Holder Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number : ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance : ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, balance);

        int choice;

        do {

            System.out.println("\n========== BANK MENU ==========");

            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Deposit Amount : ");

                    double deposit = sc.nextDouble();

                    account.deposit(deposit);

                    break;

                case 2:

                    System.out.print("Enter Withdrawal Amount : ");

                    double withdraw = sc.nextDouble();

                    account.withdraw(withdraw);

                    break;

                case 3:

                    account.checkBalance();

                    break;

                case 4:

                    account.showTransactionHistory();

                    break;

                case 5:

                    account.displayDetails();

                    break;

                case 6:

                    System.out.println("Thank You for Using Banking System.");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        } while (choice != 6);

        sc.close();
    }
}
