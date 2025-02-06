/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SetIList;

import java.util.Collections;
import java.util.Scanner;
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
        String zona;
        int num = 0;
        Scanner sc=new Scanner(System.in);

        hotelsOrganitzats.add(new Hotel(ZONES.MUNTANYA, 58));
        hotelsOrganitzats.add(new Hotel(ZONES.PLATJA, 72));
        hotelsOrganitzats.add(new Hotel(ZONES.RURAL, 47));
        hotelsOrganitzats.add(new Hotel(ZONES.MUNTANYA, 66));
        hotelsOrganitzats.add(new Hotel(ZONES.PLATJA, 53));
        hotelsOrganitzats.add(new Hotel(ZONES.RURAL, 115));
        hotelsOrganitzats.add(new Hotel(ZONES.MUNTANYA, 57));
        hotelsOrganitzats.add(new Hotel(ZONES.PLATJA, 85));
        hotelsOrganitzats.add(new Hotel(ZONES.RURAL, 109));
        hotelsOrganitzats.add(new Hotel(ZONES.MUNTANYA, 107));
        hotelsOrganitzats.add(new Hotel(ZONES.PLATJA, 69));
        hotelsOrganitzats.add(new Hotel(ZONES.RURAL, 95));

        do {
            System.out.println("Escolleix una zona d'hotels: ");
            System.out.println("1 - Platja ");
            System.out.println("2 - Muntanya ");
            System.out.println("3 - Rural");
            System.out.println("4 - Dona igual la zona");
            System.out.println("5 - Sortir");
            System.out.println("Escolleix una opció");
            num=sc.nextInt();

            switch (num) {
                case 1:
                    for (Hotel h : hotelsOrganitzats) {
                            if(h.getZona().equals(ZONES.PLATJA)){
                                System.out.println(h.toString());
                                
                                
                                
                            }
                    }
                    System.out.println("Prem ENTER per continuar...");
                    sc.nextLine();
                    break;
                case 2:
                    for (Hotel h : hotelsOrganitzats) {
                            if(h.getZona().equals(ZONES.MUNTANYA)){
                                System.out.println(h.toString());
                                
                                
                            }
                            
                    }
                    System.out.println("Prem ENTER per continuar...");
                    sc.nextLine();
                    break;
                case 3:
                    for (Hotel h : hotelsOrganitzats) {
                            if(h.getZona().equals(ZONES.RURAL)){
                                System.out.println(h.toString());
                            }
                    }
                    System.out.println("Prem ENTER per continuar...");
                    sc.nextLine();
                    break;
                case 4:
                    for (Hotel h : hotelsOrganitzats) {
                        System.out.println(h);
                        
                        
                    }
                    System.out.println("Prem ENTER per continuar...");
                    sc.nextLine();
                    break;
            }
        } while (num != 5);

    }

}
