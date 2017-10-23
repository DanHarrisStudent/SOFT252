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
abstract class Lecturer extends UniPeople implements ITeach {
    protected String coursework;
    
    
    //set coursework the lecturer is teaching to string
    private String getCourseWork(){
        return this.coursework;
    }
    
    private void teach(String name, String course, String room){
        System.out.println(this.name + "is teaching " + this.course + "in room " + this.course.room);
    }
}
