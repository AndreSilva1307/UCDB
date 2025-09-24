package model;

import java.util.ArrayList;
import java.util.Date;

public class PedidoM 
{
    private int numero;
    private Date data;
    private boolean status;
    private double valorTotal;
    private ArrayList<ProdutoM> produtos;

    public PedidoM(int numero, Date data, boolean status) 
    {
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.produtos = new ArrayList<>();
        this.valorTotal = 0;
    }

    public int getNumero() 
    { 
        return numero; 
    }
    public Date getData() 
    { 
        return data; 
    }
    public boolean isStatus() 
    { 
        return status; 
    }
    public double getValorTotal() 
    { 
        return valorTotal; 
    }

    public void setValorTotal(double valorTotal) 
    {
        this.valorTotal = valorTotal;
    }

    public ArrayList<ProdutoM> getProdutos() 
    {
        return produtos;
    }

    public void adicionarProduto(ProdutoM produto) 
    {
        produtos.add(produto);
        produto.setEstoque(produto.getEstoque() - 1);
    }

    public void ImprimirPedido() 
    {
        System.out.println("==== PEDIDO ====");
        System.out.println("Número: " + numero);
        System.out.println("Data: " + data);
        System.out.println("Status: " + (status ? "Ativo" : "Inativo"));
        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println("Produtos:");

        ArrayList<Integer> codigosUsados = new ArrayList<>();

        for (ProdutoM p : produtos) 
        {
            if (!codigosUsados.contains(p.getCodigo())) 
            {
                int count = 0;
                for (ProdutoM prod : produtos) 
                {
                    if (prod.getCodigo() == p.getCodigo()) 
                    {
                        count++;
                    }
                }
                System.out.println("- " + p.getNome() + " | Preço: R$" + p.getPreco() + " | Quantidade: " + count);
                codigosUsados.add(p.getCodigo());
            }
        }
    }
}
