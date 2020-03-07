package _java._se._07;

public class Account {
    private int balance;
   // private Object lock = new Object();

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public  void deposit(int amount) {
        synchronized (this){

            int x = balance + amount;
            balance = x;
        }
    }

    public synchronized void withdraw(int amount) {
        synchronized (this){
            int x = balance - amount;
            balance = x;
        }
    }
}
