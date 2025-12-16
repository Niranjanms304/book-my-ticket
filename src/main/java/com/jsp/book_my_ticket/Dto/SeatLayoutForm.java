package com.jsp.book_my_ticket.Dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class SeatLayoutForm {
	private List<SeatRowDto> rows = new ArrayList<>();
}