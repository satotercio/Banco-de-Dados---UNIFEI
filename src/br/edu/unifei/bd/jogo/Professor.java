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
public class Professor extends Personagem{
    private static int HP3 = 450;
    private static int MP3 = 400;
    private static int ataque3 = 200;
    private static int defesa3 = 160;
    private static int magia3 = 250;
    private static int defMagia3 = 210;
    
    public static int getHP3() {
        return HP3;
    }

    public static void setHP3(int HP3) {
        Professor.HP3 = HP3;
    }

    public static int getMP3() {
        return MP3;
    }

    public static void setMP3(int MP3) {
        Professor.MP3 = MP3;
    }

    public static int getAtaque3() {
        return ataque3;
    }

    public static void setAtaque3(int ataque3) {
        Professor.ataque3 = ataque3;
    }

    public static int getDefesa3() {
        return defesa3;
    }

    public static void setDefesa3(int defesa3) {
        Professor.defesa3 = defesa3;
    }

    public static int getMagia3() {
        return magia3;
    }

    public static void setMagia3(int magia3) {
        Professor.magia3 = magia3;
    }

    public static int getDefMagia3() {
        return defMagia3;
    }

    public static void setDefMagia3(int defMagia3) {
        Professor.defMagia3 = defMagia3;
    }
    
    public void ataque3(int opcao){
        chamarAtaque(opcao);
    }
    
    @Override
    public int tecnica(int opcao) {
        return getComando().executar(opcao);
    }
            
}
