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

    //Method to withdraw a value of an account. (método para retirar um valor da conta).
    //além de sacar o valor que o cliente escolheu (amount) ainda tem que pagar um valor de 5.0 para a Account. Já na SavingsAccount esses 5.0 não é cobrado, faço a sobrescrita...
    // ... desse método lá na classe SavingsAccout e coloco a anotação @Override.
    public void withDraw(double amount) {
        balance -= (amount + 5.0);
    }

    //Method to deposit account. (método para depositar um valor na conta)
    public void deposit(double amount) {
        balance += amount;
    }


}
