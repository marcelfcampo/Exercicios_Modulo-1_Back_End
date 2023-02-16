/*
[M1S03] Ex 2 continuação do EX 1 - Classe Animal com Herança
Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
as características de forma que tudo o que for comum a todos os animais fique
na classe Animal:

 */

public class Cachorro extends Animal {

    //Agora basicamente iremos construir nossos construtores


    public Cachorro() {
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    //Copiar metodo  para cachorro,
    public void emitirSom(){
        System.out.println("Latindo...");
    }


}
