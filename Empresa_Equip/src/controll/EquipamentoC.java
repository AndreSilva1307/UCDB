package controll;

import model.EquipamentoM;
import java.util.ArrayList;

public class EquipamentoC {
    private ArrayList<EquipamentoM> equipamentos = new ArrayList<>();

    public void inserirEquipamento(EquipamentoM equipamento) {
        equipamentos.add(equipamento);
    }

    public EquipamentoM buscarEquipamento(int codigo) {
        for (EquipamentoM equipamento : equipamentos) {
            if (equipamento.getCodigo() == codigo) {
                return equipamento;
            }
        }
        return null;
    }

    public boolean removerEquipamento(int codigo) {
        EquipamentoM equipamento = buscarEquipamento(codigo);
        if (equipamento != null) {
            equipamentos.remove(equipamento);
            return true;
        }
        return false;
    }

    public void imprimirTodosEquipamentos() {
        for (EquipamentoM equipamento : equipamentos) {
            System.out.println("Código: " + equipamento.getCodigo() + ", Fabricante: " + equipamento.getFabricante() + ", Nome: " + equipamento.getNome());
        }
    }

    public int contarEquipamentos() {
        return equipamentos.size();
    }
}