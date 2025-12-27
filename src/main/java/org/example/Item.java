package org.example;

public class Item {
    private String nome;
    private int bonusAtaque;
    private int bonusDefesa;

    public Item(String nome, int atk, int def) {
        this.nome = nome;
        this.bonusAtaque = atk;
        this.bonusDefesa = def;
    }

    public String getNome() { return nome; }
    public int getBonusAtaque() { return bonusAtaque; }
    public int getBonusDefesa() { return bonusDefesa; }
}