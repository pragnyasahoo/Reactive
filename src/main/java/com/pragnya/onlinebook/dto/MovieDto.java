package com.pragnya.onlinebook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDto {
    private int movieId;
    private int cityId;
    private String movieName;
    private int TotalTheatre;
}
