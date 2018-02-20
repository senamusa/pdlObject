/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author alice
 */
@Entity
public class Customer {
    @Id @GeneratedValue
    private long ID;
    
    private String name;
    private Location location;
    private String phone;
    private Date dob;
    public int getAge(){return 0;}
    
    public long getID(){return ID;}
    public String getName(){return name;}
    public Location getLoc(){return location;}
    public String getPhone(){return phone;}
    public Date getDOB(){return dob;}
    
    public void setName(String name) {this.name = name;}
    public void setLoc(Location loc) {
        this.location = loc;
    }
    public void setPhone(String phone){this.phone = phone;}
    public void setDOB(Date dob){this.dob = dob;}
}
