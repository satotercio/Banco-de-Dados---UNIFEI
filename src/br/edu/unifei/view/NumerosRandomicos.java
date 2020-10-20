/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.view;

import java.util.Random;

/**
 *
 * @author Tercio
 */
public class NumerosRandomicos {

    public static Random RANDOM = new Random(System.nanoTime());

    public static final float randomFloat(final float pMin, final float pMax) {
        return pMin + RANDOM.nextFloat() * (pMax - pMin);
    }
    
    public static final int randomInt(final int pMin, final int pMax) {
        return pMin + RANDOM.nextInt(4);
    }

}
