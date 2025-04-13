package net.sf.esfinge.experiment.scenario1;

import net.sf.esfinge.experiment.scenario1.controller.RecommendationController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RecommendationControllerTest {

    private final RecommendationController recommendationController = new RecommendationController();
    private static final String RECOMMENDATION = "JBL 510BT Bluetooth Headphones received 1231 visits this month.\n Also check out HyperX Cloud Stinger Headphones!";

    @Test
    void testFindRecommendation() {
        String recommendation = recommendationController.findRecommendation();

        assertEquals(RECOMMENDATION, recommendation);
    }

    @Test
    void testFindRecommendationWithDifferentQtyViewsValue() {
        recommendationController.setToggle(true);

        String recommendation = recommendationController.findRecommendation();

        assertNotEquals(RECOMMENDATION, recommendation);
    }

    @Test
    void testFindRecommendationWithDifferentProductValue() {
        recommendationController.setToggle(true);

        String recommendation = recommendationController.findRecommendation();

        assertNotEquals(RECOMMENDATION, recommendation);
    }

    @Test
    void testFindRecommendationWithDifferentOtherProductValue() {
        recommendationController.setToggle(true);

        String recommendation = recommendationController.findRecommendation();

        assertNotEquals(RECOMMENDATION, recommendation);
    }

}
