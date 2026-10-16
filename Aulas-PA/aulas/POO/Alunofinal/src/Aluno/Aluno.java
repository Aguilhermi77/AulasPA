package Aluno;

import javax.swing.*;

public class Aluno {
    // Atributos que armazenam os dados do aluno
    private int matricula;
    private String nome;
    private int idade;

    //Construtor que recebe os dados ao criar um aluno
    public Aluno(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    // Retorna o número da matrícula do aluno
    public int getmatricula() {
        return matricula;
    }

    // Define ou altera a matrícula do aluno
    public void setmatricula(int matricula) {
        this.matricula = matricula;
    }

    // Retorna o nome do aluno
    public String getnome() {
        return nome;
    }

    // Define ou altera o nome do aluno
    public void setnome(String nome) {
        this.nome = nome;
    }

    // Retorna a idade do aluno
    public int getidade() {
        return idade;
    }

    // Define ou altera a idade do aluno
    public void setidade(int idade) {
        this.idade = idade;
    }

    // Exibe os dados do aluno em uma janela
    public void exibirDados() {
        JOptionPane.showMessageDialog(
                null,
                "Sua matrícula é: " + matricula +
                        "\nSeu nome é: " + nome +
                        "\nSua idade é de: " + idade
        );
    }
}