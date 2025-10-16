package controll;

import model.EquipamentoMecanicoM;
import java.util.ArrayList;

public class EquipamentoMecanicoC {
    private ArrayList<EquipamentoMecanicoM> equipamentosMecanicos = new ArrayList<>();

    public void inserirEquipamentoMecanico(EquipamentoMecanicoM equipamento) {
        equipamentosMecanicos.add(equipamento);
    }

    public EquipamentoMecanicoM buscarEquipamentoMecanico(int codigo) {
        for (EquipamentoMecanicoM equipamento : equipamentosMecanicos) {
            if (equipamento.getCodigo() == codigo) {
                return equipamento;
            }
        }
        return null;
    }

    public boolean removerEquipamentoMecanico(int codigo) {
        EquipamentoMecanicoM equipamento = buscarEquipamentoMecanico(codigo);
        if (equipamento != null) {
            equipamentosMecanicos.remove(equipamento);
            return true;
        }
        return false;
    }

    public void imprimirTodosEquipamentosMecanicos() {
        for (EquipamentoMecanicoM equipamento : equipamentosMecanicos) {
            System.out.println("Código: " + equipamento.getCodigo() + ", Nome: " + equipamento.getNome() + ", RPM: " + equipamento.getRpm());
        }
    }

    public int contarEquipamentosMecanicos() {
        return equipamentosMecanicos.size();
    }
}