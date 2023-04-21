import javax.swing.*;
import java.util.ArrayList;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ClinicaVeterinaria {

    private ArrayList<Animal> animais;
    public static void teste(){
        Calopsita c1 = new Calopsita("Fer", "Gina", "Ave", "Calopsita", "Branca");
        String msg = c1.toString();
        System.out.println(c1);
        c1.locomover();
        c1.alimentar();
        c1.emitirSom();
        c1.cuidadosProprios();

    }



    public ClinicaVeterinaria() {
        this.animais = new ArrayList<Animal>();
    }

    /**
     * Adiciona um animal na lista
     *
     * @param pet Animal a ser adicionado.
     */
    public void adicionarAnimais(Animal pet) {
        this.animais.add(pet);
    }

    /**
     * Pega todos os animais cadastrados e retorna em String.
     *
     * @return String contendo a lista de animais cadastrados.
     */
    public StringBuilder listarAnimais() {
        StringBuilder dados = new StringBuilder(); // variavel para armazenar os animais cadastrados

        // faz um loop nos animais e adiciona na variavel de exibição
        for (Animal animal : animais) {
            dados.append(animal.toString());
        }

        return dados;
    }

    /**
     * Exclui um animal específico da lista
     *
     * @param pet Animal a ser excluído
     */
    public void excluirAnimal(Animal pet) {
        this.animais.remove(pet);
    }

    /**
     * Exclui todos os animais cadastrados
     */
    public void limparLista() {
        animais.clear();
    }

    public void gravarAnimal() {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream (new FileOutputStream(".\\animais.dat"));
            for(Animal pet:animais) {
                outputStream.writeObject(pet);
            }
        } catch (FileNotFoundException ex) { // arquivo não encontrado
            ex.printStackTrace(); //escreve o erro no console
        } catch (IOException ex) { // busca falhas nas operações de I/O
            ex.printStackTrace(); //escreve o erro no console
        } finally {
            try {
                if (outputStream != null) { // verifica se existem dados para gravar
                    outputStream.flush(); /* libera o fluxo de saída e força byte de saíde armazenado em buffer a ser gravado */
                    outputStream.close(); /* fecha o fluxo de saída e libera os recursos associados ao fluxo */
                }
            } catch (IOException ex ) { // busca falhas nas operações de I/O
                ex.printStackTrace(); //escreve o erro no console
            }
        }
    }

    public void recuperarAnimal() {
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream (new FileInputStream (".\\animais.dat"));
            Object obj = null;
            while((obj = inputStream.readObject ()) != null) { // lê do stream para o objeto
                if (obj instanceof Cachorro) // verifica se o objeto pertence a classe
                    this.animais.add((Cachorro)obj);
                else if (obj instanceof Calopsita) // verifica se o objeto pertence a classe
                    this.animais.add((Calopsita)obj);
                else if (obj instanceof Cavalo) // verifica se o objeto pertence a classe
                    this.animais.add((Cavalo)obj);
                else if (obj instanceof Papagaio) // verifica se o objeto pertence a classe
                    this.animais.add((Papagaio)obj);
            }
        } catch (EOFException ex) { // quando o final do arquivo é encontrado
			System.out.println ("Fim do arquivo encontrado."); //escreve o erro no console
		} catch (ClassNotFoundException ex) { // classe não encontrada
			ex.printStackTrace(); //escreve o erro no console
		} catch (FileNotFoundException ex) { // arquivo não encontrado
			ex.printStackTrace(); //escreve o erro no console
		} catch (IOException ex) { // busca falhas nas operações de I/O
			ex.printStackTrace(); //escreve o erro no console
		} finally {
			try {
				if (inputStream != null ) { // o objeto está apontando para algum stream
					inputStream.close(); // fecha o stream
					System.out.println("Animais recuperados com sucesso!\n");
				}
			} catch (IOException ex) { // busca falhas nas operações de I/O novamente
				ex.printStackTrace(); //escreve o erro no console
			}
		}
	}

    /**
     * Pega todos os animais cadastrados
     *
     * @return ArrayList de Animal
     */
    public ArrayList<Animal> pegarTodosAnimais() {
        return new ArrayList<>(animais);
    }

    /**
     * Faz a verificação se o valor recebido é um inteiro válido
     *
     * @param valor Valor informado pelo usuário
     */
    public boolean isValidInt(String valor) {
        try {
            Integer.parseInt(valor); // se conseguir converter para Inteiro então é válido
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /**
     * Loop até o usuário informar um inteiro válido
     *
     * @param valor Valor informado pelo usuário
     */
    public int retornaInteiro(String valor) {

        while (!isValidInt(valor)) {
            valor = JOptionPane.showInputDialog("Valor informado inválido!" +
                    "\nInsira uma opção:");
        }

        return Integer.parseInt(valor);
    }

    /**
     * Exibição do menu e entrada de dados do usuário
     */
    public void listarMenu() {

        String dono;
        String nome;
        String especie;
        String raca;
        String corAnimal;

        String menu; // Menu que será exibido na interface
        String entrada; // Variavel que armazenará o valor informado pelo usuário
        int opc1, opc2, opc3; // opc1 = Primeira decisão | opc2 = Decisão secundária (tipo do animal) | opc3 = Nome do animal

        do {
            menu = """
                            CLINICA VETERINÁRIA     
                                        
                    Selecione uma opção:
                                        
                    1 - Adicionar um animal
                    2 - Listar Animais
                    3 - excluir Animal
                    4 - Limpar lista
                    9 - Finalizar

                    
                    """;

            entrada = JOptionPane.showInputDialog(menu + "\n");
            opc1 = this.retornaInteiro(entrada);

            switch (opc1) {

                // adicionar
                case 1:
                    menu = """
                            Qual espécie deseja adicionar:
                                                        
                            1. Mamífero
                            2. Ave
                                                                                    
                            
                            """;

                    entrada = JOptionPane.showInputDialog(menu);
                    opc2 = retornaInteiro(entrada);

                    // Decisão da espécie
                    switch (opc2) {

                        // Mamífero
                        case 1:
                            menu = """
                                    Qual mamífero deseja adicionar?
                                                                        
                                    1. Cachorro
                                    2. Cavalo
                                                                        
                                    
                                    """;
                            entrada = JOptionPane.showInputDialog(menu + "\n");
                            opc3 = retornaInteiro(entrada);

                            // Decisão do mamífero
                            switch (opc3) {

                                // cachorro
                                case 1:
                                    dono = JOptionPane.showInputDialog("Insira o nome do dono do cachorro:\n");
                                    nome = JOptionPane.showInputDialog("Insira um nome para do cachorro:\n");
                                    especie = "mamífero";
                                    raca = JOptionPane.showInputDialog("Insira a raça do " + nome + ":\n");
                                    corAnimal = JOptionPane.showInputDialog("Informe a cor do pelo do " + nome + ":\n");

                                    Cachorro cachorro = new Cachorro(dono, nome, especie, raca, corAnimal); // instância o objeto Cachorro

                                    adicionarAnimais(cachorro); // adiciona

                                    JOptionPane.showMessageDialog(null, "Cachorro inserido com sucesso!");
                                    break;
                                // cavalo
                                case 2:
                                    dono = JOptionPane.showInputDialog("Insira o nome do dono do cavalo:\n");
                                    nome = JOptionPane.showInputDialog("Insira um nome para o cavalo:\n");
                                    especie = "mamífero";
                                    raca = JOptionPane.showInputDialog("Insira a raça do " + nome + ":\n");
                                    corAnimal = JOptionPane.showInputDialog("Informe a cor do pelo do " + nome + ":\n");

                                    Cavalo cavalo = new Cavalo(dono, nome, especie, raca, corAnimal); // instância o objeto Cachorro

                                    adicionarAnimais(cavalo); // adiciona

                                    JOptionPane.showMessageDialog(null, "Cavalo inserido com sucesso!");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                            }
                            break;

                        // Ave
                        case 2:
                            menu = """
                                    Qual ave deseja adicionar?
                                                                        
                                    1. Calopsita
                                    2. Papagaio
                                                                        
                                    
                                    """;
                            entrada = JOptionPane.showInputDialog(menu + "\n");
                            opc3 = retornaInteiro(entrada);

                            // Decisão da ave
                            switch (opc3) {

                                // calopsita
                                case 1:
                                    dono = JOptionPane.showInputDialog("Insira o nome do dono da Calopsita:\n");
                                    nome = JOptionPane.showInputDialog("Insira um nome para a Calopsita:\n");
                                    especie = "ave";
                                    raca = JOptionPane.showInputDialog("Insira a raça da " + nome + ":\n");
                                    corAnimal = JOptionPane.showInputDialog("Informe a cor das penas da " + nome + ":\n");

                                    Calopsita calopsita = new Calopsita(dono, nome, especie, raca, corAnimal); // instância o objeto Cachorro

                                    adicionarAnimais(calopsita); // adiciona

                                    JOptionPane.showMessageDialog(null, "Calopsita inserida com sucesso!");
                                    break;

                                // papagaio
                                case 2:
                                    dono = JOptionPane.showInputDialog("Insira o nome do dono do Papagaio:\n");
                                    nome = JOptionPane.showInputDialog("Insira um nome para o Papagaio:\n");
                                    especie = "ave";
                                    raca = JOptionPane.showInputDialog("Insira a raça do " + nome + ":\n");
                                    corAnimal = JOptionPane.showInputDialog("Informe a cor das penas do " + nome + ":\n");

                                    Papagaio papagaio = new Papagaio(dono, nome, especie, raca, corAnimal); // instância o objeto Cachorro

                                    adicionarAnimais(papagaio); // adiciona

                                    JOptionPane.showMessageDialog(null, "Papagaio inserido com sucesso!");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                    }
                    break;
                // listar
                case 2:
                    // se não tiver animais cadastrados
                    if (animais.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum animal a ser listado!");
                        break;
                    }

                    JOptionPane.showMessageDialog(null, "---- Animais cadastrados ----\n" +
                            listarAnimais());

                    break;
                // excluir
                case 3:
                    if (animais.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum animal cadastrado!");
                        break;
                    }

                    String listaAnimais = "";
                    ArrayList<Animal> todos = pegarTodosAnimais();

                    menu = """
                            Selecione o animal que será excluido:
                                                        
                            """;

                    for (int i = 0; i < todos.size(); i++) {
                        listaAnimais += (i + 1) + " - " + animais.get(i).getRaca() + " | " + animais.get(i).getNome() + "\n";
                    }

                    entrada = JOptionPane.showInputDialog(menu + listaAnimais + "\n");

                    opc2 = retornaInteiro(entrada);

                    if (animais.indexOf(opc2 - 1) == -1) {
                        JOptionPane.showMessageDialog(null, "O número informado é inválido!\nRefaça o processo!");
                        break;
                    }

                    excluirAnimal(animais.get(opc2 - 1));

                    JOptionPane.showMessageDialog(null, "Animal excluído com sucesso!");
                    break;

                // limpar
                case 4:
                    if (animais.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Nenhum animal cadastrado!");
                        break;
                    }

                    limparLista();
                    JOptionPane.showMessageDialog(null, "Lista limpa com sucesso!");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM DO APP");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opc1 != 9);

    }

    public static void main(String[] args) {
        ClinicaVeterinaria pet = new ClinicaVeterinaria();

        teste();


        pet.listarMenu();


    }

}