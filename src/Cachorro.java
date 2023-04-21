public final class Cachorro extends Mamifero {


    public Cachorro(String dono, String nome, String especie, String raca, String corPelo) {
        super(dono, nome, especie, raca, corPelo);
    }


    @Override
    public void locomover() {

        System.out.println("Está correndo.");
    }

    @Override
    public void alimentar() {

        System.out.println("Come ração para cachorro.");
    }

    @Override
    public void emitirSom() {

        System.out.println("Está latindo.");
    }

    @Override
    public void cuidadosProprios() {

        System.out.println("Recebeu banho e tosa.");
    }


}
