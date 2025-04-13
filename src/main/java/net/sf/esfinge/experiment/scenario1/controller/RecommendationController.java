package net.sf.esfinge.experiment.scenario1.controller;

import net.sf.esfinge.experiment.scenario1.service.RecommendationService;

public class RecommendationController {

    private final RecommendationService service = new RecommendationService();

    public String findRecommendation() {
        return service.findRecommendation();
    }

    public void setToggle(boolean toggle) {
        service.setToggle(toggle);
    }
}
