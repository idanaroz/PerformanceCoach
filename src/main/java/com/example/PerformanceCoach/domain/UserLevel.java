package com.example.PerformanceCoach.domain;


import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class UserLevel implements Serializable {


    private UserChallenge pk;
    private Integer challengeLevel;

    @EmbeddedId
    public UserChallenge getPk() {
        return pk;
    }

    public void setPk(UserChallenge pk) {
        this.pk = pk;
    }

    public Integer getChallengeLevel() {
        return challengeLevel;
    }

    public void setChallengeLevel(Integer challengeLevel) {
        this.challengeLevel = challengeLevel;
    }
}
