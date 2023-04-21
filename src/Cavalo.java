public final class Cavalo extends Mamifero {
    public Cavalo(String dono, String nome, String especie, String raca, String corPelo) {
        super(dono, nome, especie, raca, corPelo);

    }

    @Override
    public void locomover() {

        System.out.println("Está trotando.");
    }

    @Override
    public void alimentar() {

        System.out.println("Come alfafa.");
    }

    @Override
    public void emitirSom() {

        System.out.println("Está relinchando.");
    }

    @Override
    public void cuidadosProprios() {

        System.out.println("Cuidando dos cascos do cavalo.");
    }

}
