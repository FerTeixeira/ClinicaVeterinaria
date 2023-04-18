public class Papagaio extends Ave {
    public Papagaio(String dono, String nome, String especie, String raca, String corPena) {
        super(dono, nome, especie, raca, corPena);
    }

    @Override
    public void locomover() {
        System.out.println("Voando");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo verdura.");

    }

    @Override
    public void emitirSom() {
        System.out.println("Sou um papagaio que conta piadas");

    }
    @Override
    public void cuidadosProprios() {
        super.cuidadosProprios();
        System.out.println("Interagindo contando piada.");
    }

    @Override
    public String toString() {
        return "Papagaio{" +
                "dono='" + dono + '\'' +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
