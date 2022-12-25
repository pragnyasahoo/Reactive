package com.pragnya.onlinebook.service;

import com.pragnya.onlinebook.dto.MovieDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IMovie {
    public Mono<MovieDto> saveMovie(Mono<MovieDto> movie);

    public Mono<MovieDto> movieById(int id);

    public Mono<Void> deleteMovie(int id);

    public  Mono<MovieDto> updateMovie(Mono<MovieDto> movie, int id);


    public Flux<MovieDto> AllMovieList();
}

