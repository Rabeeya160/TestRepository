/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.attendence;
import java.sql.Timestamp;
/**
 *
 * @author Proud To Be Muslims
 */
public class Attendence {
    
    ///////////////////Fields/////////////
    Employee obj=new Employee();
    private Timestamp date;
    private String status;
    
    ///////////end of fields/////////////
    public void setstatus(String s)
    {
        status=s;
    }
    
    public void setTimestamp(Timestamp s)
    {
        date=s;
    }
    
    
    
     public String gettstatus()
    {
        return status;
    }
    
    public Timestamp getTimestamp()
    {
        return date;
    }
    
}
