package model;

public class EnderecoM {
    private String nomedaRua;
    private int numero;
    private String estado;
    private String municipio;
    private String cep;

    public EnderecoM(String nomedaRua, int numero, String estado, String municipio, String cep) {
        this.nomedaRua = nomedaRua;
        this.numero = numero;
        this.estado = estado;
        this.municipio = municipio;
        this.cep = cep;
    }

    public String getNomedaRua() {
        return nomedaRua;
    }

    public void setNomedaRua(String nomedaRua) {
        this.nomedaRua = nomedaRua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void ImprimirEnderecoM(){
        System.out.println("...:: ENDEREÇO M ::...");
        System.out.println("Nome da rua  :"+this.getNomedaRua());
        System.out.println("Número  :"+this.getNumero());
        System.out.println("Estado           :"+this.getEstado());
        System.out.println("Município   :"+this.getMunicipio());
        System.out.println("Cep   :"+this.getCep());
        System.out.println("...:: --------------- ::...");
    }
}
