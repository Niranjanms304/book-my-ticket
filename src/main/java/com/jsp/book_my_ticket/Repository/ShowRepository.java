package com.jsp.book_my_ticket.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.Entity.Screen;
import com.jsp.book_my_ticket.Entity.Show;

public interface ShowRepository extends JpaRepository<Show, Long> {

	List<Show> findByScreen(Screen screen);

}