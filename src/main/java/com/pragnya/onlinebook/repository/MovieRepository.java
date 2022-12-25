package com.pragnya.onlinebook.repository;

import com.pragnya.onlinebook.entity.Movie;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends ReactiveCrudRepository<Movie, Integer> {
}