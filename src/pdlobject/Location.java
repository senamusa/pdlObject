/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

/**
 *
 * @author alice
 */
public class Location {
    private String address;
    private String city;
    private String province;
    private String postal_code;
    
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getProvince() { return province; }
    public String getPostalCode() { return postal_code; }
    
    public void setAddress(String address) {this.address=address;}
    public void setCity(String city) {this.city=city;}
    public void setProvince(String province) {this.province=province;}
    public void setPostalCode(String postal_code) {this.postal_code=postal_code;}
    
    
}
