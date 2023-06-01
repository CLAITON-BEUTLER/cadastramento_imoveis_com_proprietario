import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Imovel {
    private String endereco;
    private String proprietario;

    public Imovel(String endereco, String proprietario) {
        this.endereco = endereco;
        this.proprietario = proprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getProprietario() {
        return proprietario;
    }
}

class SistemaCadastroImoveis {
    private List<Imovel> imoveis;
    private Scanner scanner;

    public SistemaCadastroImoveis() {
        imoveis = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void cadastrarImovel() {
        System.out.println("----- Cadastro de Imóvel -----");

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Proprietário: ");
        String proprietario = scanner.nextLine();

        Imovel novoImovel = new Imovel(endereco, proprietario);
        imoveis.add(novoImovel);

        System.out.println("Imóvel cadastrado com sucesso!");
    }

    public void listarImoveis() {
        System.out.println("----- Lista de Imóveis -----");

        for (Imovel imovel : imoveis) {
            System.out.println("Endereço: " + imovel.getEndereco());
            System.out.println("Proprietário: " + imovel.getProprietario());
            System.out.println("-----------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SistemaCadastroImoveis sistema = new SistemaCadastroImoveis();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("----- Sistema de Cadastramento de Imóveis -----");
            System.out.println("1. Cadastrar Imóvel");
            System.out.println("2. Listar Imóveis");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a leitura do número

            switch (opcao) {
                case 1:
                    sistema.cadastrarImovel();
                    break;
                case 2:
                    sistema.listarImoveis();
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }
}