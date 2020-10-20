/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.dao.jogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author windows
 */
public class DataSource {
    
private static EntityManagerFactory emf =
   Persistence.createEntityManagerFactory("jogoPU");
    
    public static EntityManager createEntityManager(){
        return emf.createEntityManager();
    }
    
    
}
