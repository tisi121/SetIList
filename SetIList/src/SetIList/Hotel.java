/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetIList;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author thejo
 */
public class Hotel implements Comparable<Hotel>{
    //Constants
    
    //Atributs
    private int idHotel;
    private ZONES zona;
    private int preu;

    public Hotel(ZONES zona, int preu) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.preu = preu;
    }
    
    //Setters
    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public void setZona(ZONES zona) {
        this.zona = zona;
    }

    public void setPreu(int preu) throws Excepcio1 {
        if(preu<40 || preu>150){
            throw new Excepcio1("Preu no valid!");
        }
        else{
        this.preu = preu;
        }
    }
    
    //Getters
    public int getIdHotel() {
        return idHotel;
    }

    public ZONES getZona() {
        return zona;
    }

    public int getPreu() {
        return preu;
    }

    @Override
    public int compareTo(Hotel o) {
        return Integer.compare(this.preu, o.preu);
    }

    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", zona=" + zona + ", preu=" + preu + '}';
    }
    
    
}
