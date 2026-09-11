package aula110926.primeirasjanelas;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class ExemploInterativo {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo de Clique");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new FlowLayout());

        JTextField campoTexto = new JTextField(15);
        JButton botao = new JButton("Enviar");
        JLabel mensagem = new JLabel("Digite algo acima.");

        botao.addActionListener(new ActionListener() {
        @Override
    public void actionPerformed(ActionEvent e) {
        String nome = campoTexto.getText();
        mensagem.setText("Bem-vindo, " + nome + "!");
            }
        });
  
        janela.add(campoTexto);
        janela.add(botao);
        janela.add(mensagem);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}