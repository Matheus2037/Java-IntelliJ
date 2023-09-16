import javax.swing.*;
import java.util.Arrays;

public class desafioEstrutura {
    public static void main(String[] args) {
        double[] nInteiros = new double[7];
        int loop = 1;

        while(loop == 1){
            int escolha = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Inserir
                    2 - Pesquisar
                    3 - Excluir
                    4 - Imprimir
                    0 - Sair"""));

            switch (escolha) {
                case 1 -> {
                    int modoInserir = Integer.parseInt(JOptionPane.showInputDialog("1 - Ultimo lugar" +
                            "\n2 - Escolher posição"));
                    if (modoInserir == 1) {
                        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
                        for (int i = 0; i < nInteiros.length - 1; i++) {
                            nInteiros[i] = nInteiros[i + 1];
                        }
                        nInteiros[6] = n;
                    } else if (modoInserir == 2) {
                        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
                        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição: "));
                        nInteiros[posicao] = n;
                    }
                }
                case 2 -> {
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
                    for (int i = 0; i < nInteiros.length; i++) {
                        if (n == nInteiros[i]) {
                            JOptionPane.showMessageDialog(null, "O número " + n + " está na lista");
                            i = nInteiros.length;
                        } else {
                            JOptionPane.showMessageDialog(null, "O número " + n + " não está na lista");
                        }
                    }
                }
                case 3 -> {
                    int modoExcluir = Integer.parseInt(JOptionPane.showInputDialog("1 - Ultimo lugar" +
                            "\n2 - Escolher posição"));
                    if (modoExcluir == 1) {
                        nInteiros[6] = 0;
                        for (int i = nInteiros.length - 1; i > 0; i--) {
                            nInteiros[i] = nInteiros[i - 1];
                        }
                    } else if (modoExcluir == 2) {
                        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição: "));
                        nInteiros[posicao] = 0;
                    }
                }
                case 4 -> System.out.println(Arrays.toString(nInteiros));
                case 0 -> loop = 0;
            }
        }
        System.exit(0);
    }
}
