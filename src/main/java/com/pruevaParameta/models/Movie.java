
package com.pruevaParameta.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="movie")
public class Movie {
    @Column (name="movieid", unique=true ,length=13)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer idmovie;
    
    
    
    @Column(nullable = false , unique=true)
    private String nombre;
    private Integer votos;
    private Integer votosN;
    private String superhero;
    private String publisher;
    private String alter_ego;
    private String first_appearance;
    private String characters;
     
    @Column ( length=1 )
    private Integer voto;
    @Column ( length=1 )
    private Integer votoN;

    
    
    
    public Integer getIdmovie() {
        return idmovie;
    }

    public void setIdmovie(Integer idmovie) {
        this.idmovie = idmovie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }

    public Integer getVotosN() {
        return votosN;
    }

    public void setVotosN(Integer votosN) {
        this.votosN = votosN;
    }

    public Integer getVotoN() {
        return votoN;
    }

    public void setVotoN(Integer votoN) {
        this.votoN = votoN;
    }

    public String getSuperhero() {
        return superhero;
    }

    public void setSuperhero(String superhero) {
        this.superhero = superhero;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAlter_ego() {
        return alter_ego;
    }

    public void setAlter_ego(String alter_ego) {
        this.alter_ego = alter_ego;
    }

    public String getFirst_appearance() {
        return first_appearance;
    }

    public void setFirst_appearance(String first_appearance) {
        this.first_appearance = first_appearance;
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    
    
    
}
