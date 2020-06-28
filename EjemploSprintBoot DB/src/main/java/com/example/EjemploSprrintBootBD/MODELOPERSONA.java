/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.EjemploSprrintBootBD;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cealmeba
 */
@Entity
@Table(name ="personas")
public class MODELOPERSONA {
    @Id
    @Column(name = "clave")
    private String clave;
    @Column(name ="nombre")
    private String nomobre;
    @Column(name ="direccion")
    private String direccion;
    @Column(name ="telefono")
    private String telefono;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNomobre() {
        return nomobre;
    }

    public void setNomobre(String nomobre) {
        this.nomobre = nomobre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
