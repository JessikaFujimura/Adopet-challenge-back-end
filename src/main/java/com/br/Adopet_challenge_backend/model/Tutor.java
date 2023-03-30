package com.br.Adopet_challenge_backend.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_Tutor")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uidTutor;

    private String name;

    private String phone;

    private String email;

    private String city;

    private String description;

    private String photo;

    @OneToOne(mappedBy = "tutor")
    @PrimaryKeyJoinColumn
    private Account account;

    public UUID getUidTutor() {
        return uidTutor;
    }

    public void setUidTutor(UUID uidTutor) {
        this.uidTutor = uidTutor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
