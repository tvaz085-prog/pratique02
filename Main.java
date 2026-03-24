import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        Usuario usuario = new Usuario("Thiago", "thiago@email.com", 30);

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE EVENTOS =====");
            System.out.println("1 - Cadastrar evento");
            System.out.println("2 - Listar eventos");
            System.out.println("3 - Participar de evento");
            System.out.println("4 - Ver participações");
            System.out.println("5 - Cancelar participação");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Nome:");
                    String nome = sc.nextLine();

                    System.out.println("Endereço:");
                    String endereco = sc.nextLine();

                    System.out.println("Categoria:");
                    String categoria = sc.nextLine();

                    System.out.println("Horário:");
                    String horario = sc.nextLine();

                    System.out.println("Descrição:");
                    String descricao = sc.nextLine();

                    Evento e = new Evento(nome, endereco, categoria, horario, descricao);
                    sistema.cadastrarEvento(e);
                    break;

                case 2:
                    sistema.listarEventos();
                    break;

                case 3:
                    System.out.println("Digite o número do evento:");
                    int i = sc.nextInt();
                    sistema.participarEvento(i);
                    break;

                case 4:
                    sistema.listarParticipacoes();
                    break;

                case 5:
                    System.out.println("Digite o número da participação:");
                    int j = sc.nextInt();
                    sistema.cancelarParticipacao(j);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
