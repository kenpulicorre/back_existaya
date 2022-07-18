package com.pruevaParameta.service;

import com.pruevaParameta.models.Movie;
import com.pruevaParameta.reposito.MovieRepo;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepo MovieRepo;
    
    //------------metodo para GET-----------
    //      tipo arraylist<empleado>
    public ArrayList<Movie> obtenerMovie(){
         return (ArrayList<Movie>)MovieRepo.findAll();
    } 
    //------------metodo para GET por id-----------
    public Optional<Movie> listarMovieId(Integer id){
        try{Optional<Movie> e=MovieRepo.findById(id);
        return e;
        }catch(Exception e){
        return null;}
        }
    
       //------------metodo para POST-----------
    //public EmpleadoModel guardarEmpleado(empleadoModel empleado){
    public Movie guardarMovie(Movie movie ){
//      System.out.print((movie.getNombre()));
        Integer actualVoto = movie.getVoto();
        Integer actualVotoN = movie.getVotoN();

        Movie dd = MovieRepo.save(movie);
        //modificando
        Integer id_actual=dd.getIdmovie();
        
        Optional<Movie> movieIdResult = MovieRepo.findById(id_actual);
        //-----------------------------
        Integer voto_actua_total=movieIdResult.get().getVotos();
        Integer result=0;
        if(voto_actua_total==null){
            result=result+actualVoto;
            movieIdResult.get().setVotos(result);
//        dd.setVotos(result);
        }else{
            result=voto_actua_total+actualVoto;
            movieIdResult.get().setVotos(result);
        }
        //-----------------------------
        Integer voto_actua_totalN=movieIdResult.get().getVotosN();
        Integer resultN=0;
        if(voto_actua_totalN==null){
            resultN=resultN+actualVotoN;
            movieIdResult.get().setVotosN(resultN);
//        dd.setVotos(result);
        }else{
            resultN=voto_actua_totalN+actualVotoN;
            movieIdResult.get().setVotosN(resultN);
        }
        
        
        
        
        
        return MovieRepo.save(movie);
    }
    //------------metodo para UPDATE-----------
    //public EmpleadoModel guardarEmpleado(empleadoModel empleado){
    public Movie actualizarVoto(Movie movie ){
        Integer actualVoto = movie.getVoto();
        Integer actualVotoN = movie.getVotoN();

        Optional<Movie> movieIdResult = MovieRepo.findById(movie.getIdmovie());
        Optional<Movie> movieIdResult1 = MovieRepo.findById(movie.getIdmovie());

        System.out.print("\n---movieidresult\n"+movieIdResult.get().getIdmovie());
        System.out.print("\n---\n");
//        //-----------------------------
        Integer voto_actua_total=movieIdResult.get().getVotos();
        Integer voto_actua_totalN=movieIdResult.get().getVotosN();
        System.out.print("\n---voto_actua_total: "+voto_actua_total);
        Integer result;
        Integer resultN;

//        if(voto_actua_total==null){
//            result=result+actualVoto;
//            movieIdResult.get().setVotos(result);
////        dd.setVotos(result);
//        }else{
            result=voto_actua_total+actualVoto;
            resultN=voto_actua_totalN+actualVotoN;

            movie.setVotos(result);
            movie.setVotosN(resultN);

//            movieIdResult.get().setVotos(result);
//        }
        System.out.print("\n---result: "+result);
        System.out.print("\n---result: "+movie.getVotos());
        System.out.print("\n---resultn: "+movie.getVotosN());
        
        if(movie.getVotosN()<0 ||movie.getVotos()<0){
            return null;
        
        }else{
        return MovieRepo.save(movie);
        }


//        //-----------------------------

//          
//        return MovieRepo.save(movie);
                
    }

        //------------metodo para UPDATE-----------
    //public EmpleadoModel guardarEmpleado(empleadoModel empleado){
    public Movie reseteoVoto(Movie movie ){
        movie.setVotos(0);
        movie.setVotosN(0);

            

        return MovieRepo.save(movie);
        }


//        //-----------------------------

//          
//        return MovieRepo.save(movie);
                
    
   
    
}
