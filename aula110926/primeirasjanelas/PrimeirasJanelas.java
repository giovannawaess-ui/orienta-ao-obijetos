package aula110926.primeirasjanelas;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrimeirasJanelas{
    public static void main (String[] args){
        //1. Cria a janela com o título especificado
        JFrame janela = new JFrame ("Minha Primeira Tela Java");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel texto = new JLabel("Óla, Mundo Swing!", JLabel.CENTER);
        janela.add(texto);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}