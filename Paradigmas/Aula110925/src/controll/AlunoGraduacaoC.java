package controll;

import model.AlunoGraduacaoM;
import java.util.ArrayList;

public class AlunoGraduacaoC {
    public ArrayList<AlunoGraduacaoM> vetAlunoGraduacao;

    public AlunoGraduacaoC() {
        vetAlunoGraduacao = new ArrayList<AlunoGraduacaoM>();
    }

    public void inserirAlunoGraduacao(AlunoGraduacaoM alunoG) {
        vetAlunoGraduacao.add(alunoG);
    }

    public void imprimirTodos() {
        for (AlunoGraduacaoM alunoGM : vetAlunoGraduacao) {
            alunoGM.imprimirCompleto();
        }
    }

    public void buscaPorRaImprimi(int ra) {
        for (AlunoGraduacaoM alunoGM : vetAlunoGraduacao) {
            if (alunoGM.getRa() == ra) {
                alunoGM.imprimirCompleto();
                return;
            }
        }
        System.out.println("\nAluno de Graduação com RA " + ra + " não encontrado.");
    }

    public int buscaPorRa(int ra) {
        for (int i = 0; i < vetAlunoGraduacao.size(); i++) {
            if (vetAlunoGraduacao.get(i).getRa() == ra) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeCadastroPorRa(int ra) {
        int posicao = this.buscaPorRa(ra);
        if (posicao != -1) {
            vetAlunoGraduacao.remove(posicao);
            return true;
        }
        return false;
    }
}