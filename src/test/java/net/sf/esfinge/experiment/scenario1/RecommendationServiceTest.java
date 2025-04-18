package net.sf.esfinge.experiment.scenario1;

import net.sf.esfinge.experiment.scenario1.service.RecommendationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RecommendationServiceTest {

    private final RecommendationService recommendationService = new RecommendationService();
    private static final String RECOMMENDATION = "JBL 510BT Bluetooth Headphones received 1231 visits this month.\n Also check out HyperX Cloud Stinger Headphones!";

    @Test
    void testFindRecommendation() {
        StringBuilder sb = new StringBuilder();
        recommendationService.findRecommendation(sb);

        assertEquals(RECOMMENDATION, sb.toString());
    }

    @Test
    void testFindRecommendationUsingToggle() {
        recommendationService.setToggle(true);

        StringBuilder sb = new StringBuilder();
        recommendationService.findRecommendation(sb);

        assertNotEquals(RECOMMENDATION, sb.toString());
    }

}
