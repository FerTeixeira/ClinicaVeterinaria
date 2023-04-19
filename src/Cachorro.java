public class Cachorro extends Mamifero {


    public Cachorro(String dono, String nome, String especie, String raca, String corPelo) {
        super(dono, nome, especie, raca, corPelo);
    }


    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Está correndo.");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Come ração para cachorro.");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Está latindo.");
    }

    @Override
    public void cuidadosProprios() {
        super.cuidadosProprios();
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
