package net.sf.esfinge.experiment.scenario1.service;

import net.sf.esfinge.experiment.scenario1.repository.RecommendationRepository;

public class RecommendationService {

    private final RecommendationRepository repository = new RecommendationRepository();

    public void findRecommendation(StringBuilder sb) {
        repository.findProduct(sb);
        sb.append(" received ");
        repository.findVisits(sb);
        sb.append(" visits this month.\n Also check out ");
        repository.findOtherProduct(sb);
        sb.append("!");
    }

}
