/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.util.ArrayList;
import javax.persistence.Id;
import org.springframework.stereotype.Repository;

/**
 *
 * @author T-101
 */
@Repository
public class MensajeMongo extends Mensaje{
   
   
@Id
private String idd;

    /**
     * @return the id
     */
    public String getIdd() {
        return idd;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.idd = id;
    }

    

   

}

/*public class MensajeMongo extends Mensaje implements ComportamientoMensaje {

    @Override
    public ArrayList<Mensaje> leerTodosLosMensajes() {
        Mensaje m1=new Mensaje();
        m1.setTitulo("Primer mensaje serializado");
        m1.setCuerpo("Cuerpo del primer serializado");
        
        Mensaje m2=new Mensaje();
        m2.setTitulo("Segundo mensaje serializado");
        m2.setCuerpo("Segundo cuerpo del primer serializado");
        
        ArrayList<Mensaje> mensajes=new ArrayList<Mensaje>();
        mensajes.add(m1);
        mensajes.add(m2);
        return mensajes;
        
        
    }
    
}
*/
