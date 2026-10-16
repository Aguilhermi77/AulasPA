package Aluno;

import javax.swing.*;

public class Curso {
    // Atributos que armazenam os dados do curso
    private int codigo;
    private String Nome;
    private int duracao;

    // Construtor que recebe os dados ao criar um curso
    public Curso(int codigo, String Nome, int duracao) {
        this.codigo = codigo;
        this.Nome = Nome;
        this.duracao = duracao;
    }

    // Retorna o código do curso
    public int getcodigo() {
        return codigo;
    }

    // Altera o código do curso
    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    // Retorna o nome do curso
    public String getNome() {
        return Nome;
    }

    // Altera o nome do curso
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    // Retorna a duração do curso
    public int getDuracao() {
        return duracao;
    }

    // Altera a duração do curso
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // Exibe os dados do curso em uma janela
    public void ExibirDados() {
        JOptionPane.showMessageDialog(
                null,
                "O nome do curso é: " + Nome +
                        "\nO código é: " + codigo +
                        "\nA duração é de: " + duracao + " anos"
        );
    }
}