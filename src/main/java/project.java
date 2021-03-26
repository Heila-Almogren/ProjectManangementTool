/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heila
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.Serializable;
    import java.util.ArrayList;
    import java.util.List;

public class project implements Serializable {
    
    
    
    public String name;
    public String description;
    public String goals;
    public ArrayList<Task> tasks = new ArrayList<Task>();
    
    public project(String name, String description, String goals){
        
        this.name = name;
        this.description = description;
        this.goals = goals;
//        tasks.add("one");
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    
    public String getGoals(){
        return this.goals;
    }
    
    public void add_task(Task t){
        tasks.add(t);
        generate_file();
    }
    
    public boolean generate_file(){
        
        try {
            
            FileOutputStream file = new FileOutputStream(this.name.toString()+".proj");

            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writes objects to the output stream
            output.writeObject(this);

            
 
        } catch (Exception ex) {
            return false;
        }
        
        
        return true;
    }

    
}
