package aula110926.primeirasjanelas;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class ExPaíses{
    public static void main(String[] args){

        JFrame janela = new JFrame("Crescimento Populacional");
        janela.setSize(400,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new FlowLayout());

        JLabel textoA = new JLabel("População do país A:");
        JTextField campoA = new JTextField(15);

        JLabel textoB = new JLabel("População do país B:");
        JTextField campoB = new JTextField(15);

        JButton botao = new JButton("Calcular");

        JLabel resultado = new JLabel("Digite as populações acima.");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                double paisA = Double.parseDouble(campoA.getText());
                double paisB = Double.parseDouble(campoB.getText());

                int anos = 0;

                while (paisA <= paisB) {
                    paisA = paisA * 1.03;
                    paisB= paisB * 1.02;
                    anos++;
                }

                resultado.setText("Tempo necessário:" + anos + "anos.");

            }
        });

        janela.add(textoA);
        janela.add(campoA);

        janela.add(textoB);
        janela.add(campoB);

        janela.add(botao);
        janela.add(resultado);

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    
    }
}