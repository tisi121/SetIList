/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SetIList;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author thejo
 */
public class SetIList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Set<Hotel> hotelsOrganitzats = new TreeSet<>();
        
        
        hotelsOrganitzats.add(new Hotel(ZONES.MUNTANYA,58));
        hotelsOrganitzats.add(new Hotel(ZONES.PLATJA,72));
        hotelsOrganitzats.add(new Hotel(ZONES.RURAL,47));
        hotelsOrganitzats.add(new Hotel(ZONES.MUNTANYA,66));
        hotelsOrganitzats.add(new Hotel(ZONES.PLATJA,53));
        hotelsOrganitzats.add(new Hotel(ZONES.RURAL,115));
        hotelsOrganitzats.add(new Hotel(ZONES.MUNTANYA,57));
        hotelsOrganitzats.add(new Hotel(ZONES.PLATJA,85));
        hotelsOrganitzats.add(new Hotel(ZONES.RURAL,109));
        hotelsOrganitzats.add(new Hotel(ZONES.MUNTANYA,107));
        hotelsOrganitzats.add(new Hotel(ZONES.PLATJA,69));
        hotelsOrganitzats.add(new Hotel(ZONES.RURAL,95));
        
        for (Hotel h : hotelsOrganitzats) {
            System.out.println(h);
        }
    }
    
}
