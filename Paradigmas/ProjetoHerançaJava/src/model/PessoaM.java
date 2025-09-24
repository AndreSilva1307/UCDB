package model;

public class PessoaM{
    private String nome;
    private EnderecoM endereco;
    private TelefoneM telefone;

    public PessoaM() {
    }
    
    public PessoaM(String nome) {
        this.nome = nome;
    }
    
    public PessoaM(String nome, EnderecoM endereco, TelefoneM telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public EnderecoM getEndereco() {
        return endereco;
    }
    public void setEndereco(EnderecoM endereco) {
        this.endereco = endereco;
    }
    public TelefoneM getTelefone() {
        return telefone;
    }
    public void setTelefone(TelefoneM telefone) {
        this.telefone = telefone;
    }

    public void imprimirPessoaM()
    {
        System.out.println("...:: Pessoa M ::...");
        System.out.println("Nome            :"+this.getNome());
        System.out.println("Endereço:"+this.getEndereco());
        System.out.println("Telefone:"+this.getTelefone());
        System.out.println();
    }
}