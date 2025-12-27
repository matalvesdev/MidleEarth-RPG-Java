package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Elfo("Legolas");
        Personagem inimigo = new Orc("Ugluk");
        Personagem jogador2 = new Anao("Durin");
        Personagem inimigo2 = new Orc("Amenor");
        Personagem jogador3 = new Humano("Aragorn");
        Personagem inimigo3 = new Orc("Numenor");
        Sauron boss = new Sauron();

        Item arco = new Item("Arco Élfico", 7, 3);
        jogador.equiparItem(arco);

        Item espada = new Item("Espada Élfica", 7, 3);
        jogador3.equiparItem(espada);

        Item machado = new Item("Machado Anões", 5, 2);
        jogador2.equiparItem(machado);

        // Primeira fase - batalha contra orcs
        boolean venceuPrimeiraFase = Batalha.iniciar(jogador, inimigo, jogador2, inimigo2, jogador3, inimigo3);

        // Se vencer a primeira fase, enfrenta Sauron
        if (venceuPrimeiraFase && jogador.getVida() > 0 && jogador2.getVida() > 0 && jogador3.getVida() > 0) {
            System.out.println("\n=== BATALHA FINAL CONTRA SAURON ===\n");

            // Recupera um pouco da vida dos heróis antes da batalha final
            jogador.setVida(Math.min(jogador.getVida() + 50, 100));
            jogador2.setVida(Math.min(jogador2.getVida() + 50, 100));
            jogador3.setVida(Math.min(jogador3.getVida() + 50, 100));

            // Batalha final contra Sauron
            Batalha.iniciarBatalhaFinal(jogador, jogador2, jogador3, boss);
        } else {
            System.out.println("Os heróis não conseguiram chegar até Sauron...");
        }
    }
}