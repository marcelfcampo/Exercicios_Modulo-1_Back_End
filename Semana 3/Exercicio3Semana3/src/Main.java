/*
[M1S03] Ex 3 - Veterinário Examinar
Implemente uma classe Veterinario que contenha um método examinar() cujo parâmetro
de entrada é um Animal, quando o animal for examinado ele deve emitir um som, em sua
classe de teste faça com que o veterinário examine os 3 animais.
 */

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("animal1", 5);
        Cachorro cachorro1 = new Cachorro("Cachorro1", 3);
        Cavalo cavalo1 = new Cavalo("Cavalo1", 1);
        Preguica preguica1 = new Preguica("Preguiça1", 9);

        System.out.println("O animal de nome " + animal1.getNome() + " de idade " +
                animal1.getIdade());
        animal1.emitirSom();
        animal1.correr();

        System.out.println("O Cachorro animal de nome " + cachorro1.getNome() + " de idade " +
                cachorro1.getIdade());
        cachorro1.emitirSom();
        cachorro1.correr();

        System.out.println("O Cavalo de nome " + cavalo1.getNome() + " de idade " +
                cavalo1.getIdade());
        cavalo1.emitirSom();
        cavalo1.correr();

        System.out.println("A preguiça de nome " + preguica1.getNome() + " de idade " +
                preguica1.getIdade());
        preguica1.emitirSom();
        preguica1.subirEmArvores();

        //Estanciar um objeto Veterinário
        Veterinario veterinario1 = new Veterinario();

        //Examinar os nossos 4 objetos: Animal1; Cachorro1; Cavalo1 e Preguiça1
        veterinario1.examinar(animal1);
        veterinario1.examinar(cachorro1);
        veterinario1.examinar(cavalo1);
        veterinario1.examinar(preguica1);


    }
}


//Para identar : Code/Refomat Code (option+command+L)