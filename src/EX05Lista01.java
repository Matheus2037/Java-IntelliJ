import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EX05Lista01 {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int nValor = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores: "));
            lista.add(nValor);
        }

        int maiorValor = lista.get(0);
        int menorValor = lista.get(0);
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 1; i < lista.size(); i++) {
            int valorAtual = lista.get(i);
            if (valorAtual > maiorValor) {
                maiorValor = valorAtual;
                posicaoMaior = i;
            }
            if (valorAtual < menorValor) {
                menorValor = valorAtual;
                posicaoMenor = i;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior valor é " + maiorValor + " e está na posição " + posicaoMaior);
        JOptionPane.showMessageDialog(null, "O menor valor é " + menorValor + " e está na posição " + posicaoMenor);
    }
}
