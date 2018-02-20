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
public class Order {
    @Id @GeneratedValue
    private long no_order;
    private Date order_date;
    private Customer customer;
    private Employee employee;
    private Card card;
    private Good[] goods;

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
