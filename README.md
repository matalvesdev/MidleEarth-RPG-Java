# Middle Earth RPG Java ⚔️🧙‍♂️

Jogo de RPG em modo texto baseado no universo de O Senhor dos Anéis, onde heróis enfrentam Orcs e o próprio Sauron em batalhas épicas pela Terra-média.

## 📜 Sobre o Projeto

Middle Earth RPG é um jogo de combate por turnos desenvolvido em Java que recria batalhas épicas do universo de Tolkien. Os jogadores controlam uma companhia de heróis (Elfo, Anão e Humano) que devem derrotar hordas de Orcs antes de enfrentar o temível Sauron e seu Anel do Poder.

## ✨ Funcionalidades

- 🗡️ **Sistema de Combate por Turnos** - Batalhas estratégicas contra inimigos
- 👥 **Múltiplas Raças Jogáveis** - Elfo, Anão e Humano com atributos únicos
- 🎒 **Sistema de Equipamentos** - Armas e itens que aumentam ataque e defesa
- 🐉 **Boss Battle** - Confronto épico contra Sauron
- 💍 **Anel do Poder** - Mecânica especial do boss que duplica seu poder
- ⚡ **Duas Fases de Batalha** - Elimine os Orcs antes de enfrentar Sauron
- 💚 **Sistema de Recuperação** - Heróis recuperam vida entre as fases

## 🎮 Como Jogar

### História

Três heróis (Legolas, Durin e Aragorn) equipam-se com armas élicas e anãs para enfrentar três poderosos Orcs. Se vencerem esta primeira fase, devem unir forças para derrotar Sauron, o Senhor do Escuro, que possui o Anel do Poder. 

### Mecânicas

1. **Primeira Fase**:  Cada herói enfrenta um Orc individualmente
2. **Recuperação**: Heróis sobreviventes recuperam 50 pontos de vida
3. **Batalha Final**: Os três heróis atacam Sauron simultaneamente
4. **Vitória**: Sauron perde o Anel do Poder ao ser derrotado

## 🛠️ Tecnologias Utilizadas

- **Java 21** - Linguagem de programação
- **Maven** - Gerenciador de dependências e build
- **POO** - Programação Orientada a Objetos

## 🏗️ Arquitetura do Projeto

### Hierarquia de Classes

```
Personagem (Abstract)
├── Elfo
├── Anão
├── Humano
└── Inimigo (Abstract)
    ├── Orc
    └── Sauron

Item (Concrete)
Batalha (Static Utility)
```

## 📊 Atributos dos Personagens

### Heróis

| Raça | Vida | Força | Defesa | Arma Inicial |
|------|------|-------|--------|--------------|
| **Elfo** (Legolas) | 80 | 20 (+7 com Arco) | 10 (+3 com Arco) | Arco Élfico |
| **Anão** (Durin) | 100 | 25 (+5 com Machado) | 20 (+2 com Machado) | Machado Anões |
| **Humano** (Aragorn) | 90 | 22 (+7 com Espada) | 15 (+3 com Espada) | Espada Élfica |

### Inimigos

| Inimigo | Vida | Força | Defesa | Habilidade Especial |
|---------|------|-------|--------|---------------------|
| **Orc** | 100 | 15 | 5 | Ataque Feroz |
| **Sauron** (Boss) | 100 | 25 | 15 | Anel do Poder (2x Dano) |

## 📦 Estrutura do Projeto

```
MidleEarth-RPG-Java/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   ├── Personagem.java (Abstract)
│                   ├── Elfo.java
│                   ├── Anao.java
│                   ├── Humano.java
│                   ├── Inimigo.java (Abstract)
│                   ├── Orc.java
│                   ├── Sauron.java
│                   ├── Item.java
│                   ├── Batalha.java
│                   └── Main.java
├── pom. xml
└── README.md
```

## 🚀 Como Executar

### Pré-requisitos

