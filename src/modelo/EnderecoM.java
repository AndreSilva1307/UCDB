package modelo;

public class EnderecoM {
    private String rua;
    private int numero;
    private String bairro;
    private String municipio;
    private String estado;
    private String cep;
    private String complemento;

    public EnderecoM(String rua, int numero, String bairro, String municipio, String estado, String cep, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.municipio = municipio;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void ImprimeEndereco(){
        System.out.println(" ** ENDEREÇO **");
        System.out.println(" Rua      : "+this.getRua());
        System.out.println(" Numero   : "+this.getNumero());
        System.out.println(" CEP      : "+this.getCep());
    }
}
