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
import javax.persistence.OneToOne;

/**
 *
 * @author Tercio
 */
@Entity
public class Batalha implements Serializable {

    @Id
    @GeneratedValue
    int numeroBatalha;

    @OneToOne
    MediadorBatalha mediador;

    
    public MediadorBatalha getMediador() {
        return mediador;
    }

    public void setMediador(MediadorBatalha mediador) {
        this.mediador = mediador;
    }
    
    
    protected void chamarAtaque(int opcao) {
        getMediador().ataque(opcao);
    }

    public int getNumeroBatalha() {
        return numeroBatalha;
    }

    public void setNumeroBatalha(int numeroBatalha) {
        this.numeroBatalha = numeroBatalha;
    }

    
    
}
