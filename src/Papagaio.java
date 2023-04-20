public class Papagaio extends Ave implements Pet {
    public Papagaio(String dono, String nome, String especie, String raca, String corPena) {
        super(dono, nome, especie, raca, corPena);
    }


    public void locomover() {
        System.out.println("Voando");

    }


    public void alimentar() {
        System.out.println("Comendo verdura.");

    }


    public void emitirSom() {
        System.out.println("Sou um papagaio que conta piadas");

    }


    public void cuidadosProprios() {
        System.out.println("Interagindo contando piada.");
    }

    @Override
    public String toString() {
        return "\n---- Papagaio -----" +
                "\ndono -> " + dono +
                "\nnome -> " + nome +
                "\nespecie -> " + especie +
                "\nraça -> " + raca +
                "\ncor das penas -> " + corPena;
    }
}
