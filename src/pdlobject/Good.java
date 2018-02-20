/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author alice
 */
@Entity
public class Good implements Serializable{
    @Id @GeneratedValue
    private long ID;
    private String description;
    private String color;
    private String good_size;
    private String type;
    private int quantity;
    
    private Good[] component;

    public long getID() {
        return ID;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return good_size;
    }

    public void setSize(String size) {
        this.good_size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Good[] getComponent() {
        return component;
    }

    public void setComponent(Good[] component) {
        this.component = component;
    }
    
}
