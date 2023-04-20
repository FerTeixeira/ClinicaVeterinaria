public abstract class Animal {
    protected String dono;
    protected String nome;
    protected String especie;
    protected String raca;

    public Animal(String dono, String nome, String especie, String raca) {
        this.dono = dono;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}