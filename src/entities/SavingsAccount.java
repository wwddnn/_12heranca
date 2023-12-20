package entities;

public  class SavingsAccount extends Account{

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

    //aqui esta o metodo withDraw sobrescrito, por isso a anotação @Override. é uma sobreposição de método.
    //aqui ele esta sobrescrito e vou implementar ele de forma diferente, ou seja, nao tem o 5.0 para pagar conforme tem no metodo withDraw da Account.
    @Override
    public void withDraw(double amount) {
        balance -= amount;
    }
}
