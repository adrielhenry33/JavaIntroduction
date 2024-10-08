package Curso.jv.javacore.Heranca.Dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco static de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de pessoa 2");
    }

    public Pessoa (String nome){
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;

    }
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("Nome :" + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + endereco.getRua() );
        System.out.println("CEP: " + endereco.getCep());
        System.out.println("-----------");
    }
}
