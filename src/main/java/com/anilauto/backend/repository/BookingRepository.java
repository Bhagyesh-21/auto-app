package com.anilauto.backend.repository;

import com.anilauto.backend.model.Booking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	List<Booking> findByPhone(String phone);

}
