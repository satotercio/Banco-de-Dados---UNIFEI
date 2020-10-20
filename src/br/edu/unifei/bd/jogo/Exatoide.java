/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.bd.jogo;

import javax.persistence.Entity;

/**
 *
 * @author Tercio
 */
@Entity
public class Exatoide extends Aluno{
    private  int HP2 = 230;
    private  int MP2 = 300;
    private  int ataque2 = 30;
    private  int defesa2 = 50;
    private  int magia2 = 200;
    private  int defMagia2 = 150;

    public int getHP2() {
        return HP2;
    }

    public void setHP2(int HP2) {
        this.HP2 = HP2;
    }

    public int getMP2() {
        return MP2;
    }

    public void setMP2(int MP2) {
        this.MP2 = MP2;
    }

    public int getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    public int getDefesa2() {
        return defesa2;
    }

    public void setDefesa2(int defesa2) {
        this.defesa2 = defesa2;
    }

    public int getMagia2() {
        return magia2;
    }

    public void setMagia2(int magia2) {
        this.magia2 = magia2;
    }

    public int getDefMagia2() {
        return defMagia2;
    }

    public void setDefMagia2(int defMagia2) {
        this.defMagia2 = defMagia2;
    }
    
    public void ataque2(int opcao){
        chamarAtaque(opcao);
    }
    
    @Override
    public int tecnica(int opcao){
        return getComando().executar(opcao);
    }
    
}
