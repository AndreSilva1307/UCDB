import model.DadosFinanceirosM;
import model.EnderecoM;
import model.EquipamentoEletricoM;
import model.EquipamentoMecanicoM;
import model.FornecedorM;

public class Main {
    public static void main(String[] args) throws Exception {
        EnderecoM enderecoM = new EnderecoM("Rua 1", "B1", "SP", "11.111-111");
        DadosFinanceirosM dadosFinanceirosM = new DadosFinanceirosM("123456789", "2023-10-27", 10, 50.0f);
        FornecedorM fornecedorM = new FornecedorM("Fornecedor 1", "Regional 1", enderecoM, dadosFinanceirosM);
        EquipamentoEletricoM equipamentoEletricoM = new EquipamentoEletricoM(1, "Fabricante 1", "Equipamento Eletrico 1", fornecedorM, 220, 10, 2000, true, false);
        EquipamentoMecanicoM equipamentoMecanicoM = new EquipamentoMecanicoM(2, "Fabricante 2", "Equipamento Mecanico 1", fornecedorM, true, "Óleo", 1500, 0.5f, 0.05f, 0.85f);

        System.out.println("CALCULOS DA VAZÃO");
        float VT = equipamentoMecanicoM.getVazaoTeorica();
        float qt = equipamentoMecanicoM.getVazaoReal();
        System.out.println("VT: "+VT);
        System.out.println("Qt: "+qt);

        System.out.println("\nCALCULOS DA POTENCIA");
        int pc = equipamentoEletricoM.getPotenciaCalculada();
        System.out.println("Potência Calculada: " + pc);
    }
}

