package controle;

import modelo.DadosPessoaisM;
import modelo.EnderecoM;

import javax.swing.*;
import java.util.ArrayList;

public class DadosPessoaisC {

    public ArrayList<DadosPessoaisM> vetDadosPessoais;

    public DadosPessoaisC(){
        vetDadosPessoais = new ArrayList<DadosPessoaisM>();
    }

    public void InseriDadosPesssoais(DadosPessoaisM dadosPessoaisM){
        vetDadosPessoais.add(dadosPessoaisM);
        JOptionPane.showMessageDialog(null, "Cadastro feito com Sucesso!");
    }
    public void ListaGeralDadosPessoais(){
        for (DadosPessoaisM dados:vetDadosPessoais){
            dados.ImprimeDP();
        }
    }
    public void BuscaPorCPF(String cpf){
        for (int i=0;i<vetDadosPessoais.size();i++){
            if (vetDadosPessoais.get(i).getCpf().equals(cpf)){
                System.out.println("ENCONTREI !");
                System.out.println("CPF  : "+this.vetDadosPessoais.get(i).getCpf());
                System.out.println("Nome : "+this.vetDadosPessoais.get(i).getPrimeoronome());
            }
        }
    }

    public int BuscaPosicaoPorRA(int idade){
        int resultado=-1;
        for (int posicao=0;posicao<vetDadosPessoais.size();posicao++){
            if(vetDadosPessoais.get(posicao).getIdade()==idade){
                resultado=posicao;
            }
        }
        return resultado;
    }
    public void RemoveDadosPessoaisPOsPosicao(int idade){
        int i=this.BuscaPosicaoPorRA(idade);
        if(i==-1)
            System.out.println("Dado não encontrado");
    }
}
