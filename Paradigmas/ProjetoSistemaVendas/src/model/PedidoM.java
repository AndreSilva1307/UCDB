package model;

import java.util.Date;

public class PedidoM 
{
    // Atributos
    private int numero;
    private Date data;
    private boolean status;
    private float valorTotal;
    
    
    // Construtor
    public PedidoM() 
    {
    }

    public PedidoM(int numero, Date data, boolean status, float valorTotal) 
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

    public float getValorTotal() 
    {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) 
    {
        this.valorTotal = valorTotal;
    } 
}