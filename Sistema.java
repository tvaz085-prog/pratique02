import java.util.ArrayList;

public class Sistema {
    ArrayList<Evento> eventos = new ArrayList<>();
    ArrayList<Evento> participando = new ArrayList<>();

    public void cadastrarEvento(Evento e) {
        eventos.add(e);
        System.out.println("Evento cadastrado com sucesso!");
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
            return;
        }

        for (int i = 0; i < eventos.size(); i++) {
            System.out.println("Evento [" + i + "]");
            eventos.get(i).exibir();
        }
    }

    public void participarEvento(int indice) {
        if (indice >= 0 && indice < eventos.size()) {
            participando.add(eventos.get(indice));
            System.out.println("Participação confirmada!");
        } else {
            System.out.println("Evento inválido.");
        }
    }

    public void cancelarParticipacao(int indice) {
        if (indice >= 0 && indice < participando.size()) {
            participando.remove(indice);
            System.out.println("Participação cancelada!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarParticipacoes() {
        if (participando.isEmpty()) {
            System.out.println("Você não está participando de nenhum evento.");
            return;
        }

        for (int i = 0; i < participando.size(); i++) {
            System.out.println("Participação [" + i + "]");
            participando.get(i).exibir();
        }
    }
}
