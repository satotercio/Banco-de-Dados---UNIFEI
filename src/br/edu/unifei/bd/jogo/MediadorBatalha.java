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
public abstract class MediadorBatalha implements Serializable {
    @Id
    @GeneratedValue
    int numeroAtaque;

    public int getNumeroAtaque() {
        return numeroAtaque;
    }

    public void setNumeroAtaque(int numeroAtaque) {
        this.numeroAtaque = numeroAtaque;
    }
    public abstract void ataque(int opcao);
}
