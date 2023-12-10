package com.hexaware.hibernate.service;

import java.util.List;

public interface ITheatre {

	public int createTheatre( Theatre id);
	public int updateBookings(Theatre id);
	public int  deleteBookings(int Theatre_ID);
	public Theatre getBookingsById(int Theatre_ID);
	public List<Theatre>getAllBookings();
	
}
