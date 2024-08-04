package com.eventManagement.Event_Management_System.service;


import com.eventManagement.Event_Management_System.exception.ResourceNotFoundException;
import com.eventManagement.Event_Management_System.model.Organizer;
import com.eventManagement.Event_Management_System.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrganizerService {
    @Autowired
    private OrganizerRepository organizerRepository;

    public Organizer createOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public Optional<Organizer> getOrganizerById(Long id) {
        return organizerRepository.findById(id);
    }

    public Organizer updateOrganizer(Long id, Organizer organizerDetails) {
        Organizer organizer = organizerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Organizer not found"));
        organizer.setName(organizerDetails.getName());
        organizer.setContactInfo(organizerDetails.getContactInfo());
        return organizerRepository.save(organizer);
    }

    public void deleteOrganizer(Long id) {
        Organizer organizer = organizerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Organizer not found"));
        organizerRepository.delete(organizer);
    }
}
