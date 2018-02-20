/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import javax.persistence.*;

/**
 *
 * @author alice
 */
@Entity
public class Branch {
    @Id @GeneratedValue
    private long id;
    
    private String name;
    private Location location;
    private int area;
    
    public String getName(){return name;}
    public Location getLoc(){return location;}
}
