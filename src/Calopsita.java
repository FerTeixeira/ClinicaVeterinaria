public final class Calopsita extends Ave {

    private static final long serialVersionUID = 1L;

    public Calopsita(String dono, String nome, String especie, String raca, String corPena) {
        super(dono, nome, especie, raca, corPena);
    }

    @Override
    public void locomover() {
        System.out.println("Voando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo alpiste.");

    }

    @Override
    public void emitirSom() {
        System.out.println("Piando");

    }

    @Override
    public void cuidadosProprios() {

        System.out.println("Esta na gaiola cantando");
    }


}

