package controll;

import model.EquipamentoEletricoM;
import java.util.ArrayList;

public class EquipamentoEletricoC {
    private ArrayList<EquipamentoEletricoM> equipamentosEletricos = new ArrayList<>();

    public void inserirEquipamentoEletrico(EquipamentoEletricoM equipamento) {
        equipamentosEletricos.add(equipamento);
    }

    public EquipamentoEletricoM buscarEquipamentoEletrico(int codigo) {
        for (EquipamentoEletricoM equipamento : equipamentosEletricos) {
            if (equipamento.getCodigo() == codigo) {
                return equipamento;
            }
        }
        return null;
    }

    public boolean removerEquipamentoEletrico(int codigo) {
        EquipamentoEletricoM equipamento = buscarEquipamentoEletrico(codigo);
        if (equipamento != null) {
            equipamentosEletricos.remove(equipamento);
            return true;
        }
        return false;
    }

    public void imprimirTodosEquipamentosEletricos() {
        for (EquipamentoEletricoM equipamento : equipamentosEletricos) {
            System.out.println("Código: " + equipamento.getCodigo() + ", Nome: " + equipamento.getNome() + ", Potência: " + equipamento.getPotencia() + "W");
        }
    }

    public int contarEquipamentosEletricos() {
        return equipamentosEletricos.size();
    }
}