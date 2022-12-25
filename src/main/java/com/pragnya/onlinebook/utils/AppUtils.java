package com.pragnya.onlinebook.utils;

import com.pragnya.onlinebook.dto.MovieDto;
import com.pragnya.onlinebook.entity.Movie;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static MovieDto entityToDto(Movie movie) {
        MovieDto movieDto = new MovieDto();
        BeanUtils.copyProperties(movie, movieDto);
        return movieDto;
    }

    public static Movie dtoToEntity(MovieDto movieDto) {
        Movie movie = new Movie();
        BeanUtils.copyProperties(movieDto, movie);
        return movie;
    }
}
