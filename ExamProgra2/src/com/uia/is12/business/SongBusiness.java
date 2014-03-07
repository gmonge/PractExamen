/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uia.is12.business;

import com.uia.is12.data.SongDAO;
import com.uia.is12.domain.Song;

/**
 *
 * @author Administrador
 */
public class SongBusiness {
    
    private SongDAO songDAO;

    public SongBusiness() {
        this.songDAO = new SongDAO();
    }

    public Song getSong() {
        return songDAO.getSong();
    }
    
    
    
    
}
