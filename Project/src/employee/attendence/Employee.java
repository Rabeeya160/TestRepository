/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.attendence;

import java.util.Date;


/**
 *
 * @author Proud To Be Muslims
 */
public class Employee {

    private String EmpID;
    private String EmpNm;
    private String EmID;
    private String Designi;
    private Date DOB;
    private String City;
    private String Gender;

    ///////////////////End of Fields//////////////
    //////////////////////////Getters////////////////
    /**
     * Getter For EmployeeID
     *
     * @return String
     */
    public String getEmployeeID() {
        return EmpID;
    }

    /**
     * Getter For EmpName
     *
     * @return String
     */
    public String getEmpName() {
        return EmpNm;
    }

    public String getEmailID() {
        return EmID;
    }

    /**
     * Getter For Designation
     *
     * @return String
     */
    public String getDesignation() {
        return Designi;
    }

    /**
     * Getter For DOB
     *
     * @return String
     */
    public Date getDOB() {
        return DOB;
    }

    /**
     * Getter For City
     *
     * @return String
     */
    public String getCity() {
        return City;
    }

 
    public String getGender() {
        return Gender;
    }

    public boolean setGender(String gender) {
        Gender = gender;
        return true;
    }

  
    public boolean setCity(String city) {
        boolean flag=true;
        City = city;
        return flag;
    }

 

    public boolean setDesignation(String Design) {
        boolean flag = true;
        Designi = Design;
        return flag;
    }

    
    public boolean setEmailID(String mail) {
        boolean flag = true;
        EmID = mail;
        return flag;
    }

    
    public boolean setEmpName(String name) {
        //boolean flag = false;
        int r=name.length();
        for (int i = 0; i <r ; i++) {
            if ((name.charAt(i) >= 'a' & name.charAt(i) <= 'z') || name.charAt(i) >= 'A' & name.charAt(i) <= 'Z') {
                EmpNm = name;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    
    public boolean setEmployeeID(int num) {
        boolean flag = true;
            String id="EMP-"+num;
            EmpID = id;   
        return flag;

    }
}
