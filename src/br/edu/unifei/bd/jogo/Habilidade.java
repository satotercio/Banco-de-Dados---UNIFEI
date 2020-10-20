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
public class Habilidade implements Serializable {
    @Id
    @GeneratedValue
    int numeroHabilidade;

    public int getNumeroHabilidade() {
        return numeroHabilidade;
    }

    public void setNumeroHabilidade(int numeroHabilidade) {
        this.numeroHabilidade = numeroHabilidade;
    }
    // new removidos
    @OneToOne
    HabExat hab1;
    @OneToOne
    HabHum hab2;
    @OneToOne
    HabProf hab3 ;
    @OneToOne
    HabMonstro hab4;

    public HabExat getHab1() {
        return hab1;
    }

    public void setHab1(HabExat hab1) {
        this.hab1 = hab1;
    }

    public HabHum getHab2() {
        return hab2;
    }

    public void setHab2(HabHum hab2) {
        this.hab2 = hab2;
    }

    public HabProf getHab3() {
        return hab3;
    }

    public void setHab3(HabProf hab3) {
        this.hab3 = hab3;
    }

    public HabMonstro getHab4() {
        return hab4;
    }

    public void setHab4(HabMonstro hab4) {
        this.hab4 = hab4;
    }

    public int habExat(int opcao) {
        switch (opcao) {
            case 1:
                return hab1.getDerivativeSword();
            case 2:
                return hab1.getThunderCpp();
            case 3:
                return hab1.getInvocarRobo();
            default:
                System.out.println("Erro");
                return 0;
        }
    }

    public int habHum(int opcao) {
        switch (opcao) {
            case 1:
                return hab2.getFilosofar();
            case 2:
                return hab2.getDrinkMaconha();
            case 3:
                return hab2.getGreveGeral();
            default:
                System.out.println("Erro");
                return 0;
        }

    }

    public int habProf(int opcao) {
        switch (opcao) {
            case 1:
                return hab3.getFazerPiada();
            case 2:
                return hab3.getAtirarApagador();
            case 3:
                return hab3.getEnsinarErrado();
            default:
                System.out.println("Erro");
                return 0;
        }
    }

    public int habMonstro(int opcao) {
        switch (opcao) {
            case 1:
                return hab4.getNotaBaixa();
            case 2:
                return hab4.getRedPen();
            case 3:
                return hab4.getSubBomb();
            case 4:
                return hab4.getCannonDP();
            default:
                System.out.println("Erro");
                return 0;
        }

    }
}
