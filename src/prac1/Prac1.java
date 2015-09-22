/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prac1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Prac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Person p1;
        
        Date date;
        date = new Date(95, 5, 28);
        
        p1 = new Person("Pepe", "Gato", date);
        
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday());
        System.out.println(p1.getAge());
        
        System.out.println("END");
    }
}
