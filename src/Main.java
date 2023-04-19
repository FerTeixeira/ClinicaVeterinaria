import java.util.ArrayList;

public class Main {

    private ArrayList<Mamifero> mamiferos  = new ArrayList<Mamifero>();
    private ArrayList<Ave> aves = new ArrayList<Ave>();
    private ArrayList<Animal> animais ;
    public Main() {
        this.animais= new ArrayList<Animal>();
    }
    public void adicionarAnimais(Animal pet){
        this.animais.add(pet);
    }
    public void listarAnimais(){
        for(Animal pet:animais){
            System.out.println(pet.toString());
        }
        System.out.println("Total = " + this.animais.size() + " animais listados com sucesso!\n" );
    }
    public void excluirAnimal(Animal pet){
        if (this.animais.contains(pet)) {
            this.animais.remove(pet);
            System.out.println("Animal " + pet.toString() + " excluido com sucesso!\n");
        }else {
            System.out.println("Animal inexistente!\n");
        }

    }
    public void limparLista(){
        animais.clear();
        System.out.println("Animais excluidos com sucesso!");
    }
    public static void main(String[] args) {
        Main pet = new Main();

        Cachorro c1 = new Cachorro("Fernanda","Akira", "Cachorro", "Labrador", "Caramelo");
        Cavalo cv1 = new Cavalo("Nathan", "Pé de pano", "Cavalo", "Campeiro", "Preto");
        Papagaio p1 = new Papagaio("Flávia", "Catarina", "Ave", "Papagaio", "Verde");
        Calopsita cl1 = new Calopsita("Vitoria", "Gina","Ave", "Calopsita", "Branca");

        pet.adicionarAnimais(c1);
        pet.adicionarAnimais(cv1);
        pet.adicionarAnimais(p1);
        pet.adicionarAnimais(cl1);
        pet.listarAnimais();
        pet.excluirAnimal(c1);
        pet.limparLista();
        pet.listarAnimais();



    }
}