
package com.pruevaParameta.service;

import com.pruevaParameta.models.Empleado;
import com.pruevaParameta.repositories.EmpleadoRepo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.JSONObject;
@Service
public class EmpleadoService {
    
    @Autowired  //lo qie hace es poder llamar repositorie y modelos y todo y poder unir aqui en este coigo a lo que sea
    private EmpleadoRepo EmpleadoRepo;
    //public ArrayList<EmpleadoModel>
    
    
       //------------metodo para GET-----------
    //      tipo arraylist<empleado>
    public ArrayList<Empleado> obtenerEmpleados(){
        
//        return (ArrayList<EmpleadoModel>)EmpleadoRepo.findAll();
        
         return (ArrayList<Empleado>)EmpleadoRepo.findAll();
        
        
    }
    //------------metodo para POST-----------
    //      tipo empleado
    //public EmpleadoModel guardarEmpleado(empleadoModel empleado){
    public Empleado guardarEmpleado(Empleado empleado ){
         System.out.print((empleado.getNombres()));
         Date dateNacimiento= empleado.getNacimiento();
         Date dateVinculacion= empleado.getVinculacion();
         
         LocalDate localDate2 = LocalDate.now();
         Date input =dateNacimiento;
         LocalDate datelocalhoy = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         Period periodo=Period.between(localDate2,datelocalhoy);
         String xx="años:" +(periodo.getYears()*-1) +"," +" meses:" +(periodo.getMonths()*-1)+ "," + " dias:"+(periodo.getDays()*-1)  ;
         
         Date input2 =dateVinculacion;
         LocalDate dateVinculo = input2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
         Period periodo2=Period.between(localDate2,dateVinculo);
         String xx2="años:" +(periodo2.getYears()*-1) +"," +" meses:" +(periodo2.getMonths() *-1) ;
         
         
          
  
              if ((periodo.getYears()*-1)>18){
                  empleado.setEdad_empleado(xx);
                  empleado.setTiempoVinculacion(xx2);
                  return EmpleadoRepo.save(empleado);
//        empleado.setTiempoVinculacion(xx2);
              }else{
                  System.out.print(" Es menor de edad no puede ingresar");
                  return null;
              }
            
        
      
          
          
         

        
        
        
        
    }
    //------------metodo para UPDATE-----------
    //public EmpleadoModel guardarEmpleado(empleadoModel empleado){
    public Empleado actualizarEmpleado(Empleado empleado ){
      

        
        return EmpleadoRepo.save(empleado);
        
        
    }
    //------------metodo para GET list-----------
    //public EmpleadoModel guardarEmpleado(empleadoModel empleado){
    public List<Empleado> listarEmpleados(){

        return EmpleadoRepo.findAll();
        
        
    }
    //------------metodo para GET por id-----------
        public Optional<Empleado> listarEmpleadosId(Integer id){
//        Optional<Empleado> e=EmpleadoRepo.findById(id);
//         return e;
        try{Optional<Empleado> e=EmpleadoRepo.findById(id);
        return e;
            
        }catch(Exception e){
        return null;}
     //        JSONObject item = new JSONObject();
//        item.put("nombre", xx);
//        item.put("directorio","undirectorio-imaginario");
// En javascript, esto equivale a 
// {nombre:"filename.java",directorio:"undirectorio-imaginario"}
    
    }
    //------------metodo para DELETE es con void pues no retorna nada-----------
    //public EmpleadoModel guardarEmpleado(empleadoModel empleado){
    public void eliminarEmpleado(Empleado empleado){
        System.out.print("valor empleado a borrar \n"+(empleado));
        EmpleadoRepo.delete(empleado);
    
    }
    //------------metodo para DELETE id es con void pues no retorna nada-----------
    //public EmpleadoModel guardarEmpleado(empleadoModel empleado){
    public boolean eliminarEmpleadoId(Integer id){
        try{Optional<Empleado> e=EmpleadoRepo.findById(id);
        EmpleadoRepo.delete(e.get());
        return true;
            
        }catch(Exception e){
        return false;}
        //EmpleadoRepo.delete(empleado);
    
    }
    
            
    
}
