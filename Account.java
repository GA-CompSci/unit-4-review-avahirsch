public class Account {
    private float availableBalance;
    private int pin;
    private int accountNumber;
    private String userName;
    // Constructor to initialize balance and pin
    public Account(float balance, int pin, int accountNumber, String userName) {
        this.pin = pin;
        this.availableBalance = balance;
        this.accountNumber = accountNumber;
        this.userName = userName;
    }

    //ACCESSOR METHODS
    public float getBalance(){
        return this.availableBalance;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public String userName(){
        return this.userName;
    }
    //NO ACCESSOR FOR PIN 

    // Method to validate the pin
    public boolean validatePin(int inputPin) {
        return inputPin == this.pin;
    }

    // Method to withdraw amount
    public void withdraw(int amount) {
        if(availableBalance>=amount){
             availableBalance -= amount;
        }
    }

    // Method to deposit an amount
    public void deposit(int amount) {
        availableBalance += amount;
    }
}

