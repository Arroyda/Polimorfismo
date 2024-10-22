// Classe Aluno
class Aluno extends Pessoa {
    public Aluno(String nome) {
        super("Aluno " + nome); // Adiciona "Aluno" ao nome
    }

    @Override
    protected String criarCorpoEmail(String mensagem) {
        return "Olá " + nome + "!\n\n" + mensagem;
    }
}