package com.pragnya.onlinebook.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheatreDto {
    private Integer theatreId;
    private String movieId;
    private String theatreName;
    private int totalSeat;
}
