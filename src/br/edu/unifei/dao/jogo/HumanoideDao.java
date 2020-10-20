/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Humanoide;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class HumanoideDao extends AbstractDao<Humanoide, Integer> {

    public HumanoideDao(EntityManager em) {
        super(em);
    }

    public List<String> buscaNomes() {
        return em.createQuery(
                "select h.nome from Humanoide h"
        ).getResultList();
    }

    //and h.codAleatorio = " + b
    public Integer findKey(String s) {
        return (Integer) em.createQuery(
                "select h.numeroBatalha "
                + "from Humanoide h "
                + "where h.nome ='" + s
                + "'" 
        ).getSingleResult();
    }

    public Humanoide findByKeyH(Integer key) {
        return (Humanoide) em.createQuery(
                "select h "
                + "from Humanoide h "
                + "where h.numeroBatalha = " + key
        ).getSingleResult();
    }
    
    public List<Integer> findAllCodAleatorio(){
        return em.createQuery(
                "select h.codAleatorio from Humanoide h"        
        ).getResultList();               
    }

}
