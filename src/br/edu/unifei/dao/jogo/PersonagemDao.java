/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Personagem;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class PersonagemDao extends AbstractDao<Personagem, Integer>{
    
    public PersonagemDao(EntityManager em) {
        super(em);
    }

    public List<String> buscarNomesPersonagem() {
        return em.createQuery(
                "select p.nome from Personagem p"
        ).getResultList();
    }
    
            public Integer findKey(String s) {
        return (Integer) em.createQuery(
                "select p.numeroBatalha "
                + "from Personagem p "
                + "where p.nome ='" + s
                + "'" 
        ).getSingleResult();
    }

    public Personagem findByKeyH(Integer key) {
        return (Personagem) em.createQuery(
                "select p "
                + "from Personagem p "
                + "where p.numeroBatalha = " + key
        ).getSingleResult();
    }
}
