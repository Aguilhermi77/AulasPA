package Aluno;

import javax.swing.*;

public class Curso {
    private int codigo;
    private String Nome;
    private int duracao;

    public Curso(int codigo, String Nome,int duracao){
        this.codigo=codigo;
        this.Nome=Nome;
        this.duracao=duracao;
    }
    public int getcodigo() {
        return codigo;
    }

    public void setcodigo( int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao( int duracao) {
        this.duracao = duracao;
    }
    public void ExibirDados(){
        JOptionPane.showMessageDialog(null, "Seu nome é: "+Nome+
        "\n o código é "+codigo+

        "\n a duração é de "+duracao+" anos");
    }
}
