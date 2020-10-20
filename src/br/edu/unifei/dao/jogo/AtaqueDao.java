/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Ataque;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class AtaqueDao extends AbstractDao<Ataque, Integer>{
    
    public AtaqueDao(EntityManager em) {
        super(em);
    }
    
}
