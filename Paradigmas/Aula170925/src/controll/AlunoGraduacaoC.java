package controll;

import java.util.ArrayList;

import model.AlunoGraduacaoM;

public class AlunoGraduacaoC {
    public ArrayList<AlunoGraduacaoM> vetAlunoGraduacaoC;

    public AlunoGraduacaoC(){
        vetAlunoGraduacaoC = new ArrayList<AlunoGraduacaoM>();
    }

    public void InserirAlunoGraduacao(AlunoGraduacaoM alunoG){
        vetAlunoGraduacaoC.add(alunoG);
    }

    public void BuscaPorRaImprimi(int Ra){
        for (AlunoGraduacaoM alunoGM : vetAlunoGraduacaoC){
            if(alunoGM.getRa() == Ra){
                System.out.println("...::DADOS ALUNO GRADUACAO C::...");
                System.out.println("RA              : "+alunoGM.getRa());
                System.out.println("Nome: "+alunoGM.getNome_completo());
                System.out.println("Turno:"+alunoGM.getTurno());
                System.out.println("Nome Pai: "+alunoGM.getDadosPessoaisM().getNomedoPai());
                System.out.println("Nome da Rua: "+alunoGM.getEnderecoM().getNomedaRua());
                System.out.println("RA              : "+alunoGM.getRa());
            }
        }
    }
    public int BuscaPorRa(int ra){
        int posicao = -1;
        for (int i=0; i < vetAlunoGraduacaoC.size(); i++){
            if(vetAlunoGraduacaoC.get(i).getRa() == ra){
              posicao=i;
            }
        }
        return posicao;
    }
    public boolean RemoveCadastroPorRa(int ra){
        boolean remove = false;
        int posicao=this.BuscaPorRa(ra);
        if (posicao != -1){
            vetAlunoGraduacaoC.remove(posicao);
            remove = true;
        }
        return remove;
    }
}
