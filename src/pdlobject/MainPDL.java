/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdlobject;

import javax.persistence.*;

/**
 *
 * @author alice
 */
public class MainPDL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("$objectdb/db/pdl.odb");
        EntityManager em = emf.createEntityManager();
        
    }
    
}
