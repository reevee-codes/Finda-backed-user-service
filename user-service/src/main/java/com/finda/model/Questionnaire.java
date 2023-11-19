package com.finda.model;

import jakarta.persistence.*;

@Entity
@Table(name = "questionarries")
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gender;
    private String pytanie1;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPytanie1() {
        return pytanie1;
    }

    public void setPytanie1(String pytanie1) {
        this.pytanie1 = pytanie1;
    }
}
