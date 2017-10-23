/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author dharris4
 */
public class Student extends UniPeople {
    
    private void attendClass(String name, String course, String room){
        System.out.println(this.name + "is attending " + this.course + "in room" + this.course.room);
        
    }
    private void doCourseWork(String name, String coursework){
        if(this.course.coursework != null){
            System.out.println(this.name + "is doing coursework " 
                    + this.course.coursework);

        }
    }
}
