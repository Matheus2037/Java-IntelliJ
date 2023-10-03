import javax.swing.*;
import java.util.ArrayList;

public class EX01Lista01 {
    public static void main(String[] args) {
        ArrayList<Integer> ListaGab = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int nGab = Integer.parseInt(JOptionPane.showInputDialog("Digite o gabarito das respostas"));
            ListaGab.add(nGab);
        }

        ArrayList<Integer> ListaAposta = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int nAposta = Integer.parseInt(JOptionPane.showInputDialog("Digite sua aposta"));
            ListaAposta.add(nAposta);
        }

        int pontos = validacao(ListaGab, ListaAposta);

        System.out.println("Pontuação do apostador: " + pontos);
        JOptionPane.showMessageDialog(null, "Pontuação do apostador: " + pontos);

    }

    public static int validacao(ArrayList<Integer> ListaGab, ArrayList<Integer> ListaAposta) {
        int pontos = 0;
        for (Integer numeroAposta : ListaAposta) {
            if (ListaGab.contains(numeroAposta)) {
                pontos++;
            }
        }
        return pontos;
    }
}
