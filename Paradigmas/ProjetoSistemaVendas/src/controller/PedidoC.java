package controller;

import model.PedidoM;

import javax.swing.*;
import java.util.ArrayList;

public class PedidoC 
{
    public ArrayList<PedidoM> vetPedidoM;

    public PedidoC()
    {
        vetPedidoM = new ArrayList<PedidoM>();
    }

    // Buscar
    public void BuscarNumero(int codigo)
    {
        for (int i=0;i<vetPedidoM.size();i++)
        {
            if (vetPedidoM.get(i).getNumero() == codigo)
            {
                System.out.println("Produto encontrado!");
                System.out.println("Número :      "+this.vetPedidoM.get(i).getNumero());
                System.out.println(" Data:     "+this.vetPedidoM.get(i).getData());
                System.out.println(" Status:    "+this.vetPedidoM.get(i).isStatus());
                System.out.println(" Valor total:   "+this.vetPedidoM.get(i).getValorTotal());
            }
        }
    }

    // Inserção
    public void InserirPedido(PedidoM pedidoM)
    {
        vetPedidoM.add(pedidoM);
        System.out.println("Pedido cadastrado com Sucesso!");
    }

    // Listar
    public void ListarPedido(){
        for (PedidoM dados:vetPedidoM)
        {
            dados.ImprimirPedido();
        }
    }

    // Remover
    public boolean RemoverPedido(int numero)
    {
        if (numero >= 0 && numero < vetPedidoM.size())
        {
            vetPedidoM.remove(numero);
            System.out.println("Pedido Removido com Sucesso!");

           
            return true;
        }
        else
        {
            System.out.println("Erro: Pedido não existe ou não encontrado!");
            return false;
        }
    }
}
