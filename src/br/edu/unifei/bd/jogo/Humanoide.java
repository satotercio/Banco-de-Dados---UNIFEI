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
public class Humanoide extends Aluno{
    private  int HP1 = 300;
    private  int MP1 = 150;
    private  int ataque1 = 150;
    private  int defesa1 = 100;
    private  int defMagia1 = 40;
    
    public int getHP1() {
        return HP1;
    }

    public void setHP1(int HP1) {
        this.HP1 = HP1;
    }

    public int getMP1() {
        return MP1;
    }

    public void setMP1(int MP1) {
        this.MP1 = MP1;
    }

    public int getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    public int getDefesa1() {
        return defesa1;
    }

    public void setDefesa1(int defesa1) {
        this.defesa1 = defesa1;
    }

    public int getDefMagia1() {
        return defMagia1;
    }

    public void setDefMagia1(int defMagia1) {
        this.defMagia1 = defMagia1;
    }

   
    
    
    @Override
    public int tecnica(int opcao){
        return getComando().executar(opcao);
    }
    
    public void ataque1(int opcao){
        chamarAtaque(opcao);
    }
    
}
