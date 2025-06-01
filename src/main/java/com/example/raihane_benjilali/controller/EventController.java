package com.example.raihane_benjilali.controller;

import com.example.raihane_benjilali.model.Event;
import com.example.raihane_benjilali.service.EventService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("events", eventService.getLatestEvents());
        return "index";
    }

    @GetMapping("/new")
    public String newEvent(Model model) {
        model.addAttribute("event", new Event());
        return "new";
    }

    @PostMapping("/new")
    public String checkEvent(@Valid @ModelAttribute Event event, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "new";
        }
        eventService.save(event);
        return "redirect:/";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        model.addAttribute("event", eventService.getEventById(id));
        return "details";
    }
}
