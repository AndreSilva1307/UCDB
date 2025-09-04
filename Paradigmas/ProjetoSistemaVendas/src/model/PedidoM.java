package model;

import java.util.Date;

public class PedidoM 
{
    // Atributos
    private int numero;
    private Date data;
    private boolean status;
    private double valorTotal;
    
    
    // Construtor
    public PedidoM() 
    {
    }

    public PedidoM(int numero, Date data, boolean status, double valorTotal) 
    {
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters
    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public Date getData() 
    {
        return data;
    }

    public void setData(Date data) 
    {
        this.data = data;
    }

    public boolean isStatus() 
    {
        return status;
    }

    public void setStatus(boolean status) 
    {
        this.status = status;
    }

    public double getValorTotal() 
    {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) 
    {
        this.valorTotal = valorTotal;
    } 

    public void ImprimirPedido()
    {
        System.out.println(" -- Produto -- ");
        System.out.println(" Número:       "+this.getNumero());
        System.out.println(" Data:         "+this.getData());
        System.out.println(" Status:       "+this.isStatus());
        System.out.println(" Valor total:  "+this.getValorTotal());
    }
}