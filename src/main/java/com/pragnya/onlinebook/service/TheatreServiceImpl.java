package com.pragnya.onlinebook.service;


import com.pragnya.onlinebook.dto.TheatreDto;
import com.pragnya.onlinebook.repository.TheaterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TheatreServiceImpl implements ITheatre {

    private static Logger LOGGER = LoggerFactory.getLogger(TheatreServiceImpl.class);

    @Autowired
    TheaterRepository theaterRepository;

    @Override
    public Mono<TheatreDto> createTheatre(TheatreDto theatre) {
        return theaterRepository.save(theatre);
    }
    @Override
    public Mono<TheatreDto> theatreById(Integer id) {
        return theaterRepository.findById(id);
    }

    @Override
    public Mono<Void> deleteTheatre(Integer id) {
        return theaterRepository.deleteById(id);
    }

    @Override
    public Mono<TheatreDto> updateTheatre(TheatreDto theatre, Integer id) {
        return theaterRepository.findById(id)
                .switchIfEmpty(Mono.error(new Exception("Task id not there")))
                .map(b ->
                { 
                    theatre.setTheatreId(id);
                    if (theatre.getTheatreName() != null)
                        theatre.setTheatreName(theatre.getTheatreName());
                    return theatre;
                })
                .flatMap(theaterRepository::save);
    }

}
