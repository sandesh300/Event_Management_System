package com.eventManagement.Event_Management_System.repository;


import com.eventManagement.Event_Management_System.model.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}
