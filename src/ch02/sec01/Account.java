package ch02.sec01;

public class Account {

    private int balance;

    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1_000_000;

    public void setBalance(int balance) {
        this.balance = balance;
        if (this.balance < MIN_BALANCE) {
            this.balance = MIN_BALANCE;
        } else if (this.balance > MAX_BALANCE) {
            this.balance = MAX_BALANCE;
        }
    }

    public int getBalance() {
        return this.balance;
    }

}
