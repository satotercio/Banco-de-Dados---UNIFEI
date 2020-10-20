/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Boss;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class BossDao extends AbstractDao<Boss, Integer>{
    
    public BossDao(EntityManager em) {
        super(em);
    }
    
   public List<String> buscaNomes() {
        return em.createQuery(
                "select b.nomeInimigo from Boss b"
        ).getResultList();
    }
}
