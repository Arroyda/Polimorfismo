// Classe base Pessoa
class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void enviarEmail(String mensagem) {
        String corpoEmail = criarCorpoEmail(mensagem);
        System.out.println(corpoEmail);
    }

    // Método que deve ser implementado nas subclasses para personalizar a saudação
    protected String criarCorpoEmail(String mensagem) {
        return "Olá " + nome + "!\n\n" + mensagem;
    }
}