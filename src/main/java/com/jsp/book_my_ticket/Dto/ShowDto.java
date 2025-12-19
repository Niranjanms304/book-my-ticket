package com.jsp.book_my_ticket.Dto;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Data;

@Data
public class ShowDto {
	private LocalDate showDate;
	private LocalTime startTime;
	private Long movieId;
	private Double ticketPrice;
	private Long screenId;
}