package com.pragnya.onlinebook.service;


import com.pragnya.onlinebook.dto.MovieDto;
import com.pragnya.onlinebook.repository.MovieRepository;
import com.pragnya.onlinebook.utils.AppUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class MovieServiceImpl implements IMovie {

    private static Logger LOGGER = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Mono<MovieDto> saveMovie(Mono<MovieDto> movieDtoMono) {
        return  movieDtoMono.map(AppUtils::dtoToEntity)
                .flatMap(movieRepository::save)
                .map(AppUtils::entityToDto);
    }

    @Override
    public Mono<MovieDto> movieById(int id) {
        return movieRepository.findById(id)
                .map(AppUtils::entityToDto);
    }
    @Override
    public Flux<MovieDto> AllMovieList() {
        return movieRepository.findAll()
                .map(AppUtils::entityToDto);
    }


    @Override
    public Mono<MovieDto> updateMovie(Mono<MovieDto> movieDto, int id) {
        return movieRepository.findById(id)
                .switchIfEmpty(Mono.error(new Exception("Task id not there")))
                .flatMap(p->movieDto.map(AppUtils::dtoToEntity)
                 .doOnNext(e->e.setMovieId(id)))
                .flatMap(movieRepository::save).map(AppUtils::entityToDto);
    }

    @Override
    public Mono<Void> deleteMovie(int id) {
        return  movieRepository.deleteById(id);
    }

}
