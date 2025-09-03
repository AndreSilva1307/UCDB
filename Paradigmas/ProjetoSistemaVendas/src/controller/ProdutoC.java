package controller;

import model.ProdutoM;

import javax.swing.*;
import java.util.ArrayList;

public class ProdutoC 
{
    public ArrayList<ProdutoM> vetProdutoM;

    public ProdutoC()
    {
        vetProdutoM = new ArrayList<ProdutoM>();
    }

    public void InseriProduto(ProdutoM produtoM)
    {
        vetProdutoM.add(produtoM);
        JOptionPane.showMessageDialog(null, "Produto cadastrado com Sucesso!");
    }

    public void ListarProdutos(){
        for (ProdutoM dados:vetProdutoM)
        {
            dados.ImprimirProduto();
        }
    }

    public void BuscaPorNome(String nome)
    {
        for (int i=0;i<vetProdutoM.size();i++)
        {
            if (vetProdutoM.get(i).getNome().equals(nome))
            {
                System.out.println("Produto encontrado!");
                System.out.println("Nome :      "+this.vetProdutoM.get(i).getNome());
                System.out.println(" Preço:     "+this.vetProdutoM.get(i).getPreco());
                System.out.println(" Código:    "+this.vetProdutoM.get(i).getCodigo());
                System.out.println(" Estoque:   "+this.vetProdutoM.get(i).getEstoque());
            }
        }
    }

    public void BuscaPorCodigo(int codigo)
    {
        for (int i=0;i<vetProdutoM.size();i++)
        {
            if (vetProdutoM.get(i).getCodigo() == codigo)
            {
                System.out.println("Produto encontrado!");
                System.out.println("Nome :      "+this.vetProdutoM.get(i).getNome());
                System.out.println(" Preço:     "+this.vetProdutoM.get(i).getPreco());
                System.out.println(" Código:    "+this.vetProdutoM.get(i).getCodigo());
                System.out.println(" Estoque:   "+this.vetProdutoM.get(i).getEstoque());
            }
        }
    }
}
