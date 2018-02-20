/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author alice
 */
@Entity
public class RegularBranch extends Branch{

    @OneToMany(mappedBy = "branch")
    private List<GoodQuantity> goodQuantitys;
    
}
