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
public class AppAdicionarMonstro {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory("jogoPU");
        EntityManager em = emf.createEntityManager();
        
        
        // Monstros Normais
        Inimigo monstro1 = new Inimigo();
        monstro1.setNomeInimigo("Binary_Student");
        monstro1.setHP4(100);
        monstro1.setMP4(50);
        monstro1.setAtaque4(30);
        monstro1.setDefesa4(20);
        monstro1.setMagia4(0);
        monstro1.setDefMagia4(0);
        
        Inimigo monstro2 = new Inimigo();
        monstro2.setNomeInimigo("Calculus_Dragon");
        monstro2.setHP4(150);
        monstro2.setMP4(100);
        monstro2.setAtaque4(50);
        monstro2.setDefesa4(75);
        monstro2.setMagia4(65);
        monstro2.setDefMagia4(30);
        
        Inimigo monstro3 = new Inimigo();
        monstro3.setNomeInimigo("Guardian_of_Library");
        monstro3.setHP4(200);
        monstro3.setMP4(150);
        monstro3.setAtaque4(43);
        monstro3.setDefesa4(50);
        monstro3.setMagia4(0);
        monstro3.setDefMagia4(70);
        
        //Boss
        Boss boss1 = new Boss();
        boss1.setNomeInimigo("Tuil_Cyclope_Van");
        boss1.setHP4(300);
        boss1.setMP4(200);
        boss1.setAtaque4(65);
        boss1.setDefesa4(80);
        boss1.setMagia4(70);
        boss1.setDefMagia4(50);
        
        em.getTransaction().begin();
        em.persist(monstro1);
        em.persist(monstro2);
        em.persist(monstro3);
        em.persist(boss1);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    
}
