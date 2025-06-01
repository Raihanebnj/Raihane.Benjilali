package com.example.raihane_benjilali.service;

import com.example.raihane_benjilali.model.Event;
import com.example.raihane_benjilali.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getLatestEvents() {
        return eventRepository.findTop10ByOrderByIdDesc();
    }

    public void save(Event event) {
        eventRepository.save(event);
    }

    public Event getEventById(long id) {
        return eventRepository.findById(id).orElse(null);
    }
}
