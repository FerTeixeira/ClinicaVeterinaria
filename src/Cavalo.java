public class Cavalo extends Mamifero{
    public Cavalo(String dono, String nome, String especie, String raca, String corPelo) {
        super(dono, nome, especie, raca, corPelo);

    }

    @Override
    public void locomover() {
        super.locomover();
        System.out.println("Está trotando.");
    }

    @Override
    public void alimentar() {
        super.alimentar();
        System.out.println("Come alfafa.");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Está relinchando.");
    }

    @Override
    public void cuidadosProprios() {
        super.cuidadosProprios();
        System.out.println("Cuidando dos cascos do cavalo.");
    }

    @Override
    public String toString() {
        return "Cavalo{" +
                "dono='" + dono + '\'' +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}
