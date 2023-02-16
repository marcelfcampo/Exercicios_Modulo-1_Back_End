/*
Para que faça a classe cachorro, cavalo e preguiça; sejam classes filhas de Animal
precizamos utilizar a palavra extends, nossa herança.
Usando a palavra extends estamos dizendo preguiça está herdando, está se tornando uma
filha de animal.Uma subclasse, uma classe derivada de animal. Preguiça vai reaproveitar
aqueles atributos e métodos que a classe animal possui.
 */

public class Cavalo extends Animal {


    //Agora basicamente iremos construir nossos construtores
    public Cavalo() {
    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    //Copiar metodo  para cavalo,
            public void emitirSom () {
            System.out.println("Relixando...");

        }
 }