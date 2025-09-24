package model;

public class ProdutoM 
{
    private String nome;
    private double preco;
    private int codigo;
    private int estoque;

    public ProdutoM(String nome, double preco, int codigo, int estoque) 
    {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.estoque = estoque;
    }

    public String getNome() 
    { 
        return nome; 
    }
    public double getPreco() 
    { 
        return preco; 
    }
    public int getCodigo() 
    { 
        return codigo; 
    }
    public int getEstoque() 
    { 
        return estoque; 
    }

    public void setNome(String nome) 
    { 
        this.nome = nome; 
    }
    public void setPreco(double preco) 
    { 
        this.preco = preco; 
    }
    public void setCodigo(int codigo) 
    { 
        this.codigo = codigo; 
    }
    public void setEstoque(int estoque) 
    { 
        this.estoque = estoque; 
    }

    public void ImprimirProduto() 
    {
        System.out.println("Código: " + codigo + " | Nome: " + nome + " | Preço: " + preco + " | Estoque: " + estoque);
    }
}
