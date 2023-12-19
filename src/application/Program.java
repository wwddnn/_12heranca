package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 100.0, 500.0);

        //Upcasting: é eu pegar um objeto do tipo BusinessAccount e atribuir esse objeto a uma variavel Account.
        //obs BusinessAccount é subclasse, e Account é superclasse.
        //obs veja que da certo, sem problemas.
        //obs aprendemos com a heranca que ela é uma relacao 'é - um' ou seja, toda businessAccount é uma Account.
        Account acc1 = bacc;
        //outro exemplo: tb nao da problemas pois estou atribuindo um objeto da subclasse para uma variavel da superclasse.
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        //mais um exemplo de subclasse sendo colocada em uma variavel do tipo superclasse.
        //obs é perfeitamente normal pegar um objeto de subclasse e atribui-lo a um objeto de uma superclasse. usa muito daqui pra frente com polimorfismo!
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);


        //Downcasting: é pegar um objeto de uma superclasse do tipo Account e atribuir ele a uma variavel de uma subclasse.
        //nesse caso a conversao nao é natural. tenho que fazer um casting natural. coloco entre parenteses o tipo da sublasse para fazer isso. ai o compilador para de reclamar.
        //no acc4 eu consigo fazer por exemplo a operacao loan. pq fiz o downcasting do acc2 que era Account, para BusinessAccount.
        // obs. mas se fosse por exemplo acc2 eu nao conseguiria fazer a operacao loan pq ele é uma variavel do tipo Account mesmo sendo instanciada
        //...como BusinessAccount.
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        //ja na exemplo abaixo ele nao é permitido pq acc3 é uma SavingsAccount(subclasse) e eu quero fazer o downcasting dela para a outra sublasse que é BusinessAccount. isso nao é permitido!
        //obs mas o compilador nao sabe que o acc3 é um SavingsAccount, ele só vai apontar um erro no final na hora da compilação.
        //obs atencao!!! na hora de fazer o downcasting nem sempre dá certo! e o compilador nao sabe disso!! taí o papel do desenvolvedor.
        //entao o desenvolvedor nesse caso tem que testar se esse objeto acc3 realmente é do tipo BusinessAccount, e se ele for, ai sim eu faço a conversao dele ou seja faço o downcasting..
        //...pra testar isso, vou usar a palavrinha instanceOf.
        //obs a linha de baixo esta comentada, pq da erro na hora de compilar, pelas explicacoes acima citadas.
       // BusinessAccount acc5 = (BusinessAccount) acc3;

        //fica assim entao para o desenvolvedor testar se acc3 é uma instancia de BusinessAccount, usando a palavra instanceOf....
        //se o objeto que esta em acc3 for uma instancia de BusinessAccount, ai sim eu posso fazer o downcasting.
        if (acc3 instanceof BusinessAccount) {   //esse primeiro if vai falhar, uma vez que acc3 nao é instancia de BusinessAccount.
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan !!");
        }

        if (acc3 instanceof SavingsAccount){  //esse if esta correto, uma vez que acc3 é uma instancia de SavingsAccount.
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update !!");
        }
    }
}
