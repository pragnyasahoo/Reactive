package com.pragnya.onlinebook.service;

import com.pragnya.onlinebook.dto.TheatreDto;
import reactor.core.publisher.Mono;

public interface ITheatre {
    public Mono<TheatreDto> createTheatre(TheatreDto theatre);

    public Mono<TheatreDto> theatreById(Integer id);

    public Mono<Void> deleteTheatre(Integer id);

    public  Mono<TheatreDto> updateTheatre(TheatreDto theatre, Integer id);
}

