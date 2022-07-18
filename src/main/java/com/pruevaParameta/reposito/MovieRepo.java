package com.pruevaParameta.reposito;

import com.pruevaParameta.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie ,Integer>{
    
    
    
}
