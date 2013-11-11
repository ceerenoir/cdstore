/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cdstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author krysti
 */
public class CDStore {

    /**
     * Tutaj testujemy napisany kod
     */
    public static void main(String[] args) {
        //tworzymy obiekt klasy CD i ustawiamy
        //pole price
        CD o1 = new CD();
        o1.setPrice(39.90);
        
        AudioCD o2 = new AudioCD();
        o2.setTitle("boo");
        o2.setArtist("ktoś");
        
        AudioCD o3 = new AudioCD("piosnka", "muzyk", 25.5);
        
        AudioCD o4 = new AudioCD("muzyka", "artysta", 19);
        
        MovieCD o5 = new MovieCD("film", "reżyser", 39.90);

        GameCD o6 = new GameCD("gra", "PC", 59);
        
        List<CD> list = new ArrayList();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        list.add(o5);
        list.add(o6);
        
        Iterator<CD> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}