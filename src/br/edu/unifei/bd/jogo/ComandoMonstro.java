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
public class ComandoMonstro implements Serializable {
    //new removido
    @Id
    @GeneratedValue
    int numComandoMonstro;
    @OneToOne
    private Habilidade habilidade;
    public int executar(int opcao){
        return habilidade.habMonstro(opcao);
    }

    public int getNumComandoMonstro() {
        return numComandoMonstro;
    }

    public void setNumComandoMonstro(int numComandoMonstro) {
        this.numComandoMonstro = numComandoMonstro;
    }
    
    
}
