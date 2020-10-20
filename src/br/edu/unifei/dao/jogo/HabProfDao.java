/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.HabProf;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class HabProfDao extends AbstractDao<HabProf, Integer>{
    
    public HabProfDao(EntityManager em) {
        super(em);
    }
    
}
