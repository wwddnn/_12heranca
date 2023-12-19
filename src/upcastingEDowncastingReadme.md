/*
Upcasting:
é um casting da sublasse para a superclasse. converte da sublasse para a superclasse.
ex: é como se eu tivesse um objeto do tipo BusinessAccount e quisesse atribuir esse objeto a uma variavel do tipo Account. isso é o upcasting.
uso comum: polimorfismo (é muito comum de usar, e muito poderoso tambem na programacao orientada a objetos).


Downcasting:
é o casting contrário. é da superclasse para a subclasse.
ex: é como se eu tivesse um objeto do tipo Account e quisesse atribuir esse objeto para uma variavel do tipo BusinessAccount.
*palavra: instanceOf.
*uso comum em métodos que recebem parametros genericos (Equals).
obs esse metodo Equals serve pra comparar um objeto com o outro.


obs para demonstrar o upcasting e downcasting, ele cria mais uma subclasse chamada SavingsAccount. 
E mantém a superclasse Account, e a outra sublasse BusinessAccount.
*/