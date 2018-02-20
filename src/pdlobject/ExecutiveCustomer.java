/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author alice
 */
@Entity
public class ExecutiveCustomer extends Customer {
    @ManyToOne
    private Employee consultant;
    private int discount;

    public Employee getConsultant() {
        return consultant;
    }

    public void setConsultant(Employee consultant) {
        this.consultant = consultant;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    
}
