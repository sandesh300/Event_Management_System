package com.eventManagement.Event_Management_System.repository;


import com.eventManagement.Event_Management_System.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}
