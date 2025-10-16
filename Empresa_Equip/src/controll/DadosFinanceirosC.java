package controll;

import model.DadosFinanceirosM;
import java.util.ArrayList;

public class DadosFinanceirosC {
    private ArrayList<DadosFinanceirosM> dadosFinanceiros = new ArrayList<>();

    public void inserirDadosFinanceiros(DadosFinanceirosM dados) {
        dadosFinanceiros.add(dados);
    }

    public DadosFinanceirosM buscarDadosFinanceiros(String centroCusto) {
        for (DadosFinanceirosM dados : dadosFinanceiros) {
            if (dados.getCentroCusto().equals(centroCusto)) {
                return dados;
            }
        }
        return null;
    }

    public boolean removerDadosFinanceiros(String centroCusto) {
        DadosFinanceirosM dados = buscarDadosFinanceiros(centroCusto);
        if (dados != null) {
            dadosFinanceiros.remove(dados);
            return true;
        }
        return false;
    }

    public void imprimirTodosDadosFinanceiros() {
        for (DadosFinanceirosM dados : dadosFinanceiros) {
            System.out.println("Centro de Custo: " + dados.getCentroCusto() + ", Data da Compra: " + dados.getDataCompra());
        }
    }

    public int contarDadosFinanceiros() {
        return dadosFinanceiros.size();
    }
}