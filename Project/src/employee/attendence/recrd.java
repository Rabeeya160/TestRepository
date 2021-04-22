/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.attendence;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Proud To Be Muslims
 */
public class recrd {

    List<Attendence> list = new ArrayList<>();
    int num = list.size() + 1;

    /**
     *Method To add Employee
     * @param obj
     */
    public void addEmp(Attendence obj) {
        if (list.size() >=0) {
            obj.obj.setEmployeeID(num);
            list.add(obj);
            JOptionPane.showMessageDialog(null, "Succesfully Added " + num);
            num++;

        } else {
            boolean flag = true;
            for (int i = 0; i < list.size(); i++) {
                if (obj.obj.getEmailID().equals(list.get(i).obj.getEmailID())) {
                    JOptionPane.showMessageDialog(null, "Halt!Employee is Already Added");
                    flag = false;
                }
            }
            if (flag == true) {
                list.add(obj);
                JOptionPane.showMessageDialog(null, "Succesfully Added " + num);
                num++;

            }
        }
    }
    
  
   
   
}
