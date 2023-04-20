public class Calopsita extends Ave implements Pet {
    public Calopsita(String dono, String nome, String especie, String raca, String corPena) {
        super(dono, nome, especie, raca, corPena);
    }


    public void locomover() {
        System.out.println("Voando");

    }


    public void alimentar() {
        System.out.println("Comendo alpiste.");

    }


    public void emitirSom() {
        System.out.println("Piando");

    }


    public void cuidadosProprios() {

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
