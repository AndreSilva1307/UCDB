package model;

public class TelefoneM {
    private String ddi;     
    private String ddd;     
    private String numero;  

    public TelefoneM() {
    }

    public TelefoneM(String ddi, String ddd, String numero) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void imprimirTelefone()
    {
        System.out.println("...:: Telefone M ::...");
        System.out.println("DDD             :"+this.getDdd());
        System.out.println("Número          :"+this.getNumero());
        System.out.println();
    }
}