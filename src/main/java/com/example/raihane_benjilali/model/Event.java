package com.example.raihane_benjilali.model;

import java.time.LocalDateTime;

public class Event {
    private int id;
    private LocalDateTime tijdstip;
    private String titel;
    private String omschrijving;
    private String organisatie;
    private String mailContact;
    private String locatie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public Event() {
    }

    public Event(int id, LocalDateTime tijdstip, String titel, String omschrijving, String organisatie, String mailContact, String locatie) {
        this.id = id;
        this.tijdstip = tijdstip;
        this.titel = titel;
        this.omschrijving = omschrijving;
        this.organisatie = organisatie;
        this.mailContact = mailContact;
        this.locatie = locatie;
    }
}
