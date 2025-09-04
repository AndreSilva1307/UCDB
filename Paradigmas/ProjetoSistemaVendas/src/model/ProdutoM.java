package model;

public class ProdutoM 
{
    // Atributos
    private String nome;
    private double preco;
    private int codigo;
    private int estoque;

    // Construtor
    public ProdutoM() 
    {
    }

    public ProdutoM(String nome, double preco, int codigo, int estoque) 
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

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco) 
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
    
    public void ImprimirProduto()
    {
        System.out.println(" -- Produto -- ");
        System.out.println(" Nome:      "+this.getNome());
        System.out.println(" Preço:     "+this.getPreco());
        System.out.println(" Código:    "+this.getCodigo());
        System.out.println(" Estoque:   "+this.getEstoque());
    }
}