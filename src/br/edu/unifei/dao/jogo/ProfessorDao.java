/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Professor;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class ProfessorDao extends AbstractDao<Professor, Integer> {

    public ProfessorDao(EntityManager em) {
        super(em);
    }

    public List<String> buscaNomes() {
        return em.createQuery(
                "select p.nome from Professor p"
        ).getResultList();
    }

    //and h.codAleatorio = " + b
    public Integer findKey(String s) {
        return (Integer) em.createQuery(
                "select p.numeroBatalha "
                + "from Professor p "
                + "where p.nome ='" + s
                + "'"
        ).getSingleResult();
    }

    public Professor findByKeyH(Integer key) {
        return (Professor) em.createQuery(
                "select p "
                + "from Professor p "
                + "where p.numeroBatalha = " + key
        ).getSingleResult();
    }

    public List<Integer> findAllCodAleatorio() {
        return em.createQuery(
                "select p.codAleatorio from Professor p"
        ).getResultList();
    }

}
