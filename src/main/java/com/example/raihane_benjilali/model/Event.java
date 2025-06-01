package com.example.raihane_benjilali.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import com.example.raihane_benjilali.model.Locatie;


import javax.xml.stream.Location;
import java.time.LocalDateTime;
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime tijdstip;
    @NotEmpty(message = "{event.empty}")
    private String titel;
    @NotEmpty(message = "{event.empty}")
    private String omschrijving;
    @NotEmpty(message = "{event.empty}")
    private String organisatie;
    @Email
    @NotEmpty(message = "{event.empty}")
    private String mailContact;
    @Valid
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Locatie locatie;

    public long getId() {
        return id;
    }

    public LocalDateTime getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(LocalDateTime tijdstip) {
        this.tijdstip = tijdstip;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getOrganisatie() {
        return organisatie;
    }

    public void setOrganisatie(String organisatie) {
        this.organisatie = organisatie;
    }

    public String getMailContact() {
        return mailContact;
    }

    public void setMailContact(String mailContact) {
        this.mailContact = mailContact;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }

    public Event(LocalDateTime tijdstip, String titel, String omschrijving, String organisatie, String mailContact, Locatie locatie) {
        this.tijdstip = tijdstip;
        this.titel = titel;
        this.omschrijving = omschrijving;
        this.organisatie = organisatie;
        this.mailContact = mailContact;
        this.locatie = locatie;
    }

    public Event() {

    }
}
