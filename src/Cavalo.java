public class Cavalo extends Mamifero implements Pet {
    public Cavalo(String dono, String nome, String especie, String raca, String corPelo) {
        super(dono, nome, especie, raca, corPelo);

    }


    public void locomover() {

        System.out.println("Está trotando.");
    }


    public void alimentar() {

        System.out.println("Come alfafa.");
    }


    public void emitirSom() {

        System.out.println("Está relinchando.");
    }


    public void cuidadosProprios() {

        System.out.println("Cuidando dos cascos do cavalo.");
    }

    @Override
    public String toString() {
        return "\n---- Cavalo -----" +
                "\ndono -> " + dono +
                "\nnome -> " + nome +
                "\nespecie -> " + especie +
                "\nraça -> " + raca +
                "\ncor do pelo -> " + corPelo;
    }
}
