package Aluno;
import javax.swing.JOptionPane;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int codigoCurso =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do curso"
                + "\n DESENVOLVIMENTO DE SISTEMAS - 1"
                + "\n RECURSOS HUMANOS - 2"
                + "\n ADMINISTRAÇÃO - 3"
                + "\n CONTABILIDADE - 4"));
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome");
        int idade = Integer.parseInt( JOptionPane.showInputDialog(null,"Digite sua idade"));
        int matricula = Integer.parseInt( JOptionPane.showInputDialog(null,"Digite seu código de matrícula"));
        String curso = JOptionPane.showInputDialog(null,"Digite seu curso");
        int duracao = Integer.parseInt( JOptionPane.showInputDialog(null,"Digite a duração em anos"));
    }
}