package entities;

public class SavingsAccount extends Account{

    private Double InterestRate;

    public SavingsAccount() {
        super();
    }

    //faz o construtor com o super que já traz os atributos da superclasse Account.
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.InterestRate = interestRate;
    }

    public Double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(Double interestRate) {
        InterestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * InterestRate;
    }
}
