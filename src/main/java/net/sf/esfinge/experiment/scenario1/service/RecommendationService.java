package net.sf.esfinge.experiment.scenario1.service;

public class RecommendationService {

    private boolean toggle;

    public void findRecommendation(StringBuilder sb) {
        //USE the toggle logic
        sb.append(findProduct())
            .append(" received ")
            .append(findVisits())
            .append(" visits this month.\n Also check out ")
            .append(findOtherProduct())
            .append("!");
    }

    private String findProduct() {
        return "JBL 510BT Bluetooth Headphones";
    }

    public Integer findVisits() {
        return 1231;
    }

    public String findOtherProduct() {
        return "HyperX Cloud Stinger Headphones";
    }

    public void setToggle(boolean toggle) {
        this.toggle = toggle;
    }
}
