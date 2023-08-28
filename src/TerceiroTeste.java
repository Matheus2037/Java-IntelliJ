import javax.swing.*;

public class TerceiroTeste {
    public static void main(String[] args){

        String nr1 = JOptionPane.showInputDialog("Digite um número: ");
        int NRi1 = Integer.parseInt(nr1);
        String nr2 = JOptionPane.showInputDialog("Digite outro número: ");
        int NRi2 = Integer.parseInt(nr2);

        int soma = NRi1 + NRi2;
        if(soma > 10){
            String mensagemFormat1 = "O resultado foi maior que 10: "+soma;
            JOptionPane.showMessageDialog(null, mensagemFormat1);
        }
        else {
            String mensagemFormat2 = "O resultado foi menor que 10: "+soma;
            JOptionPane.showMessageDialog(null, mensagemFormat2);
        }
    }
}
