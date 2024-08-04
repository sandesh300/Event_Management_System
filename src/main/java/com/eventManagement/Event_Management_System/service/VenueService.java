package com.eventManagement.Event_Management_System.service;


import com.eventManagement.Event_Management_System.exception.ResourceNotFoundException;
import com.eventManagement.Event_Management_System.model.Venue;
import com.eventManagement.Event_Management_System.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VenueService {
    @Autowired
    private VenueRepository venueRepository;

    public Venue createVenue(Venue venue) {
        return venueRepository.save(venue);
    }

    public Optional<Venue> getVenueById(Long id) {
        return venueRepository.findById(id);
    }

    public Venue updateVenue(Long id, Venue venueDetails) {
        Venue venue = venueRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Venue not found"));
        venue.setName(venueDetails.getName());
        venue.setLocation(venueDetails.getLocation());
        venue.setCapacity(venueDetails.getCapacity());
        return venueRepository.save(venue);
    }

    public void deleteVenue(Long id) {
        Venue venue = venueRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Venue not found"));
        venueRepository.delete(venue);
    }
}
