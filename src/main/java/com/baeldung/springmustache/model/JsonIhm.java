package com.baeldung.springmustache.model;

public class JsonIhm {
    private String normeA;
    Abonnement abonnement;
    Notification notification;


    // Getter Methods

    public String getNormeA() {
        return normeA;
    }

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public Notification getNotification() { return notification; }

    // Setter Methods

    public void setNormeA(String normeA) {
        this.normeA = normeA;
    }

    public void setAbonnement(Abonnement abonnement) {
        this.abonnement = abonnement;
    }

    public void setNotification(Notification notification) { this.notification = notification; }

}
