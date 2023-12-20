/*
classes e metodo final:
*usar a palavra final, evita com que a classe seja herdada. 
exemplo: public final class SavingsAccount {
*e usar essa palavra final no metodo, evita que ele seja sobreposto.

obs por questoes de seguranca e de regras de negocio, pode ser interessante ter a palavra final na classe ou entao no metodo. 
obs geralmente convem colocar o final em metodos sobrepostos, pois sobreposicoes multiplas tendem a ser uma ...
... porta de entrada para inconsistencias. 

obs por questao de performance, uma classe final, tem seus atributos de tipo analisados de forma mais rapida em tempo de execucao. 
exemplo: String. ( o String é uma classe final. pesquisar no google por string javadoc. )

*/