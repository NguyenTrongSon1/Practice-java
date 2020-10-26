package practice;

public class Bank {
    private double balance;
    private double rate;

    public Bank(){
        this.balance = 0;
        this.rate = 0;
    }
    public Bank(double balance,double rate){
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double calculateInterest(){
        double annualInterestRate = rate/10*100;
        return balance * (annualInterestRate/1200);
    }
    @Override
    public String toString() {
        return "interest = " + calculateInterest();
    }
}

