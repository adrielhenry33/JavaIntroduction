package Curso.jv.javacore.Gassociacao.Dominio;

public class Jogador {
    private String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime (){
        System.out.println(this.nome);
    }
}
