package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public String addMovie(Movie movie){
        String ans = movieRepository.addMovie(movie);
        return ans;
    }
    public String addDirector(Director director){
        String ans = movieRepository.addDirector(director);
        return ans;
    }
    public  String addMovieDirectorPair(String movieName,String directorName){
        String ans = movieRepository.addMovieDirectorPair(movieName,directorName);
        return ans;
    }
    public Movie getMovieByName(String MovieName){
        Movie movie = movieRepository.getMovieByName(MovieName);
        return movie;
    }
    public Director getDirectorByName(String directorName){
        Director director = movieRepository.getDirectorByName(directorName);
        return director;
    }
    public List<String> getMovieByDirectorName(String directorName){
        List<String>list = movieRepository.getMOvieByDirectorName(directorName);
        return list;
    }
    public List<String >getAllMovie(){
        List<String>list = movieRepository.getAllMovies();
        return list;
    }
    public String deleteDirectorByName(String directorName){
        String ans = movieRepository.deleteDirectorByName(directorName);
        return ans;
    }


    public String deleteAllDirector() {
        String ans = movieRepository.deleteAllDirector();
        return ans;
    }
}
