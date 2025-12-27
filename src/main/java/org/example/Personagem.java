package org.example;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private int defesa;
    private Item itemEquipado;

    public Personagem(String nome, int vida, int forca, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
    }

    public void equiparItem(Item item) {
        if (this.itemEquipado != null) {
            // Remove bônus do item anterior
            this.forca -= this.itemEquipado.getBonusAtaque();
            this.defesa -= this.itemEquipado.getBonusDefesa();
        }

        this.itemEquipado = item;
        this.forca += item.getBonusAtaque();
        this.defesa += item.getBonusDefesa();

        System.out.println(nome + " equipou " + item.getNome());
    }

    public abstract void atacar(Personagem inimigo);

    // Getters e setters
    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }
    public int getForca() { return forca; }
    public int getDefesa() { return defesa; }
    public Item getItemEquipado() { return itemEquipado; }
}