/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetIList;
import java.util.Objects;
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
    private static int qt=0;

    public Hotel(ZONES zona, int preu) {
        qt++;
        this.idHotel = qt;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.zona);
        hash = 89 * hash + this.preu;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        return this.idHotel == other.idHotel;
    }
    
    
    
}
