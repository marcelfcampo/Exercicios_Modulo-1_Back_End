/*
[M1S03] Ex 1 - Classe Animal com Herança
Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
as características de forma que tudo o que for comum a todos os animais fique
na classe Animal:

 */
public class Animal {

    // Criar dois atributos nome e idade:
    private String nome;
    private int idade;

    //Gerar o  encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    //Copia e cola o construtor 1 localizado abaixo e apague os parâmetros (construtor vazio):
    public Animal() {

    }


    //Gerar nosso construtor 1:
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //1. Criar 2 métodos emitir som e correr
    //2. public é o modoficador de acesso do nosso método;
    //3. void para informar que esse método é vazio, ou seja não irá retornar nada para nós;
    //4. Colocar o nome do nosso método: emitir som;
    public void emitirSom() {
        System.out.println("Animal emitindo som...");
    }

    public void correr() {
        System.out.println("Animal correndo...");

    }

}

//Para identar : Code/Refomat Code (option+command+L)