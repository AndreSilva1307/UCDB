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

    public void InseriPedido(PedidoM pedidoM)
    {
        vetPedidoM.add(pedidoM);
        JOptionPane.showMessageDialog(null, "Pedido cadastrado com Sucesso!");
    }

    public void ListarPedido(){
        for (PedidoM dados:vetPedidoM)
        {
            dados.ImprimirPedido();
        }
    }

    public void BuscaPorNumero(int codigo)
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
}
