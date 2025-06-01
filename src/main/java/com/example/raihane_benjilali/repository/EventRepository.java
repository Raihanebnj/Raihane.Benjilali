package com.example.raihane_benjilali.repository;

import com.example.raihane_benjilali.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findTop10ByOrderByIdDesc();
}
