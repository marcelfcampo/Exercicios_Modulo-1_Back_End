

/*
Para que faça a classe cachorro, cavalo e preguiça; sejam classes filhas de Animal
precizamos utilizar a paravra extends, nossa herança.
Usando a palavra extends estamos dizendo preguiça está herdando, está se tornando uma
filha de animal.Uma subclasse, uma classe derivada de animal. Preguiça vai reaproveitar
aqueles atributos e métodos que a classe animal possui.
 */

public class Preguica extends Animal {

    //Agora basicamente iremos construir nossos construtores


    public Preguica() {
    }

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    /*
    Especificamente na classe Preguiça tem uma especificidade, ela não tem o método correr e
    ela tem o método "Deve subir em árvores". Espefificamente na classe prequiça teremos que
    mudar algo.
    */

    //Criar um método:
    public void subirEmArvores(){
        System.out.println("Preguiça subindo em árvore...");
    }


    //Copiar metodo  para Preguiçã,
    public void emitirSom () {
        System.out.println("zzzzzzzzz...");
    }

}

