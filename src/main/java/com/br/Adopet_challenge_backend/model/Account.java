package com.br.Adopet_challenge_backend.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uidAccount;

    @OneToOne
    @MapsId
    @JoinColumn(name = "uidTutor")
    private Tutor tutor;

    private String password;

    @OneToMany(mappedBy = "account")
    private List<Message> messages;

    public UUID getUidAccount() {
        return uidAccount;
    }

    public void setUidAccount(UUID uidAccount) {
        this.uidAccount = uidAccount;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
