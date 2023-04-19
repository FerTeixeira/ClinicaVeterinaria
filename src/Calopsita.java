public class Calopsita extends Ave {
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
        super.cuidadosProprios();
        System.out.println("Esta na gaiola cantando");
    }

    @Override
    public String toString() {
        return "\n---- Calopsita -----" +
                "\ndono -> " + dono +
                "\nnome -> " + nome +
                "\nespecie -> " + especie +
                "\nraça -> " + raca +
                "\ncor das penas -> " + corPena;
    }
}
