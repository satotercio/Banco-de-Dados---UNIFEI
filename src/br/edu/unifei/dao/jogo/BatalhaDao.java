/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Batalha;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class BatalhaDao extends AbstractDao<Batalha, Integer>{
    
    public BatalhaDao(EntityManager em) {
        super(em);
    }
    
    public List<String> buscarNomesInimigos() {
        return em.createQuery(
                "select i.nomeInimigo from Inimigo i "
        ).getResultList();
    }
            
    public List<String> buscarNomesPersonagem() {
        return em.createQuery(
                "select p.nome from Personagem p"
        ).getResultList();
    }        
    
        public Integer findKey(String s) {
        return (Integer) em.createQuery(
                "select b.numeroBatalha "
                + "from Batalha b "
                + "where b.nome ='" + s
                + "'" 
        ).getSingleResult();
    }

    public Batalha findByKeyH(Integer key) {
        return (Batalha) em.createQuery(
                "select b "
                + "from Batalha b "
                + "where b.numeroBatalha = " + key
        ).getSingleResult();
    }
}
