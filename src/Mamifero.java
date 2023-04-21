public abstract class Mamifero extends Animal {

    protected String corPelo;

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
    public String toString() {
        return "\n---- Mamífero -----" +
                "\ndono -> " + this.getDono() +
                "\nnome -> " + this.getNome() +
                "\nespecie -> " + this.getEspecie() +
                "\nraça -> " + this.getRaca() +
                "\ncor do pelo -> " + corPelo;


    }
}