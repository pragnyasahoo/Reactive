package com.pragnya.onlinebook.controller;

import com.pragnya.onlinebook.dto.TheatreDto;
import com.pragnya.onlinebook.service.TheatreServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class TheaterController {

    @Autowired
    TheatreServiceImpl theatreService;

    @GetMapping("/theatre/{id}")
    public ResponseEntity<Mono<TheatreDto>> theatreById(@PathVariable("id") String Id) {
        Mono<TheatreDto> task = theatreService.theatreById(Integer.parseInt(Id))
                .switchIfEmpty(Mono.error(new Exception("id is null")));
        return new ResponseEntity<Mono<TheatreDto>>(task, task != null ?
                HttpStatus.OK : HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/theatre")
    public void create(@RequestBody TheatreDto theatre) {
        theatreService.createTheatre(theatre).subscribe();
    }

}
