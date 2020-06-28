/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.EjemploSprrintBootBD;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cealmeba
 */

@RestController
@RequestMapping("/api")
public class controllerpersona {
    
    @Autowired
    private RepositoryPersona repoPersonas;
  //  @GetMapping(path ="/hello")
   // public String getHello(){
    //return "holamundo";
    //}
    
   @GetMapping(path="/personas/{id}")
    public MODELOPERSONA getPersonaById(@PathVariable String id){
        repoPersonas.findById(id);
        
        MODELOPERSONA p = new MODELOPERSONA();
        p.setClave("1");
        p.setNomobre("luis");
        p.setDireccion("casita");
        p.setTelefono("telcel");
        
         repoPersonas.save(p);
        
        MODELOPERSONA p2 = new MODELOPERSONA();
                
        
        p2.setClave("2");
        p2.setNomobre("cealeba");
        p2.setDireccion("casita2");
        p2.setTelefono("telcel2");
        
        repoPersonas.save(p2);
        if(id=="1"){
            return p;
        }else{
            return p2;
        }
    }
    
      @GetMapping(path ="/personas")
    public List<MODELOPERSONA>getTodaspersona(){
        List<MODELOPERSONA> persona= new ArrayList<>();
        MODELOPERSONA p = new MODELOPERSONA();
        p.setClave("1");
        p.setNomobre("luis");
        p.setDireccion("casita");
        p.setTelefono("telcel");
       
        
        MODELOPERSONA p2 = new MODELOPERSONA();
                
        
        p2.setClave("2");
        p2.setNomobre("cealeba");
        p2.setDireccion("casita2");
        p2.setTelefono("telcel2");
        
        persona.add(p);
        persona.add(p2);
        return  repoPersonas.findAll();
        
        
    }
    
    
}
