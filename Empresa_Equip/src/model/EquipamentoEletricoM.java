package model;

public class EquipamentoEletricoM extends EquipamentoM {
    private int alimentacao;
    private int corrente;
    private int potencia;
    private boolean fonteCA;
    private boolean fonteDC;

    public EquipamentoEletricoM(int codigo, String fabricante, String nome, FornecedorM fornecedorM, int alimentacao, int corrente, int potencia, boolean fonteCA, boolean fonteDC) {
        super(codigo, fabricante, nome, fornecedorM);
        this.alimentacao = alimentacao;
        this.corrente = corrente;
        this.potencia = potencia;
        this.fonteCA = fonteCA;
        this.fonteDC = fonteDC;
    }

    public int getAlimentacao() {
        return alimentacao;
    }
    public void setAlimentacao(int alimentacao) {
        this.alimentacao = alimentacao;
    }

    public int getCorrente() {
        return corrente;
    }
    public void setCorrente(int corrente) {
        this.corrente = corrente;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isFonteCA() {
        return fonteCA;
    }
    public void setFonteCA(boolean fonteCA) {
        this.fonteCA = fonteCA;
        if (fonteCA) {
            this.fonteDC = false;
        }
    }

    public boolean isFonteDC() {
        return fonteDC;
    }
    public void setFonteDC(boolean fonteDC) {
        this.fonteDC = fonteDC;
        if (fonteDC) {
            this.fonteCA = false;
        }
    }

    public int getPotenciaCalculada(EquipamentoEletricoM equipamento) {
        return equipamento.getAlimentacao() * equipamento.getCorrente();
    }

    public int getPotenciaCalculada() {
        return this.alimentacao * this.corrente;
    }
}