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
public class GoodQuantity implements Serializable{
   @Id@ManyToOne
    private Good good;
    private int quantity;
   @Id@ManyToOne
  private RegularBranch branch;

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(RegularBranch branch) {
        this.branch = branch;
    }
    
    
}
