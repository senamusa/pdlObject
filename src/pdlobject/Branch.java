/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author alice
 */
@Entity
public class Branch implements Serializable{

    @Id @GeneratedValue
    private long id;
    
    private String name;
    private Location location;
    private int area;

    public long getId() {
        return id;
    }
    public String getName(){return name;}
    public Location getLoc(){return location;}
    public int getArea() {return area;}
    
    public void setName(String name){this.name = name;}
    public void setLocation(Location loc){this.location = loc;}
    public void setArea(int area){this.area = area;}
    
}
