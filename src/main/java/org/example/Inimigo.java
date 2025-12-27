package org.example;

public abstract class Inimigo extends Personagem {
    private int nivel;
    private int experiencia;

    public Inimigo(String nome, int vida, int forca, int defesa, int nivel, int experiencia) {
        super(nome, vida, forca, defesa);
        this.nivel = nivel;
        this.experiencia = experiencia;
    }

    public int getNivel() { return nivel; }
    public int getExperiencia() { return experiencia; }

    @Override
    public abstract void atacar(Personagem personagem);
}