/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.bd.jogo;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Tercio
 */
@Entity
public class ComandoHum extends Comando{

    @Override
    public int getNumeroComando() {
        return numeroComando;
    }

    @Override
    public void setNumeroComando(int numeroComando) {
        this.numeroComando = numeroComando;
    }
    // new removido
    @OneToOne
    private Habilidade habilidade;
    @Override
    public int executar(int opcao){
        return (Integer) habilidade.habHum(opcao);
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }
}
