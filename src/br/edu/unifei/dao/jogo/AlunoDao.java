/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import br.edu.unifei.bd.jogo.Aluno;
import javax.persistence.EntityManager;

/**
 *
 * @author Tercio
 */
public class AlunoDao extends AbstractDao<Aluno, Integer>{
    
    public AlunoDao(EntityManager em) {
        super(em);
    }
    
}
