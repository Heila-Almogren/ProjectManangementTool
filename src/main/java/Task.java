/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heila
 */
public class Task {
    String title;
    String Start_Date;
    int Duration;
    String Assigned_Resources;
    int Cost;
    
    
    public Task(String title, String Start_Date, int Duration, String Assigned_Resources, int Cost){
        this.title = title;
        this.Start_Date = Start_Date;
        this.Duration = Duration;
        this.Assigned_Resources = Assigned_Resources;
        this.Cost = Cost;
    }
}
