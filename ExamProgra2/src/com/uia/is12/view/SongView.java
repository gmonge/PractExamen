/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.view;

import com.uia.is12.business.SongBusiness;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class SongView extends Thread{
    private SongBusiness songBusiness;

    public SongView() {
        this.songBusiness = new SongBusiness();
    }

    
    
    public void run(){
        try {
            ArrayList<Verse> verses = songBusiness.getSong().getVerse();
            
            for(Verse s: verses){
                Thread.sleep(s.getVerseTime());
                System.out.println(s.getParagraph());
            }
            
        } catch (InterruptedException ex) {
            Logger.getLogger(SongView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
