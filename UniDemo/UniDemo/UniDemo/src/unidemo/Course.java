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
public class Course {
    protected String code;
    protected Lecturer teacher;
    protected String coursework;
    protected String room;
    protected String course;
    
    
    //String denoting the course code
    private String getCode(){
        return this.code;
    }
    //Object of type Lecturer
    private Lecturer getTeacher(){
        return this.teacher;
    }
    //String indicating type of coursework
 
    private String getCourseWork(){
        return this.coursework;
    }
    
    //String indicating the room the course is in
    private String getRoom(){
        return this.room;
    }   
    
    private String setCourse(Course course){
        return this.course;
    }
    
}


