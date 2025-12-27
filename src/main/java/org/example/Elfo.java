package org.example;

public class Elfo extends Personagem {
    public Elfo(String nome) {
        super(nome, 80, 20, 10);
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = getForca() - inimigo.getDefesa();
        if (dano > 0) {
            inimigo.setVida(inimigo.getVida() - dano);
        }
        System.out.println(getNome() + " ataca com arco e causa " + dano + " de dano em " + inimigo.getNome() + "!");
    }
}