package com.jsp.book_my_ticket.Serives;

import com.jsp.book_my_ticket.Dto.UserDto;

public interface RedisService {

	void saveUserDto(String email, UserDto userDto);

	void saveOtp(String email, int otp);

	UserDto getDtoByEmail(String email);

	int getOtpByEmail(String email);

}