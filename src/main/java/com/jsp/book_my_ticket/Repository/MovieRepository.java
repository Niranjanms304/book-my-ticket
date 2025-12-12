package com.jsp.book_my_ticket.Repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.Entity.Movie;



public interface MovieRepository extends JpaRepository<Movie, Long> {

	boolean existsByNameAndReleaseDate(String name, LocalDate releaseDate);

}