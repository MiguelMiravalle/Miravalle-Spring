/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import java.util.ArrayList;
import java.util.List;
import jdk.internal.org.objectweb.asm.commons.TryCatchBlockSorter;

/**
 *
 * @author Miravalle-Spring
 */
public interface ComportamientoMensaje {
    
  ArrayList<Mensaje>  leerTodosLosMensajes();
  public void guardar(Mensaje m);
}
  //ArrayList<Mensaje>  leerTodosLosMensajes();
  //public void guardar(Mensaje m);
  //DAOMensaje dao=new DAOMensaje();
  // try{
  //dao.guardar(m);
  // }catch (Exception ex){
  // Logger.getLogger(MensajeMysql.class.getName()).log(Level.)
  //Burscar por id borrar por id y actualizar por id
 
    


