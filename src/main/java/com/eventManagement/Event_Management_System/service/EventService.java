package com.eventManagement.Event_Management_System.service;


import com.eventManagement.Event_Management_System.exception.ResourceNotFoundException;
import com.eventManagement.Event_Management_System.model.Event;
import com.eventManagement.Event_Management_System.model.Organizer;
import com.eventManagement.Event_Management_System.model.Venue;
import com.eventManagement.Event_Management_System.repository.EventRepository;
import com.eventManagement.Event_Management_System.repository.OrganizerRepository;
import com.eventManagement.Event_Management_System.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private OrganizerRepository organizerRepository;

    @Autowired
    private VenueRepository venueRepository;

    public Event createEvent(Event event) {
        Organizer organizer = organizerRepository.findById(event.getOrganizer().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Organizer not found"));
        Venue venue = venueRepository.findById(event.getVenue().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Venue not found"));

        event.setOrganizer(organizer);
        event.setVenue(venue);
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    public Event updateEvent(Long id, Event eventDetails) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));

        Organizer organizer = organizerRepository.findById(eventDetails.getOrganizer().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Organizer not found"));
        Venue venue = venueRepository.findById(eventDetails.getVenue().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Venue not found"));

        event.setEventName(eventDetails.getEventName());
        event.setEventDate(eventDetails.getEventDate());
        event.setDescription(eventDetails.getDescription());
        event.setOrganizer(organizer);
        event.setVenue(venue);

        return eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));
        eventRepository.delete(event);
    }

    public List<Event> getEventsByVenue(Long venueId) {
        return eventRepository.findByVenueId(venueId);
    }

    public List<Event> getEventsByOrganizer(Long organizerId) {
        return eventRepository.findByOrganizerId(organizerId);
    }
}
