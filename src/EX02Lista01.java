import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EX02Lista01 {
    public static void main(String[] args) {


        ArrayList<Integer> vetorD = new ArrayList<>();
        StringBuilder mensagem = new StringBuilder("Elementos da lista:\n");

        for (int i = 0; i < 10; i++) {
            int nLista = Integer.parseInt(JOptionPane.showInputDialog("Digite os número para adicionar a lista: "));
            vetorD.add(nLista);
        }

        for (int i = vetorD.size() - 1; i >= 0; i--) {
            if (vetorD.get(i) <= 0) {
                vetorD.remove(i);
            }
        }

        System.out.print("Vetor D: ");
        for (int i = 0; i < vetorD.size(); i++) {
            System.out.print(vetorD.get(i));
            if (i < vetorD.size() - 1) {
                System.out.print(" ");
            }
        }
        for (int nLista : vetorD) {
            mensagem.append(nLista).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}
