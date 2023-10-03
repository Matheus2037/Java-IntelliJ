import javax.swing.*;
import java.util.ArrayList;

public class EX03Lista01 {
    public static void main(String[] args) {
        int tamanho = 5;

        ArrayList<Integer> vetorA = new ArrayList<>();
        ArrayList<Integer> vetorB = new ArrayList<>();

        StringBuilder mensagem = new StringBuilder("Elementos do Vetor A:\n");
        StringBuilder mensagem2 = new StringBuilder("Elementos do Vetor B:\n");

        for (int i = 0; i < tamanho; i++) {
            int nVetorA = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores da Lista A"));
            vetorA.add(nVetorA);
        }

        for (int i = tamanho - 1; i >= 0; i--) {
            vetorB.add(vetorA.get(i));
        }

        for (int numero : vetorA) {
            mensagem.append(numero).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());

        for (int numero : vetorB) {
            mensagem2.append(numero).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem2.toString());
    }
}