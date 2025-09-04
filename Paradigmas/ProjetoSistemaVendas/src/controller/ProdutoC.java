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

    // Buscar
    public void BuscarProduto(int codigo)
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

    // Inserção
    public void InserirProduto(ProdutoM produtoM)
    {
        vetProdutoM.add(produtoM);
        System.out.println("Produto cadastrado com Sucesso!");
    }

    //Listar
    public void ListarProdutos()
    {
        for (ProdutoM dados:vetProdutoM)
        {
            dados.ImprimirProduto();
        }
    }

    // Remover
    public boolean RemoverProduto(int codigo)
    {
        if (codigo >= 0 && codigo < vetProdutoM.size())
        {
            vetProdutoM.remove(codigo);
            System.out.println("Produto Removido com Sucesso!");

           
            return true;
        }
        else
        {
            System.out.println("Erro: Produto não existe ou não encontrado!");
            return false;
        }
    }
}
