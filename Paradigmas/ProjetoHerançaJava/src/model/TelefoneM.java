package model;

public class TelefoneM { 
    private int ddd;     
    private int numero;  

    public TelefoneM() {
    }

    public TelefoneM(int ddd, int numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void imprimirTelefoneM()
    {
        System.out.println("...:: Telefone M ::...");
        System.out.println("DDD             :"+this.getDdd());
        System.out.println("Número          :"+this.getNumero());
        System.out.println();
    }
}