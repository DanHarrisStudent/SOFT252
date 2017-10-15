/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;
import java.text.DecimalFormat;
/**
 *
 * @author Dan
 */
public class MyWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int m_kg = 10;
        double m_pounds = 0.0;
        
        m_pounds = m_kg * 2.2;
        
        System.out.println(m_kg + " kg " + " is " + m_pounds + " lbs ");
        
    }
    
}
