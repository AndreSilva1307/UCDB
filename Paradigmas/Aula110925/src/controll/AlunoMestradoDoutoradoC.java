package controll;

import model.AlunoMestradoDoutoradoM;
import java.util.ArrayList;

public class AlunoMestradoDoutoradoC {
    public ArrayList<AlunoMestradoDoutoradoM> vetAlunoMestradoDoutorado;

    public AlunoMestradoDoutoradoC() {
        this.vetAlunoMestradoDoutorado = new ArrayList<AlunoMestradoDoutoradoM>();
    }

    public void inserirAlunoMestradoDoutorado(AlunoMestradoDoutoradoM alunoMD) {
        this.vetAlunoMestradoDoutorado.add(alunoMD);
    }

    public void imprimirTodos() {
        for (AlunoMestradoDoutoradoM alunoMD : vetAlunoMestradoDoutorado) {
            alunoMD.imprimirCompleto();
        }
    }

    public void buscaPorRaImprimi(int ra) {
        for (AlunoMestradoDoutoradoM alunoMD : vetAlunoMestradoDoutorado) {
            if (alunoMD.getRa() == ra) {
                alunoMD.imprimirCompleto();
                return;
            }
        }
        System.out.println("\nAluno de Mestrado/Doutorado com RA " + ra + " não encontrado.");
    }

    public int buscaPorRa(int ra) {
        for (int i = 0; i < vetAlunoMestradoDoutorado.size(); i++) {
            if (vetAlunoMestradoDoutorado.get(i).getRa() == ra) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeCadastroPorRa(int ra) {
        int posicao = this.buscaPorRa(ra);
        if (posicao != -1) {
            vetAlunoMestradoDoutorado.remove(posicao);
            return true;
        }
        return false;
    }
}