/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T-101
 */
@Controller
@RequestMapping("/")
public class ControladorPatos {
    @Autowired ComportamientoCuac servicio; //Tipo de retorno del metodo 
    @RequestMapping(value="/pato", method=RequestMethod.GET, headers = {"Accept=text/htm"})
    @ResponseBody String misPatos(){
    servicio.hacerCuac();
    //return "Probando patos de todo tipo";
    return servicio.hacerCuac();
    
    
    /*@Autowired ComportamientoCuac servicio;
    @RequestMapping(value="/pato", method=RequestMethod.GET,headers = {"Accept=text/htm"})
    @ResponseBody String misPatos(){
    return servicio.hacerCuac();*/
    
    }
    
}
