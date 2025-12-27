package org.example;

public class Anao extends Personagem {
    public Anao(String nome) {
        super(nome, 100, 25, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = getForca() - inimigo.getDefesa();
        if (dano > 0) {
            inimigo.setVida(inimigo.getVida() - dano);
        }
        System.out.println(getNome() + " ataca com machado e causa " + dano + " de dano em " + inimigo.getNome() + "!");
    }
}