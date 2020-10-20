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
public class HabProf implements Serializable {

    private final int fazerPiada = 110;
    private final int atirarApagador = 150;
    private final int ensinarErrado = 200;

    @Id
    @GeneratedValue
    int numeroHabProfessor;

    public int getNumeroHabProfessor() {
        return numeroHabProfessor;
    }

    public void setNumeroHabProfessor(int numeroHabProfessor) {
        this.numeroHabProfessor = numeroHabProfessor;
    }

    public int getFazerPiada() {
        return fazerPiada;
    }

    public int getAtirarApagador() {
        return atirarApagador;
    }

    public int getEnsinarErrado() {
        return ensinarErrado;
    }

}
