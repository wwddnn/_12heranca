package entities;

//Essa classe vai extender a classe Account, ela é uma subclasse da superclasse Account.
//Essa classe vai ter todos os dados e comportamentos da classe Account.
public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount() {
    }

    //The constructor have the 'super'. (O super vem da superclasse Account, sao os atributos dessa superclasse).
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit){
        this.loanLimit = loanLimit;
    }

    //o emprestimo tem o mesmo efeito de depositar na conta.
    //para acessar o atributo balance que é da superclasse Account, tenho que lá mudar o modificador de acesso para 'protected'
    //obs. protected: pode acessar o atributo no mesmo pacote em outras classes, ou entao pode acessar sendo subclasse em qq pacote...
    //que é esse exemplo onde a subclasse BusinessAccount extende a superclasse Account. ou seja aqui é uma herança.
    //obs. private:  só pode ser acessado pela propria classe Account por ninguem mais!
    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    //uso da palavra 'super'. serve para chamar a implementacao da superclasse.
    //nesse exemplo usa o super que vai fazer o que o metodo withDraw ja faz na classe Account. E na linha de baixo vai ainda pegar o balance e ainda um valor adicionar de 2.0;
    @Override
    public void withDraw(double amount) {
        super.withDraw(amount);   //vou efetuar normalmente o saque (withDraw) da classe Account. obs. reutilizei o código que já esta na sueprclasse.
        balance -= 2.0;   //só que agora vou também descontar do saldo o valor de 2.0
    }
}
