import javax.swing.*;

public class QuartoTeste {
    public static void main(String[] args){

        String nr1 = JOptionPane.showInputDialog("Digite um número: ");
        int NRi1 = Integer.parseInt(nr1);
        String nr2 = JOptionPane.showInputDialog("Digite outro número: ");
        int NRi2 = Integer.parseInt(nr2);

        String mensagemFormat = "";

        String opcaoCalculo = JOptionPane.showInputDialog("Selecione uma opção de calculo: " +
                                                            "\n1 - Soma" +
                                                            "\n2 - Subtração" +
                                                            "\n3 - Multiplicação" +
                                                            "\n4 - Divisão");
        int option = Integer.parseInt(opcaoCalculo);

        if (option == 1){
            int calculo = NRi1 + NRi2;
            mensagemFormat = "O resultado da soma é de: "         +calculo;
        }
        else if (option == 2) {
            int calculo = NRi1 - NRi2;
            mensagemFormat = "O resultado da subtração é de: "    +calculo;
        }
        else if (option == 3) {
            int calculo = NRi1 * NRi2;
            mensagemFormat = "O resultado da multiplicação é de: "+calculo;
        }
        else if (option == 4) {
            int calculo = NRi1 / NRi2;
            mensagemFormat = "O resultado da divisão é de: "      +calculo;
        }
        else{
            mensagemFormat = "Você possivelmente digitou algum caracter inválido ";
        }

        JOptionPane.showMessageDialog(null, mensagemFormat);
    }
}
