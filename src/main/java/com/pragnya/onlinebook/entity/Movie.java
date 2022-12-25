package com.pragnya.onlinebook.entity;

import ch.qos.logback.classic.db.names.ColumnName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movieId")
    private int  movieId;
    @Column(name = "cityId")
    private int cityId;
    @Column(name = "movieName")
    private String movieName;
    @Column(name = "TotalTheatre")
    private  int TotalTheatre;
}
