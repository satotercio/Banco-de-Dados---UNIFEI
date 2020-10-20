/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.bd.jogo;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Tercio
 */
@Entity
public class Inimigo extends Batalha {
    // new removido
    @OneToOne
    private ComandoMonstro comando2;
    private String nomeInimigo;
    private  int HP4;
    private  int MP4;
    private  int ataque4;
    private  int defesa4;
    private  int magia4;
    private  int defMagia4;
    private  int gold;
    private  int exp;

    public ComandoMonstro getComando2() {
        return comando2;
    }

    public void setComando2(ComandoMonstro comando2) {
        this.comando2 = comando2;
    }

    public String getNomeInimigo() {
        return nomeInimigo;
    }

    public void setNomeInimigo(String nomeInimigo) {
        this.nomeInimigo = nomeInimigo;
    }

    public int getHP4() {
        return HP4;
    }

    public void setHP4(int HP4) {
        this.HP4 = HP4;
    }

    public int getMP4() {
        return MP4;
    }

    public void setMP4(int MP4) {
        this.MP4 = MP4;
    }

    public int getAtaque4() {
        return ataque4;
    }

    public void setAtaque4(int ataque4) {
        this.ataque4 = ataque4;
    }

    public int getDefesa4() {
        return defesa4;
    }

    public void setDefesa4(int defesa4) {
        this.defesa4 = defesa4;
    }

    public int getMagia4() {
        return magia4;
    }

    public void setMagia4(int magia4) {
        this.magia4 = magia4;
    }

    public int getDefMagia4() {
        return defMagia4;
    }

    public void setDefMagia4(int defMagia4) {
        this.defMagia4 = defMagia4;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    
    

    public int tecnica(int opcao) {
        return comando2.executar(opcao);
    }

}
