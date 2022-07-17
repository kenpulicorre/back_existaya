
package com.pruevaParameta.controller;

import com.pruevaParameta.models.Empleado;
import com.pruevaParameta.service.EmpleadoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController //los estandares me diccen que se debe definir asi 
@RequestMapping ("/empleados")  //aqui se definen los endpoints
public class EmpleadoController {
    @Autowired //aqui lo que llamaria seria el servicio /EmpleadoServicio
    private EmpleadoService   empleadoservice;// "empleadoservice" puede ser el nombre deseado aunque por estandar se deja igual
    //para GET  tipo Listempleado
    @GetMapping
    public List<Empleado> listarEmpleados(){
//    return empleadoservice.listarEmpleados(); //cualquiera de estos dos metodos sirve
    return empleadoservice.obtenerEmpleados();
 
    }
    
    //..................
    @GetMapping("/{id}")
    public Optional<Empleado> listarEmpleadosId(@PathVariable("id") Integer id ){
     
        
        if(empleadoservice.listarEmpleadosId(id)!=null){
            return empleadoservice.listarEmpleadosId(id);
        }else{
            return null;
        }
         
     
    
   
    
    }
    //...................
    
    
    
    
    //para post  tipo empleado
     @PostMapping 
    public Empleado guardarEmpleado(@RequestBody Empleado empleadox ){
        
    return empleadoservice.guardarEmpleado(empleadox);
    
    
    }
     //para put  tipo empleado
     @PutMapping
    public Empleado actualizarEmpleado(@RequestBody Empleado empleadox ){
        
    return empleadoservice.actualizarEmpleado(empleadox);
    
    
    }
    //para delete  no necesita el tipo 
     @DeleteMapping
    public void eliminarEmpleado(@RequestBody Empleado empleadox ){
        
   empleadoservice.eliminarEmpleado(empleadox);
    
    }
    //para delete por id  no necesita el tipo 
     @DeleteMapping("/{id}")
    public String eliminarEmpleadoId(@PathVariable("id") Integer id ){
     if(empleadoservice.eliminarEmpleadoId(id)){
         return "se elimino empleado";
     }else{
         return "No se pudo eliminar o no se encontro empleado";
     }
   
    
    }
}
