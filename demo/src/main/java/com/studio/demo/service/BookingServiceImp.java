package com.studio.demo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.studio.demo.dto.KvlDto1;
import com.studio.demo.model.KvlModel;
import com.studio.demo.model.KvlModel1;
import com.studio.demo.repository.BookingRepository;
import com.studio.demo.repository.KvlRepository;

@Service
public class BookingServiceImp implements BookingService {
	@Autowired
	private BookingRepository bookingRepository;
	
	
	@Autowired
	private KvlRepository kvlRepository;
	
//	Optional<KvlModel> user = kvlRepository.findByEmail(email);
//    if (user.isEmpty()) {
//        return "User not logged in or does not exist";
//    }

	@Override
	public String bookingevent(KvlDto1 response, String loggedInUsername) {
	    Optional<KvlModel1> existing = bookingRepository.findByUsernameAndEventNameAndEventDate(
	        loggedInUsername, response.getEventName(), response.getEventDate());

	    if (existing.isPresent()) {
	        return "Duplicate booking not allowed";
	    }

	    KvlModel1 booking = new KvlModel1();
	    booking.setUsername(loggedInUsername);
	    booking.setEventName(response.getEventName());
	    booking.setEventDate(response.getEventDate());
	    booking.setEventLocation(response.getEventLocation());
	    booking.setEventTime(response.getEventTime());
	    booking.setContactnumber(response.getContactnumber()); // optional


	    bookingRepository.save(booking);
	    return "Booking successful";
	}
}
