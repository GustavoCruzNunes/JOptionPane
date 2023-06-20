package exemplo3_JOptionPane;

import javax.swing.JOptionPane;

public class Principal_3_JOtionPane {

    public static void main(String[] args) throws NumberFormatException {

        float nota1, nota2, nota3, CalculoMedia;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª nota: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª nota: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 3ª nota: "));

        CalculoMedia = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, String.format("Média Final: %.2f",
                CalculoMedia), "Resultado", JOptionPane.WARNING_MESSAGE);

    }
}

