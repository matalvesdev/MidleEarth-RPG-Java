package org.example;

public class Batalha {
    public static boolean iniciar(Personagem p1, Personagem i1, Personagem p2, Personagem i2, Personagem p3, Personagem i3) {
        System.out.println("=== PRIMEIRA FASE ===");

        // Batalha contra o primeiro orc
        while (p1.getVida() > 0 && i1.getVida() > 0) {
            p1.atacar(i1);
            if (i1.getVida() <= 0) break;
            i1.atacar(p1);
        }

        // Batalha contra o segundo orc
        while (p2.getVida() > 0 && i2.getVida() > 0) {
            p2.atacar(i2);
            if (i2.getVida() <= 0) break;
            i2.atacar(p2);
        }

        // Batalha contra o terceiro orc
        while (p3.getVida() > 0 && i3.getVida() > 0) {
            p3.atacar(i3);
            if (i3.getVida() <= 0) break;
            i3.atacar(p3);
        }

        return i1.getVida() <= 0 && i2.getVida() <= 0 && i3.getVida() <= 0;
    }

    public static void iniciarBatalhaFinal(Personagem p1, Personagem p2, Personagem p3, Sauron boss) {
        System.out.println("A Sociedade do Anel enfrenta Sauron!");

        while (boss.getVida() > 0 && (p1.getVida() > 0 || p2.getVida() > 0 || p3.getVida() > 0)) {
            // Cada herói vivo ataca Sauron
            if (p1.getVida() > 0) p1.atacar(boss);
            if (p2.getVida() > 0) p2.atacar(boss);
            if (p3.getVida() > 0) p3.atacar(boss);

            // Se Sauron ainda estiver vivo, ele contra-ataca
            if (boss.getVida() > 0) {
                // Sauron ataca um herói aleatório que ainda esteja vivo
                Personagem alvo = escolherAlvoAleatorio(p1, p2, p3);
                if (alvo != null) {
                    boss.atacar(alvo);
                }
            }

            // Quando Sauron fica com menos de 30% de vida, perde o Anel
            if (boss.getVida() < 150 && boss.temAnelDoPoder()) {
                boss.perderAnelDoPoder();
            }
        }

        if (boss.getVida() <= 0) {
            System.out.println("A Sociedade do Anel venceu! Sauron foi derrotado!");
        } else {
            System.out.println("Sauron venceu! A Terra-média está perdida...");
        }
    }

    private static Personagem escolherAlvoAleatorio(Personagem... herois) {
        java.util.List<Personagem> alvosVivos = new java.util.ArrayList<>();
        for (Personagem heroi : herois) {
            if (heroi.getVida() > 0) {
                alvosVivos.add(heroi);
            }
        }
        if (alvosVivos.isEmpty()) return null;
        return alvosVivos.get(new java.util.Random().nextInt(alvosVivos.size()));
    }
}