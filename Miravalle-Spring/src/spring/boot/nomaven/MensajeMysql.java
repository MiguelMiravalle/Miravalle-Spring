/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T-101
 */

public class MensajeMysql extends Mensaje implements ComportamientoMensaje{

    @Override
    public ArrayList<Mensaje> leerTodosLosMensajes(){
    DAOMensaje dao=new DAOMensaje();
    ArrayList<Mensaje> mensajes=new ArrayList<Mensaje>();
    try { mensajes=dao.buscarTodos();}
    catch (Exception ex) 
    { System.out.println(ex.getMessage());}
    return mensajes ;
          
    }
    
    public SessionFactory sessionFactory;
    public Session session;
    public Transaction transaction;

    public MensajeMysql() {
    sessionFactory = HibernateUtilidades.getSessionFactory();
    session = sessionFactory.openSession();
    transaction = session.beginTransaction();
    }
    public void cierra(){
    transaction.commit();
    session.close();
    }

    @Override
    public void guardar(Mensaje m) {
    DAOMensaje dao = new DAOMensaje();
    try { dao.guardar(m); } 
    catch (Exception ex) 
    { Logger.getLogger(MensajeMysql.class.getName()).log(Level.SEVERE, null, ex); }
    session.save(m);
    cierra();
    }
    
}
//public class MensajeMysql extends Mensaje implements ComportamientoMensaje{

   /* @Override
    public ArrayList<Mensaje> leerTodosLosMensajes() {
        //DAOMensaje dao=new DAOMensaje
        //
    }*/
    
    //@Override
   // public void guardar(Mensaje m){
       // session.save(m);
       // cerrarTodo();
   // }
//}
