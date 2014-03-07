/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.data;

import com.uia.is12.domain.Song;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class SongDAO {

    public SongDAO() {
    }
    
    public Song getSong(){
        
        Song song1 = new Song();
        ArrayList<Verse> verses = new ArrayList();
        
        verses.add(new Verse("...Universidad...", 5000));
        verses.add(new Verse("...Internacional...", 5000));
        verses.add(new Verse("...de las...", 5000));
        verses.add(new Verse("...Americas...", 5000));
        
        song1.setVerse(verses);
        
        return song1;
        
    }
}
