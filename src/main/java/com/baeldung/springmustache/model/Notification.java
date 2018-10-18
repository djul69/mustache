package com.baeldung.springmustache.model;

public class Notification {
    Identite identite;
    private String id;
    private String dateMaj = null;
    private String statutAbonnement;
    private String codeAbonnementRetour;


    // Getter Methods

    public Identite getIdentite() {
        return identite;
    }

    public String getId() {
        return id;
    }

    public String getDateMaj() {
        return dateMaj;
    }

    public String getStatutAbonnement() {
        return statutAbonnement;
    }

    public String getCodeAbonnementRetour() {
        return codeAbonnementRetour;
    }

    // Setter Methods

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDateMaj(String dateMaj) {
        this.dateMaj = dateMaj;
    }

    public void setStatutAbonnement(String statutAbonnement) {
        this.statutAbonnement = statutAbonnement;
    }

    public void setCodeAbonnementRetour(String codeAbonnementRetour) {
        this.codeAbonnementRetour = codeAbonnementRetour;
    }
}
