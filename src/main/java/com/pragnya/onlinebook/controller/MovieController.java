package com.pragnya.onlinebook.controller;

import com.pragnya.onlinebook.dto.MovieDto;
import com.pragnya.onlinebook.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieServiceImpl movieService;

    @GetMapping("/{id}")
    public Mono<MovieDto> movieById(@PathVariable("id") String Id) {
        Integer id = Integer.parseInt(Id);
        return movieService.movieById(id)
                .switchIfEmpty(Mono.error(new Exception("id is null")));

    }

    @GetMapping()
    @ResponseStatus(value = HttpStatus.OK)
    public Flux<MovieDto> AllMovieList() {
        return movieService.AllMovieList();
    }

    @PostMapping()
    public Mono<MovieDto> saveMovie(@RequestBody Mono<MovieDto> movieDtoMono) {
        return movieService.saveMovie(movieDtoMono);
    }

    @PutMapping("/{id}")
    public Mono<MovieDto> updateMovie(@RequestBody Mono<MovieDto> movieDtoMono, @PathVariable String Id) {
        Integer id = Integer.parseInt(Id);
        return movieService.updateMovie(movieDtoMono, id);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(String Id) {
        Integer id = Integer.parseInt(Id);
        movieService.deleteMovie(id);
    }
}
