/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Miravalle-Spring
 */
public class MensajeSerializado extends Mensaje implements ComportamientoMensaje {

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
    
     public void guardarCliente(Mensaje mensaje) throws Exception{
        ArrayList<Mensaje> men= new ArrayList();
        File file = new File("Mensajes");
        try{
         if(file.exists()) men = leerTodosLosMensajes();
         FileOutputStream fo = new FileOutputStream(file);
         ObjectOutputStream oo = new ObjectOutputStream(fo);
         mensaje.add(men);
         oo.writeObject(men);
        System.out.println("Guardado con Exito");
        }
        catch(Exception e)
        {
            System.out.println("Error, verificar nuevamente");
        }
    }
    
    @Override
    public void guardar(Mensaje m) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
