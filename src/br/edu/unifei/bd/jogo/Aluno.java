/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.bd.jogo;

import javax.persistence.Entity;

/**
 *
 * @author Tercio
 */
@Entity
public abstract class Aluno extends Personagem{
    private static int maxLevelA = 300;
    
    @Override
    public abstract int tecnica(int opcao);

    
}
