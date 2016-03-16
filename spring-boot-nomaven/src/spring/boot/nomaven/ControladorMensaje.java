/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author campitos
 */
@Controller
@RequestMapping("/")
public class ControladorMensaje {
    @Autowired ComportamientoMensaje miServicioMensaje;
    
    @CrossOrigin
    @RequestMapping(value="/mensaje", method=RequestMethod.GET, headers = {"Accept=application/json"})
    @ResponseBody String obtenerTodos()throws Exception{
       // DAOMensaje dao=new DAOMensaje();
        ObjectMapper maper=new ObjectMapper();
       // return maper.writeValueAsString(dao.buscarTodos());
        ArrayList<Mensaje> mensajes = miServicioMensaje.leerTodosLosMensajes();
       return maper.writeValueAsString(mensajes);
    }
    
     @CrossOrigin
     @RequestMapping(value="/mensaje/{titulo}/{cuerpo}", method=RequestMethod.POST, headers = {"Accept=text/html"})
     @ResponseBody String guardarMensaje(@PathVariable String titulo, @PathVariable String cuerpo)throws Exception{
         Mensaje m=new Mensaje();
         m.setTitulo(titulo);
         m.setCuerpo(cuerpo);
     
       miServicioMensaje.guardar(m);
       return "Mensaje guardado con exito";
         
     }
    
    
}
