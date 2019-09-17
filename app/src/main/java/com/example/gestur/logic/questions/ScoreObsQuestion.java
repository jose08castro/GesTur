package com.example.gestur.logic.questions;

public class ScoreObsQuestion extends ScoreQuestion {

    private String observation;

    public ScoreObsQuestion(String number, short min, short max, String question, Boolean NA, short score, String observation) {
        super(number, min, max, question, NA, score);
        this.observation = observation;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
