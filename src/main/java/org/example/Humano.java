package org.example;

public class Humano extends Personagem {
    public Humano(String nome) {
        super(nome, 90, 22, 15);
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = getForca() - inimigo.getDefesa();
        if (dano > 0) {
            inimigo.setVida(inimigo.getVida() - dano);
        }
        System.out.println(getNome() + " ataca com espada e causa " + dano + " de dano em " + inimigo.getNome() + "!");
    }
}