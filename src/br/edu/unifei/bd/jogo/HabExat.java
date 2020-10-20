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
public class HabExat implements Serializable {
    
    private final int derivativeSword = 120;
    private final int thunderCpp = 170;
    private final int invocarRobo = 250;

    @Id
    @GeneratedValue
    int numeroHabExatas;

    public int getNumeroHabExatas() {
        return numeroHabExatas;
    }

    public void setNumeroHabExatas(int numeroHabExatas) {
        this.numeroHabExatas = numeroHabExatas;
    }


    public int getDerivativeSword() {
        return derivativeSword;
    }

    public int getThunderCpp() {
        return thunderCpp;
    }

    public int getInvocarRobo() {
        return invocarRobo;
    }

    
    
    
}
