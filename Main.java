// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Pessoa professor = new Professor("Alan Turing");
        Pessoa aluno = new Aluno("Joseph");

        String mensagem = "Espero que você esteja bem!";

        professor.enviarEmail(mensagem);
        aluno.enviarEmail(mensagem);
    }
}