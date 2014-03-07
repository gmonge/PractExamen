/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.domain;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Song {
    private String name;
    private ArrayList<Verse> Verse;
    
    public Song(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVerse(ArrayList<com.uia.is12.domain.Verse> Verse) {
        this.Verse = Verse;
    }

    public ArrayList<com.uia.is12.domain.Verse> getVerse() {
        return Verse;
    }
    
    
}
