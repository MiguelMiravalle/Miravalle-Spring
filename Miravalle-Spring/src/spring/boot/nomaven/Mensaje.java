/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package spring.boot.nomaven;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author t-101
 */
@Entity
@Table(name="MENSAJE")
public class Mensaje implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="id_mensaje ")        
    private Integer id;
    
    @Column(name="titulo")
    private String titulo;
    
    @Column(name="cuerpo")
    private String cuerpo;

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + '}';
    }

    public Mensaje(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }

    public Mensaje(Integer id) {
        this.id = id;
    }

    public Mensaje() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    void add(ArrayList<Mensaje> men) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
