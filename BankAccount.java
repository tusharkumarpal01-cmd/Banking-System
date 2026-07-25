import java.util.ArrayList;


public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    ArrayList<String> transactionHistory = new ArrayList<>();


    public BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder= accountHolder;
        this.accountNumber= accountNumber;
        this.balance= balance;

        transactionHistory.add("Account Created with Balance :$"+ balance);

    }

    public void deposit(double amount){
        if(amount >0){
            balance +=amount;
            transactionHistory.add("Deposited : $"+amount);

            System.out.println("Deposit Successful.");
        }else{

            System.out.println("Invalid Amount.");
        }
    }

    public void withdraw(double amount){

        if(amount <=0){
            System.out.println("Invalid Amount.");
        }else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        }else{

            balance -= amount;

            transactionHistory.add("Withdrawn: $"+amount);
            System.out.println("Withdrawal Successful.");
        }
    }


    public void checkBalance(){
        System.out.println("Current Balance : $"+ balance);
    }

    public void showTransactionHistory(){
        System.out.println("\n-----Transaction History-----");

        for(String transaction : transactionHistory){

            System.out.println(transaction);
        }
    }

    public void displayDetails(){

        System.out.println("\n Account Holder : "+accountHolder);
        System.out.println("Account Number : "+ accountNumber);
        System.out.println("Balance : $ "+balance);
    }
}

