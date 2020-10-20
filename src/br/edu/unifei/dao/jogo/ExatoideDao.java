/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Exatoide;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class ExatoideDao extends AbstractDao<Exatoide, Integer>{
    
    public ExatoideDao(EntityManager em) {
        super(em);
    }
    
        public List<String> buscaNomes() {
        return em.createQuery(
                "select e.nome from Exatoide e"
        ).getResultList();
    }

    //and h.codAleatorio = " + b
    public Integer findKey(String s) {
        return (Integer) em.createQuery(
                "select e.numeroBatalha "
                + "from Exatoide e "
                + "where e.nome ='" + s
                + "'" 
        ).getSingleResult();
    }

    public Exatoide findByKeyH(Integer key) {
        return (Exatoide) em.createQuery(
                "select e "
                + "from Exatoide e "
                + "where e.numeroBatalha = " + key
        ).getSingleResult();
    }
    
    public List<Integer> findAllCodAleatorio(){
        return em.createQuery(
                "select e.codAleatorio from Exatoide e"        
        ).getResultList();               
    }

}
