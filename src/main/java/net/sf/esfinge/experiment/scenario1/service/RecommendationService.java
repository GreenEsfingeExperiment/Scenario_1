package net.sf.esfinge.experiment.scenario1.service;

import net.sf.esfinge.experiment.scenario1.repository.RecommendationRepository;

public class RecommendationService {

    private final RecommendationRepository repository = new RecommendationRepository();
    private boolean toggle;

    public String findRecommendation() {
        String product = repository.findProduct();
        Integer views = repository.findVisits();
        String otherProduct = repository.findOtherProduct();

        //USE the toggle logic

        return String.format("%s received %d visits this month.\n Also check out %s!", product, views, otherProduct);
    }

    public void setToggle(boolean toggle){
        this.toggle = toggle;
    }
}
