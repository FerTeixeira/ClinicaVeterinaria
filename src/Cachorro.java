public class Cachorro extends Mamifero implements Pet{


    public Cachorro(String dono, String nome, String especie, String raca, String corPelo) {
        super(dono, nome, especie, raca, corPelo);
    }



    public void locomover() {

        System.out.println("Está correndo.");
    }


    public void alimentar() {

        System.out.println("Come ração para cachorro.");
    }


    public void emitirSom() {

        System.out.println("Está latindo.");
    }


    public void cuidadosProprios() {

        System.out.println("Recebeu banho e tosa.");
    }

    @Override
    public String toString() {
        return "\n---- Cachorro -----" +
                "\ndono -> " + dono +
                "\nnome -> " + nome +
                "\nespecie -> " + especie +
                "\nraça -> " + raca +
                "\ncor do pelo -> " + corPelo;
    }
}
