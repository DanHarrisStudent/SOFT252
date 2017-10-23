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
public abstract class UniPeople {
    
    protected Course course;
    protected int id;
    protected String name;
    
    
    //Course that the person is associated with
    private Course getCourse(){
        return this.course;
    }    
    //Unique person id
    private int getId(){
        return this.id;
    }    
    //Name of person
    private String getName(){
        return this.name;
    }
    
    //Creates Person
    public void Person(Course course, int id, String name){        
        this.course = course;
        this.id = id;
        this.name = name;        
    }
    
    
    
}
