import javax.swing.*;
import java.util.ArrayList;

public class EX04Lista01 {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> medias = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            nomes.add(nomeAluno);

            double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média final de " + nomeAluno + ": "));
            medias.add(media);
        }

        int indiceMaiorMedia = 0;
        double maiorMedia = medias.get(0);
        for (int i = 1; i < medias.size(); i++) {
            if (medias.get(i) > maiorMedia) {
                maiorMedia = medias.get(i); // Pega a posição da maior média dentro da lista
                indiceMaiorMedia = i; //Armazena a posição da maior média em uma variavel
            }
        }

        JOptionPane.showMessageDialog(null, "O aluno com a maior média é: " + nomes.get(indiceMaiorMedia));

        JOptionPane.showMessageDialog(null, "A seguir os alunos que precisam fazer exame final:");
        for (int i = 0; i < 7; i++) {
            double media = medias.get(i);
            if (media < 7) {
                double notaExame = 5 - (0.6 * media);
                System.out.println(nomes.get(i) + " precisa tirar " + notaExame + " no exame final.");
                JOptionPane.showMessageDialog(null, nomes.get(i) + " precisa tirar " + notaExame + " no exame final.");
            }
        }
    }
}
