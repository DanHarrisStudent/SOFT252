/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author Dan
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double m_cm = 10;
        double m_feet = 0;
        double m_inches = 0;
        
        m_inches = m_cm / 2.54;
        
        m_feet = m_inches / 12;
        
        System.out.println(m_cm);
        System.out.println(m_inches);
        System.out.println(m_feet);

    }
    
}
