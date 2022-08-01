package Class;

public class SavingsAccount {
    double balance;
    double interestRate;
    String name;

    //Constructor bisa 2, menggunakan param dan tidak param secara bersamaan
    //Default Constructor without param
    public SavingsAccount(){
        balance = 100;
        interestRate = 0.2;
        name = "Noname";
    }
    //Default Constructor with param
    public SavingsAccount(double balance, double interestRate, String name){
        this.balance = balance;
        this.interestRate = interestRate;
        this.name = name;
    }

    public void display(){
        System.out.println("Balance: "+ balance);
        System.out.println("Interest Rate: "+ interestRate);
        System.out.println("Name: "+ name);
    }

    public void deposit(double n){
        balance += n;
        System.out.println("Successfully deposit an amount of " + n);
    }

    public void withdraw(double n ){
        if(n > balance){
            System.out.println("You can't withdraw a total of " +n);
        }
        else {
            balance -= n;
            System.out.println("Successfully withdraw an amount of " + n);
        }
    }
}

class AccountTest{
    public static void main(String[] args) {
        SavingsAccount S1 = new SavingsAccount();
        S1.display();
        S1.name.length();
        SavingsAccount S2 = new SavingsAccount();
        S2.display();
        S2.name.length();
    }
}
