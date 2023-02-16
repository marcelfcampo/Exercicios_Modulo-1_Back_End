/*
[M1S03] Ex 2 - Animal Emitir Som com Polimorfismo
Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e
invoque o método que emite o som de cada um de forma polimórfica, isto é, independente
do tipo de animal.

 */
public class Main {
    public static void main(String[] args) {

        Animal animal1 =new Animal("animal1",5);
        Cachorro cachorro1 = new Cachorro("Cachorro1",3);
        Cavalo cavalo1 = new Cavalo("Cavalo1",1);
        Preguica preguica1 = new Preguica ( "Preguiça1",9);

        System.out.println("O animal de nome " + animal1.getNome() +" de idade " +
                animal1.getIdade());
        animal1.emitirSom();
        animal1.correr();

        System.out.println("O Cachorro animal de nome " + cachorro1.getNome() +" de idade " +
                cachorro1.getIdade());
        cachorro1.emitirSom();
        cachorro1.correr();

        System.out.println("O Cavalo de nome " + cavalo1.getNome() +" de idade " +
                cavalo1.getIdade());
        cavalo1.emitirSom();
        cavalo1.correr();

        System.out.println("A preguiça de nome " + preguica1.getNome() +" de idade " +
                preguica1.getIdade());
        preguica1.emitirSom();
        preguica1.subirEmArvores();

    }
}


//Para identar : Code/Refomat Code (option+command+L)