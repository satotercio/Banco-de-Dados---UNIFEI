/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.bd.jogo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Tercio
 */
@Entity
public abstract class Personagem extends Batalha implements Serializable{
    
    private String nome;
    private int experiencia = 0;
    private int levelAtual = 0;
    private int codAleatorio;

    @Override
    public MediadorBatalha getMediador() {
        return mediador;
    }

    @Override
    public void setMediador(MediadorBatalha mediador) {
        this.mediador = mediador;
    }

    @Override
    public int getNumeroBatalha() {
        return numeroBatalha;
    }

    @Override
    public void setNumeroBatalha(int numeroBatalha) {
        this.numeroBatalha = numeroBatalha;
    }
   
    @OneToOne
    private Comando comando; 
    
    
    public Comando getComando() {
        return comando;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  int getExperiencia() {
        return experiencia;
    }

    public  void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getLevelAtual() {
        return levelAtual;
    }

    public void setLevelAtual(int levelAtual) {
        this.levelAtual = levelAtual;
    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }
    
        public int getCodAleatorio() {
        return codAleatorio;
    }

    public void setCodAleatorio(int codAleatorio) {
        this.codAleatorio = codAleatorio;
    }
       
    public abstract int tecnica(int opcao);
}
