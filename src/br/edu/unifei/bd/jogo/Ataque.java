/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.bd.jogo;

import java.io.Serializable;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Tercio
 */
@Entity
public class Ataque extends MediadorBatalha implements  Serializable {

    @OneToOne
    private Humanoide character1;
    @OneToOne
    private HabHum habNome2;
    @OneToOne
    private Exatoide character2;
    @OneToOne
    private Professor character3;
    @OneToOne
    private Boss monster;
    

    public Humanoide getCharacter1() {
        return character1;
    }

    public void setCharacter1(Humanoide character1) {
        this.character1 = character1;
    }

    public HabHum getHabNome2() {
        return habNome2;
    }

    public void setHabNome2(HabHum habNome2) {
        this.habNome2 = habNome2;
    }

    public Exatoide getCharacter2() {
        return character2;
    }

    public void setCharacter2(Exatoide character2) {
        this.character2 = character2;
    }

    public Professor getCharacter3() {
        return character3;
    }

    public void setCharacter3(Professor character3) {
        this.character3 = character3;
    }

    public Boss getMonster() {
        return monster;
    }

    public void setMonster(Boss monster) {
        this.monster = monster;
    }

    

    @Override
    public void ataque(int opcao) {
        
        Random random = new Random();
        int opcao2 = (random.nextInt(4) + 1);
        int lv = random.nextInt(300);
        if (opcao2 == 1) {
            System.out.println(monster.getNomeInimigo() + " usou Nota Baixa: " + "Tirou 30 de vida");
        }
        if (opcao2 == 2) {
            System.out.println(monster.getNomeInimigo() + " usou Red Pen: " + "Tirou 70 de vida");
        }
        if (opcao2 == 3) {
            System.out.println(monster.getNomeInimigo() + " usou Sub-Bomb: " + "Tirou 100 de vida");
        }
        if (opcao2 == 4) {
            System.out.println(monster.getNomeInimigo() + " usou Cannon DP: " + "Tirou 120 de vida");
        }

        character1.setHP1(character1.getHP1() - monster.tecnica(opcao2));
        System.out.println(character1.getNome() + " ficou com " + character1.getHP1());
        if (opcao == 1) {
            System.out.println(character1.getNome() + " usou Filosofar");
        }
        if (opcao == 2) {
            System.out.println(character1.getNome() + " usou drinkMaconha");
        }
        if (opcao == 3) {
            System.out.println(character1.getNome() + " usou " + habNome2.getNomeGreveGeral());
        }
        System.out.println(character1.getNome() + " tirou " + character1.tecnica(opcao));
        monster.setHP4(monster.getHP4() - character1.tecnica(opcao));
        System.out.println(monster.getNomeInimigo() + " ficou com " + monster.getHP4());

        if (monster.getHP4() <= 0) {
            System.out.println("Victory!");
            character1.setExperiencia(monster.getExp());
            System.out.println(character1.getNome() + " ganhou " + monster.getExp() + " Exp.");
            lv++;
            character1.setLevelAtual(lv);
            System.out.println(character1.getNome() + " aumentou de nível ");
            System.out.println("De " + (character1.getLevelAtual() - 1) + " para " + character1.getLevelAtual());
            System.out.println(character1.getNome() + " ganhou " + monster.getItem());
            System.out.println(character1.getNome() + " ganhou " + monster.getGold() + " Gold");
        }
        else if (character1.getHP1() == 0) {
            System.out.println("Game Over...");
        }

    }

}
