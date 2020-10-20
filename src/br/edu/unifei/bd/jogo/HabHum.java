/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.bd.jogo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Tercio
 */
@Entity
public class HabHum implements Serializable {
    
    private final int filosofar = 50;
    private final int drinkMaconha = 70;
    private final int greveGeral = 110;
    
    @Id
    @GeneratedValue
    int numeroHabHumanas;

    public int getNumeroHabHumanas() {
        return numeroHabHumanas;
    }

    public void setNumeroHabHumanas(int numeroHabHumanas) {
        this.numeroHabHumanas = numeroHabHumanas;
    }
    
    public String getNomeGreveGeral(){
        return "Greve geral";
    }

    public int getFilosofar() {
        return filosofar;
    }

    public int getDrinkMaconha() {
        return drinkMaconha;
    }

    public int getGreveGeral() {
        return greveGeral;
    }    
}
