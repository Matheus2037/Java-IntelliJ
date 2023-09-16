import javax.swing.*;
import java.util.Arrays;

public class desafioEstrutura {
    public static void main(String[] args){

        double[] nInteiros = new double[7];
        int loop = 1;

        while(loop == 1){
            int escolha = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Inserir
                    2 - Pesquisar
                    3 - Excluir
                    4 - Imprimir
                    0 - Sair"""));

            switch (escolha){

                case 1:
                    int modoInserir = Integer.parseInt(JOptionPane.showInputDialog("1 - Ultimo lugar"+
                            "\n2 - Escolher posição"));
                    if(modoInserir == 1){
                        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
                        for (int i = nInteiros.length - 1; i > 0; i--) {
                            nInteiros[i] = nInteiros[i - 1];
                        }
                        nInteiros[0] = n;
                    }else if(modoInserir == 2) {
                        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
                        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição: "));
                        nInteiros[posicao] = n;
                    }
                    break;
                case 2:
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
                    for (int i=0; i<nInteiros.length; i++){
                        if (n == nInteiros[i]){
                            JOptionPane.showMessageDialog(null,"O número "+n+" está na lista");
                            i = nInteiros.length;
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"O número "+n+" não está na lista");
                        }
                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println(Arrays.toString(nInteiros));
                    break;
                case 0:
                    loop = 0;
                    break;
            }
        }
    }
}
