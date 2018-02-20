/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author alice
 */
@Entity
public class CustOrder implements Serializable{
    @Id @GeneratedValue
    private long no_order;
    @Id @ManyToOne
    private Branch branch;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date order_date;

    
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Card card;
    private Good[] goods;

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
    
    public long getNo_order() {
        return no_order;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Good[] getGoods() {
        return goods;
    }

    public void setGoods(Good[] goods) {
        this.goods = goods;
    }
}
