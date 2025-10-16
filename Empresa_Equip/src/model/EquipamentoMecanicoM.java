package model;

public class EquipamentoMecanicoM extends EquipamentoM {
    private boolean fluido;
    private String tipoFluido;
    private int rpm;
    private float vazao;
    private float deslocamentoVolumetrico;
    private float eficienciaVolumetrica;

    public EquipamentoMecanicoM(int codigo, String fabricante, String nome, FornecedorM fornecedorM, boolean fluido, String tipoFluido, int rpm, float vazao, float deslocamentoVolumetrico, float eficienciaVolumetrica) {
        super(codigo, fabricante, nome, fornecedorM);
        this.fluido = fluido;
        this.tipoFluido = tipoFluido;
        this.rpm = rpm;
        this.vazao = vazao;
        this.deslocamentoVolumetrico = deslocamentoVolumetrico;
        this.eficienciaVolumetrica = eficienciaVolumetrica;
    }

    public boolean isFluido() {
        return fluido;
    }
    public void setFluido(boolean fluido) {
        this.fluido = fluido;
    }

    public String getTipoFluido() {
        return tipoFluido;
    }
    public void setTipoFluido(String tipoFluido) {
        this.tipoFluido = tipoFluido;
    }

    public int getRpm() {
        return rpm;
    }
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public float getVazao() {
        return vazao;
    }
    public void setVazao(float vazao) {
        this.vazao = vazao;
    }

    public float getDeslocamentoVolumetrico() {
        return deslocamentoVolumetrico;
    }

    public void setDeslocamentoVolumetrico(float deslocamentoVolumetrico) {
        this.deslocamentoVolumetrico = deslocamentoVolumetrico;
    }
    
    public float getEficienciaVolumetrica() {
        return eficienciaVolumetrica;
    }

    public void setEficienciaVolumetrica(float eficienciaVolumetrica) {
        this.eficienciaVolumetrica = eficienciaVolumetrica;
    }

    public float getVazaoTeorica(EquipamentoMecanicoM equipamento) {
        return equipamento.getDeslocamentoVolumetrico() * equipamento.getRpm();
    }

    public float getVazaoTeorica() {
        return this.deslocamentoVolumetrico * this.rpm;
    }

    public float getVazaoReal(EquipamentoMecanicoM equipamento) {
        return getVazaoTeorica(equipamento) * equipamento.getEficienciaVolumetrica();
    }

    public float getVazaoReal() {
        return getVazaoTeorica() * this.eficienciaVolumetrica;
    }
}