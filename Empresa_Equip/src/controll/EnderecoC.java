package controll;

import model.EnderecoM;
import java.util.ArrayList;

public class EnderecoC {
    private ArrayList<EnderecoM> enderecos = new ArrayList<>();

    public void inserirEndereco(EnderecoM endereco) {
        enderecos.add(endereco);
    }

    public EnderecoM buscarEndereco(String cep) {
        for (EnderecoM endereco : enderecos) {
            if (endereco.getCep().equals(cep)) {
                return endereco;
            }
        }
        return null;
    }

    public boolean removerEndereco(String cep) {
        EnderecoM endereco = buscarEndereco(cep);
        if (endereco != null) {
            enderecos.remove(endereco);
            return true;
        }
        return false;
    }

    public void imprimirTodosEnderecos() {
        for (EnderecoM endereco : enderecos) {
            System.out.println("CEP: " + endereco.getCep() + ", Rua: " + endereco.getRua() + ", Estado: " + endereco.getEstado());
        }
    }

    public int contarEnderecos() {
        return enderecos.size();
    }
}