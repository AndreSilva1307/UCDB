package model;

public class ProdutoM 
{
    // Atributos
    private String nome;
    private float preco;
    private int codigo;
    private int estoque;

    // Construtor
    public ProdutoM() 
    {
    }

    public ProdutoM(String nome, float preco, int codigo, int estoque) 
    {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.estoque = estoque;
    }

    // Getters e Setters
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public float getPreco() 
    {
        return preco;
    }

    public void setPreco(float preco) 
    {
        this.preco = preco;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public int getEstoque() 
    {
        return estoque;
    }

    public void setEstoque(int estoque) 
    {
        this.estoque = estoque;
    } 
}