package controll;

import model.TelefoneM;
import java.util.ArrayList;

public class TelefoneC {

    public ArrayList<TelefoneM> vetTelefones = new ArrayList<>();

    public void cadastrarTelefone(TelefoneM telefone) {
        vetTelefones.add(telefone);
    }

    public void buscarTelefone(int ddd, int numero) {
        for (TelefoneM tel : vetTelefones) {
            if (tel.getDdd() == ddd && tel.getNumero() == numero) {
                tel.imprimirTelefoneM();
                return;
            }
        }
        System.out.println("Telefone não encontrado.");
    }

    public void removerTelefone(int ddd, int numero) {
        for (int i = 0; i < vetTelefones.size(); i++) {
            TelefoneM tel = vetTelefones.get(i);
            if (tel.getDdd() == ddd && tel.getNumero() == numero) {
                vetTelefones.remove(i);
                System.out.println("Telefone removido com sucesso.");
                return;
            }
        }
        System.out.println("Telefone não encontrado.");       
    }

    public void listarTelefones() {
        for (TelefoneM tel : vetTelefones) {
            tel.imprimirTelefoneM();
        }
    }

}
