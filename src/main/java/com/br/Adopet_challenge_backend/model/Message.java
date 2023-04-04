package com.br.Adopet_challenge_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_Message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uidMessage;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    private String nameOfInterested;

    private String phoneOfInterested;

    private String nameOfAnimal;

    private String messageText;

    public Long getUidMessage() {
        return uidMessage;
    }

    public void setUidMessage(Long uidMessage) {
        this.uidMessage = uidMessage;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getNameOfInterested() {
        return nameOfInterested;
    }

    public void setNameOfInterested(String nameOfInterested) {
        this.nameOfInterested = nameOfInterested;
    }

    public String getPhoneOfInterested() {
        return phoneOfInterested;
    }

    public void setPhoneOfInterested(String phoneOfInterested) {
        this.phoneOfInterested = phoneOfInterested;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
