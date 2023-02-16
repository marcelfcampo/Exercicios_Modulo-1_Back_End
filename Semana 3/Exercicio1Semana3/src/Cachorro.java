/*
Para que faça a classe cachorro, cavalo e preguiça; sejam classes filhas de Animal
precizamos utilizar a paravra extends, nossa herança.
Usando a palavra extends estamos dizendo preguiça está herdando, está se tornando uma
filha de animal.Uma subclasse, uma classe derivada de animal. Preguiça vai reaproveitar
aqueles atributos e métodos que a classe animal possui.
 */

public class Cachorro extends Animal {

    //Agora basicamente iremos construir nossos construtores


    public Cachorro() {
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
}
