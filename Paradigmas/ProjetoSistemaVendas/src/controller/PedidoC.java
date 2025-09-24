package controller;

import model.PedidoM;
import java.util.ArrayList;

public class PedidoC 
{
    public ArrayList<PedidoM> vetPedidoM = new ArrayList<>();

    public void InserirPedido(PedidoM pedido) 
    {
        vetPedidoM.add(pedido);
    }

    public void BuscarNumero(int numero) 
    {
        for (PedidoM p : vetPedidoM) {
            if (p.getNumero() == numero) 
            {
                p.ImprimirPedido();
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }

    public void RemoverPedido(int numero) 
    {
        PedidoM encontrado = null;
        for (PedidoM p : vetPedidoM) 
        {
            if (p.getNumero() == numero) 
            {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) 
        {
            vetPedidoM.remove(encontrado);
            System.out.println("Pedido removido.");
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }

    public void ListarPedido() 
    {
        for (PedidoM p : vetPedidoM) 
        {
            p.ImprimirPedido();
            System.out.println("----------------------");
        }
    }
}
