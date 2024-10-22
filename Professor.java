// Classe Professor
class Professor extends Pessoa {
    public Professor(String nome) {
        super("Prof. " + nome); // Adiciona "Prof." ao nome
    }

    @Override
    protected String criarCorpoEmail(String mensagem) {
        return "Olá " + nome + "!\n\n" + mensagem;
    }
}