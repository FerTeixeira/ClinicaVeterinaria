public abstract class Ave extends Animal {
    protected String corPena;

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
    public String toString() {
        return "\n---- Ave -----" +
                "\ndono -> " + this.getDono() +
                "\nnome -> " + this.getNome() +
                "\nespecie -> " + this.getEspecie() +
                "\nraça -> " + this.getRaca() +
                "\ncor do pelo -> " + corPena;

    }
}