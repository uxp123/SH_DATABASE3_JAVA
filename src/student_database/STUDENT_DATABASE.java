/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_database;

import com.student.entities.StudentsData;

/**
 *
 * @author philipfynn
 */
public class STUDENT_DATABASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mycontroller students = new Mycontroller();
        
        StudentsData data = new StudentsData();
        StudentsData data2 = new StudentsData();
        
        data.setName("Philip Fynn");
        data.setAddress("Accra, Airpot Hills");
        data.setEmail("philip@gmail.com");
        
        data2.setName("Papa Fynn");
        data2.setAddress("Accra, Airpot Hills");
        data2.setEmail("papap@gmail.com"); 
        
        
        
        
        
          students.persist(data2);
        //students.persist(data);
    }
    
}
