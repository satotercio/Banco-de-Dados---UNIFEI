/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.bd.jogo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Tercio
 */
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf =
          Persistence.createEntityManagerFactory("jogoPU");
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();  
      
      em.getTransaction().commit();
      em.close();
      emf.close();
    }
}
