package entities;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    //Method to withdraw a value of an account. (método para retirar um valor da conta)
    public void withDraw(double amount) {
        balance -= amount;
    }

    //Method to deposit account. (método para depositar um valor na conta)
    public void deposit(double amount) {
        balance += amount;
    }


}
