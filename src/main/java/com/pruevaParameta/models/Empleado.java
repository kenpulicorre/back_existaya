package com.pruevaParameta.models;

import com.sun.istack.NotNull;
import java.lang.reflect.Array;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.json.JSONObject;

@Entity
@Table (name="empleado")

public class Empleado {
    @Column (name="codigoid", unique=true ,length=13)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer codigo;
    @Column(nullable = false) // JPA specification , para  @NotNull se reuqiere BeanValidation
    private String nombres;
    @Column(nullable = false )
    private String apellidos;
    @Column(nullable = false )
    private String tipoDocu;
    @Column(nullable = false ,unique=true )    
    private String numeroDocu;
    @Column(nullable = false )
    private Date nacimiento;
    @Column(nullable = false )
    private Date vinculacion;
    @Column(nullable = false )
    private String cargo;
    @Column(nullable = false )
    private Double salario;
    private String edad_empleado;   
    private String tiempoVinculacion;
    
  



    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDocu() {
        return tipoDocu;
    }

    public void setTipoDocu(String tipoDocu) {
        this.tipoDocu = tipoDocu;
    }

    public String getNumeroDocu() {
        return numeroDocu;
    }

    public void setNumeroDocu(String numeroDocu) {
        this.numeroDocu = numeroDocu;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getVinculacion() {
        return vinculacion;
    }

    public void setVinculacion(Date vinculacion) {
        this.vinculacion = vinculacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEdad_empleado() {
        return edad_empleado;
    }

    public void setEdad_empleado(String edad_empleado) {
        this.edad_empleado = edad_empleado;
    }

    public String getTiempoVinculacion() {
        return tiempoVinculacion;
    }

    public void setTiempoVinculacion(String tiempoVinculacion) {
        this.tiempoVinculacion = tiempoVinculacion;
    }

    
    
    
  
    
}
