package com.example.gestur.logic.questions;

import com.example.gestur.DB.definitionFormClasses.QuestionDefScoreObs;

public class ScoreObsQuestion extends ScoreQuestion {

    private String observation;

    public ScoreObsQuestion(String number, int min, int max, String question, Boolean NA, int score, String observation) {
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
