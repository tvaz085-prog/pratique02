public class Usuario {
    String nome;
    String email;
    int idade;

    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public void exibir() {
        System.out.println("Usuário: " + nome + " | Email: " + email + " | Idade: " + idade);
    }
}
