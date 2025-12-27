package org.example;

public class Sauron extends Inimigo {
    private boolean anelDoPoderEquipado;

    public Sauron() {
        super("Sauron", 100, 25, 15, 50, 500);
        this.anelDoPoderEquipado = true;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = getForca() * (anelDoPoderEquipado ? 2 : 1) - inimigo.getDefesa();
        if (dano > 0) {
            inimigo.setVida(inimigo.getVida() - dano);
        }
        System.out.println(getNome() + " ataca com poder das trevas e causa " + dano + " de dano em " + inimigo.getNome() + "!");
    }

    public void perderAnelDoPoder() {
        anelDoPoderEquipado = false;
        System.out.println("Sauron perdeu o Anel do Poder! Seu poder foi reduzido!");
    }

    public boolean temAnelDoPoder() {
        return anelDoPoderEquipado;
    }
}