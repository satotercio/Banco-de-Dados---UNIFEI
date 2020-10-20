/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.view;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Tercio
 */
public class NumerosRandomicosDistintos {
    private static int numAleatorio = 0;
    private static ArrayList<Integer> list = new ArrayList<Integer>();
    
    public static void sortear()  
    {
        for (int i = 1; i< 1000; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
    }

    public static int getNumAleatorio() {
        return numAleatorio++;
    }

    public static void setNumAleatorio(int numAleatorio) {
        NumerosRandomicosDistintos.numAleatorio = numAleatorio;
    }

    public static ArrayList<Integer> getList() {
        return list;
    }

    public static void setList(ArrayList<Integer> list) {
        NumerosRandomicosDistintos.list = list;
    }
    
    
}
