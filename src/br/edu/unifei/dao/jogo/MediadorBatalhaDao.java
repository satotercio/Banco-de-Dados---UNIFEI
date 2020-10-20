/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.MediadorBatalha;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class MediadorBatalhaDao extends AbstractDao<MediadorBatalha, Integer>{
    
    public MediadorBatalhaDao(EntityManager em) {
        super(em);
    }
    
}
