public abstract class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String dono, String nome, String especie, String raca, String corPelo) {
        super(dono, nome, especie, raca);
        this.corPelo = corPelo;
    }


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
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