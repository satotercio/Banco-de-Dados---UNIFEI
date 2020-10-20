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
public class HabMonstro implements Serializable {
    @Id
    @GeneratedValue
    int numeroHabMonstro;

    public int getNumeroHabMonstro() {
        return numeroHabMonstro;
    }

    public void setNumeroHabMonstro(int numeroHabMonstro) {
        this.numeroHabMonstro = numeroHabMonstro;
    }
    private final int notaBaixa = 30;
    private final int redPen = 70;
    private final int subBomb = 100;
    private final int cannonDP = 120;

    public int getNotaBaixa() {
        return notaBaixa;
    }

    public int getRedPen() {
        return redPen;
    }

    public int getSubBomb() {
        return subBomb;
    }

    public int getCannonDP() {
        return cannonDP;
    }

}
