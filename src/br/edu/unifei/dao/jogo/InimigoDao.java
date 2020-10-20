/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Inimigo;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class InimigoDao extends AbstractDao<Inimigo, Integer>{
    
    public InimigoDao(EntityManager em) {
        super(em);
    }
    
    public List<String> buscaNomes() {
        return em.createQuery(
                "select i.nomeInimigo from Inimigo i"
        ).getResultList();
    }
    
        public Integer findKey(String s) {
        return (Integer) em.createQuery(
                "select i.numeroBatalha "
                + "from Inimigo i "
                + "where i.nomeInimigo ='" + s
                + "'" 
        ).getSingleResult();
    }

    public Inimigo findByKeyH(Integer key) {
        return (Inimigo) em.createQuery(
                "select i "
                + "from Inimigo i "
                + "where i.numeroBatalha = " + key
        ).getSingleResult();
    }
}
