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
// mudar interface para classe abstrata

/*public interface Comando {
    public int executar(int opcao);
}
*/
@Entity
public abstract class Comando implements Serializable{
    @Id
    @GeneratedValue
    int numeroComando;

    public int getNumeroComando() {
        return numeroComando;
    }

    public void setNumeroComando(int numeroComando) {
        this.numeroComando = numeroComando;
    }
    
    public abstract int executar(int opcao);
}