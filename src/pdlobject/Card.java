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
public class Card implements Serializable{
	@Id @GeneratedValue
    private long card_num;
	
    private String type;
    private String bank;
    private Date last_transaction_date;
    private Long total_amount_of_transaction;
    private Date Expiry;

    public long getCard_num() {
        return card_num;
    }

    public void setCard_num(long card_num) {
        this.card_num = card_num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Date getLast_transaction_date() {
        return last_transaction_date;
    }

    public void setLast_transaction_date(Date last_transaction_date) {
        this.last_transaction_date = last_transaction_date;
    }

    public Long getTotal_amount_of_transaction() {
        return total_amount_of_transaction;
    }

    public void setTotal_amount_of_transaction(Long total_amount_of_transaction) {
        this.total_amount_of_transaction = total_amount_of_transaction;
    }

    public Date getExpiry() {
        return Expiry;
    }

    public void setExpiry(Date Expiry) {
        this.Expiry = Expiry;
    }
    
    
    
}
