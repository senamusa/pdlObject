/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import java.io.Serializable;
import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.persistence.*;

/**
 *
 * @author Hafizh Dary <hafizhdary@gmail.com>
 */
@Entity
public class Employee implements Serializable{

    @OneToMany(mappedBy = "consultant")
    private List<ExecutiveCustomer> executiveCustomers;
	@Id @GeneratedValue
	private int id;
	
	private String name;
	private Location location;
	private List<String> phone;
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date startDate;
	private long salary;
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date birthDate;
        @ManyToOne
        private Branch branch;

    public List<ExecutiveCustomer> getExecutiveCustomers() {
        return executiveCustomers;
    }

    public void setExecutiveCustomers(List<ExecutiveCustomer> executiveCustomers) {
        this.executiveCustomers = executiveCustomers;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
	public int getAge() {
		Calendar a = Calendar.getInstance();
		a.setTime(startDate);
		Calendar b = Calendar.getInstance();
		int diff = b.get(YEAR) - a.get(YEAR);
		if (a.get(MONTH) > b.get(MONTH) || 
		    (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
		    diff--;
		}
		return diff;
	}

	public int getId() {
		return id;
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

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
