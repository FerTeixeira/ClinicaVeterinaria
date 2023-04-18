public abstract class Mamifero extends Animal {
    private String CorPelo;

    public Mamifero(String dono, String nome, String especie, String raca, String corPelo) {
        super(dono, nome, especie, raca);
        CorPelo = corPelo;
    }

    public String getCorPelo() {
        return CorPelo;
    }

    public void setCorPelo(String corPelo) {
        CorPelo = corPelo;
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