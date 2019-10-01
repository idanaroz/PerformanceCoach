package com.example.PerformanceCoach.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Challenge {

    private Integer challenge_id;

    private String  challenge_name;

    // add label maybe

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getChallenge_id() {
        return challenge_id;
    }

    public void setChallenge_id(Integer challenge_id) {
        this.challenge_id = challenge_id;
    }

    public String getChallenge_name() {
        return challenge_name;
    }

    public void setChallenge_name(String challenge_name) {
        this.challenge_name = challenge_name;
    }



}
