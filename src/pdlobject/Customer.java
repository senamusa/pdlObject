/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;



/**
 *
 * @author alice
 */
@Entity
public class Customer implements Serializable{

    @OneToMany(mappedBy = "owner")
    private List<Card> cards;
    @Id
    private long ID;
    
    private String name;
    private Location location;
    private String phone;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;
    @ManyToOne
    private Branch registered_branch;

    public Branch getRegistered_branch() {
        return registered_branch;
    }

    public void setRegistered_branch(Branch registered_branch) {
        this.registered_branch = registered_branch;
    }
    public int getAge(){return 0;}

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    
}
