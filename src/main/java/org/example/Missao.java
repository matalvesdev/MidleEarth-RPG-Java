package org.example;

public class Missao {
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Missao(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
        System.out.println("Missão '" + titulo + "' concluída!");
    }

    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public boolean isConcluida() { return concluida; }
}