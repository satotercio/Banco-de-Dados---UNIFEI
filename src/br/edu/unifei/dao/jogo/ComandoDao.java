/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Comando;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class ComandoDao extends AbstractDao<Comando, Integer>{
    
    public ComandoDao(EntityManager em) {
        super(em);
    }
    
}
