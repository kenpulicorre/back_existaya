package com.pruevaParameta.repositories;


import com.pruevaParameta.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.repository.CrudRepository;


// public class EmpleadoRepo { //se cambia por interface porque va  a implementar ciertos metodos, uy se llama o se extiende desde el crudRepository que es la clase donde se implementa la mayotria de metodos con los que se puede jugar a la hora de usar base de datos
@Repository //forma 1
//public interface EmpleadoRepo  extends CrudRepository<Empleado ,Integer>{//forma1

// forma2: el JpaRepository<Empleado ,String"es el tipo de la clave primaria y asi lo coloquemos String va porenrse como long o integer>
public interface EmpleadoRepo  extends JpaRepository<Empleado ,Integer>{ //forma2

  
}
