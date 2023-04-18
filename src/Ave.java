public abstract class Ave extends Animal {
    private String corPena;

    public Ave(String dono, String nome, String especie, String raca, String corPena) {
        super(dono, nome, especie, raca);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void cuidadosProprios() {

    }
}