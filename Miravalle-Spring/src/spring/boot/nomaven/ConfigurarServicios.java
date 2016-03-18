/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.boot.nomaven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author T-101
 */
@Configuration
public class ConfigurarServicios {
    @Bean // Caulquier objeto en java  con tipo de retorno que sea un objeto, o en este caso una interfaz 
    public ComportamientoCuac miServicio(){
        return new PatoRobot();
    }
    //faceboock, mysql, mongodb
    @Bean 
    public ComportamientoMensaje miServicioMensaje(){
        return new MensajeMysql();
    }
    
    
}
