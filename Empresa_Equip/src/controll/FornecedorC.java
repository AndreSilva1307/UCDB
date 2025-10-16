package controll;

import model.FornecedorM;
import java.util.ArrayList;

public class FornecedorC {
    private ArrayList<FornecedorM> fornecedores = new ArrayList<>();

    public void inserirFornecedor(FornecedorM fornecedor) {
        fornecedores.add(fornecedor);
    }

    public FornecedorM buscarFornecedor(String nome) {
        for (FornecedorM fornecedor : fornecedores) {
            if (fornecedor.getNome().equalsIgnoreCase(nome)) {
                return fornecedor;
            }
        }
        return null;
    }

    public boolean removerFornecedor(String nome) {
        FornecedorM fornecedor = buscarFornecedor(nome);
        if (fornecedor != null) {
            fornecedores.remove(fornecedor);
            return true;
        }
        return false;
    }

    public void imprimirTodosFornecedores() {
        for (FornecedorM fornecedor : fornecedores) {
            System.out.println("Nome: " + fornecedor.getNome() + ", Regional: " + fornecedor.getRegional());
        }
    }

    public int contarFornecedores() {
        return fornecedores.size();
    }
}