- Java 21 ou superior
- Maven 3.6+

### Passo 1: Clone o repositório

```bash
git clone https://github.com/matalvesdev/MidleEarth-RPG-Java.git
cd MidleEarth-RPG-Java
```

### Passo 2: Compile o projeto

```bash
mvn clean compile
```

### Passo 3: Execute o jogo

```bash
mvn exec:java -Dexec.mainClass="org.example. Main"
```

Ou compile e execute diretamente:

```bash
mvn clean package
java -cp target/GameRPG-1.0-SNAPSHOT.jar org.example.Main
```

## 🎯 Sistema de Combate

### Cálculo de Dano

```java
int dano = atacante.getForca() - defensor.getDefesa();
if (dano > 0) {
    defensor.setVida(defensor.getVida() - dano);
}
```

### Sistema de Itens

Os itens fornecem bônus permanentes de ataque e defesa:

```java
Item arco = new Item("Arco Élfico", 7, 3);  // +7 ATK, +3 DEF
jogador.equiparItem(arco);
```

### Mecânica do Boss

Sauron possui o Anel do Poder que **duplica seu dano**:

```java
int dano = getForca() * (anelDoPoderEquipado ?  2 : 1) - inimigo.getDefesa();
```

Quando derrotado, Sauron perde o Anel do Poder, reduzindo seu poder. 

## 🎲 Exemplo de Batalha

```
=== PRIMEIRA FASE ===
Legolas equipou Arco Élfico
Durin equipou Machado Anões
Aragorn equipou Espada Élfica

Legolas ataca com arco e causa 12 de dano em Ugluk! 
Ugluk ataca ferozmente e causa 2 de dano em Legolas!
... 

=== BATALHA FINAL CONTRA SAURON ===

A Sociedade do Anel enfrenta Sauron! 
Legolas ataca com arco e causa 12 de dano em Sauron! 
Durin ataca com machado e causa 15 de dano em Sauron!
Aragorn ataca com espada e causa 14 de dano em Sauron! 
Sauron ataca com poder das trevas e causa 35 de dano em Aragorn!
... 

Os heróis venceram!  Sauron foi derrotado! 
Sauron perdeu o Anel do Poder!  Seu poder foi reduzido! 
```

## 🔧 Conceitos de POO Aplicados

### Herança
- Classe abstrata `Personagem` estendida por heróis e inimigos
- Classe abstrata `Inimigo` estendida por Orc e Sauron

### Polimorfismo
- Método abstrato `atacar()` implementado de forma única por cada classe

### Encapsulamento
- Atributos privados com getters/setters
- Lógica de batalha encapsulada na classe `Batalha`

### Abstração
- Classes abstratas definem contratos para personagens

## 📝 Notas Técnicas

- **Padrão Strategy**: Cada personagem implementa seu próprio método de ataque
- **Composição**: Personagens podem equipar itens que modificam atributos
- **Métodos Estáticos**: Classe `Batalha` utiliza métodos utilitários estáticos
- **Sistema de Turnos**: Loop while controlado pela vida dos combatentes

## 🎯 Possíveis Melhorias Futuras

- [ ] Interface gráfica (JavaFX)
- [ ] Sistema de níveis e experiência
- [ ] Mais raças jogáveis (Magos, Hobbits)
- [ ] Inventário com múltiplos itens
- [ ] Sistema de habilidades especiais
- [ ] Persistência de dados (salvar/carregar jogo)
- [ ] Modo multiplayer
- [ ] Sistema de missões e quests

## 👨‍💻 Autor

Desenvolvido por [matalvesdev](https://github.com/matalvesdev)

## 📄 Licença

Este projeto está sob a licença MIT.  Veja o arquivo LICENSE para mais detalhes. 

---

⚔️ *"Uma companhia se formará para destruir o Um Anel.  Você será a Sociedade do Anel!"* ⚔️

⭐ Se este projeto foi útil para você, considere dar uma estrela! 
