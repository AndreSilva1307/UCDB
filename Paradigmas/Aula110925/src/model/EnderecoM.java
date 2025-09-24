package model;

public class EnderecoM {
    private String nomeDaRua;
    private int numero;
    private String estado;
    private String municipio;
    private String cep;

    public EnderecoM(String nomeDaRua, int numero, String estado, String municipio, String cep) {
        this.nomeDaRua = nomeDaRua;
        this.numero = numero;
        this.estado = estado;
        this.municipio = municipio;
        this.cep = cep;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
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

    public void imprimirEnderecoM() {
        System.out.println("");
        System.out.println("...::   ENDEREÇO    ::...");
        System.out.println("Nome da rua : " + getNomeDaRua());
        System.out.println("Número      : " + getNumero());
        System.out.println("Estado      : " + getEstado());
        System.out.println("Município   : " + getMunicipio());
        System.out.println("Cep         : " + getCep());
        System.out.println("");
    }
}