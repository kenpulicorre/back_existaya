
package com.pruevaParameta.controller;

import com.pruevaParameta.models.Movie;
import com.pruevaParameta.service.MovieService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController 
@RequestMapping ("/movie") 
public class MovieController {
    @Autowired
    private MovieService   movieservice;
    
//---para GET  tipo Listempleado
    @GetMapping
    public List<Movie> listarEmpleados(){
//    return empleadoservice.listarEmpleados(); //cualquiera de estos dos metodos sirve
    return movieservice.obtenerMovie();
 
    }
//---para GET  por id
    @GetMapping("/{id}")
    public Optional<Movie> listarEmpleadosId(@PathVariable("id") Integer id ){
        if(movieservice.listarMovieId(id)!=null){
            return movieservice.listarMovieId(id);
        }else{
            return null;
        }
    }
//---para POST
 
    @PostMapping 
    public Movie guardarMovie(@RequestBody Movie moviex ){
    return movieservice.guardarMovie(moviex);
    }
//---para PUT 
    @PutMapping
    public Movie actualizarVoto(@RequestBody Movie moviex ){
    return movieservice.actualizarVoto(moviex);
    }
    //---para PUT 
    @PutMapping("/reset")
    public Movie reseteoVoto(@RequestBody Movie moviex ){
    return movieservice.reseteoVoto(moviex);
    }
    
}
