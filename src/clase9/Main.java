/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**
 *
 * @author Estudiante
 */
public class Main {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A a = new A(5);
        a.yy();
        
        B b = new B(4,7);
        b.yy();
        
        A c =new B(1,2);
        c.yy();
    }
    
}
