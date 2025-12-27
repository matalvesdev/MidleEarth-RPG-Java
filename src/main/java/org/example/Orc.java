package org.example;

public class Orc extends Personagem {
    public Orc(String nome) {
        super(nome, 100, 15, 5);
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = getForca() - inimigo.getDefesa();
        if (dano > 0) {
            inimigo.setVida(inimigo.getVida() - dano);
        }
        System.out.println(getNome() + " ataca ferozmente e causa " + dano + " de dano em " + inimigo.getNome() + "!");
    }
}