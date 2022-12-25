
 Drop TAble if exists Movie;

 Create table MOVIE(
 movieId int IDENTITY TRUE,
 cityId int,
 movieName VArchar(230),
 TotalTheatre int(22)

 );

 INSERT INTO Movie (movieId, cityId,movieName,TotalTheatre) VALUES (1, 1,'USA',10);
 INSERT INTO Movie (movieId, cityId,movieName,TotalTheatre) VALUES (2, 1,'France',10);
 INSERT INTO Movie (movieId, cityId,movieName,TotalTheatre) VALUES (3, 1,'Brazil',10);
 INSERT INTO Movie (movieId, cityId,movieName,TotalTheatre) VALUES (4, 1,'Italy',10);
DROP TABLE movie;
CREATE TABLE movie (
  movie_id INT NOT NULL,
   city_id INT NOT NULL,
   movie_name VARCHAR(255),
   total_theatre INT NOT NULL,
   CONSTRAINT pk_movie PRIMARY KEY (movie_id)
);
INSERT
INTO
  movie
  (movieId, cityId, movieName, TotalTheatre)
VALUES
  (1, 1, 'hiiii', 222);
CREATE TABLE movie (
  movie_id INT NOT NULL,
   city_id INT NOT NULL,
   movie_name VARCHAR(255),
   total_theatre INT NOT NULL,
   CONSTRAINT pk_movie PRIMARY KEY (movie_id)
);
ALTER TABLE movie ADD movieId NULL;


ALTER TABLE movie ADD cityId NULL;


ALTER TABLE movie ADD movieName NULL;


ALTER TABLE movie ADD TotalTheatre NULL;