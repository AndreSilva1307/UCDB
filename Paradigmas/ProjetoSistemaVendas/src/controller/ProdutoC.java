package controller;

import model.ProdutoM;
import java.util.ArrayList;

public class ProdutoC 
{
    public ArrayList<ProdutoM> vetProdutoM = new ArrayList<>();

    public void InserirProduto(ProdutoM produto) 
    {
        vetProdutoM.add(produto);
    }

    public void BuscarProduto(int codigo) 
    {
        for (ProdutoM p : vetProdutoM) 
        {
            if (p.getCodigo() == codigo) 
            {
                p.ImprimirProduto();
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void RemoverProduto(int codigo) 
    {
        ProdutoM encontrado = null;
        for (ProdutoM p : vetProdutoM) 
        {
            if (p.getCodigo() == codigo) 
            {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) 
        {
            vetProdutoM.remove(encontrado);
            System.out.println("Produto removido.");
        } else 
        {
            System.out.println("Produto não encontrado.");
        }
    }

    public void ListarProdutos() 
    {
        for (ProdutoM p : vetProdutoM) 
        {
            p.ImprimirProduto();
        }
    }
}
