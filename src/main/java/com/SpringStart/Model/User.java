package com.SpringStart.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class User {

    private Long id;
    private String nom;
    private String prenom;
    private String pieceIdentification;
    private String nationalite;
    private String dateInscription;
    private String dateExpiration;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");



    // Constructor (for constructor injection)
    public User(Long id, String nom, String prenom, String pieceIdentification, String nationalite, String dateInscription, String dateExpiration) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.pieceIdentification = pieceIdentification;
        this.nationalite = nationalite;
        this.dateInscription = dateInscription;
        this.dateExpiration = dateExpiration;
    }

    // Default constructor
    public User() {}

    // Getters and setters (for setter injection)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPieceIdentification() {
        return pieceIdentification;
    }

    public void setPieceIdentification(String pieceIdentification) {
        this.pieceIdentification = pieceIdentification;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public LocalDate getDateInscriptionAsLocalDate() {
        return LocalDate.parse(this.dateInscription, FORMATTER);
    }

    public LocalDate getDateExpirationAsLocalDate() {
        return LocalDate.parse(this.dateExpiration, FORMATTER);
    }

    public LocalDate getDateInscription() {
        return getDateInscriptionAsLocalDate();
    }

    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }

    public LocalDate getDateExpiration() {
        return getDateExpirationAsLocalDate();
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
