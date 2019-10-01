package com.example.PerformanceCoach.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Exercise implements Serializable {
    private Integer id; // exercise id

    private Integer challengeId; // foregin key

    private Integer challengeStepLevel;

    @Column(length = 5000)
    private String description;

    private String goal;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getChallengeId() {
        return challengeId;
    }

    public void setChallengeId(Integer challengeId) {
        this.challengeId = challengeId;
    }

    public Integer getChallengeStepLevel() {
        return challengeStepLevel;
    }

    public void setChallengeStepLevel(Integer challengeStepLevel) {
        this.challengeStepLevel = challengeStepLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }


}

