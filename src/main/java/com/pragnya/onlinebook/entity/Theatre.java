package com.pragnya.onlinebook.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Theatre")
public class Theatre {
    @Id
    private Integer theatreId;
    private String movieId;
    private String theatreName;
    private int totalSeat;
}
