package com.pragnya.onlinebook.repository;

import com.pragnya.onlinebook.dto.TheatreDto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterRepository extends ReactiveCrudRepository<TheatreDto, Integer> {

}
