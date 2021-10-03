package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsCalculatorTest {

    @Test
    void exampleAverageCalculation() {
        StatisticsCalculator survey = new StatisticsCalculator();
        ArrayList<Double> surveyResults = new ArrayList<>();

        surveyResults.add(500.0);
        surveyResults.add(325.0);
        surveyResults.add(558.0);
        surveyResults.add(675.0);
        surveyResults.add(496.0);
        surveyResults.add(511.0);
        surveyResults.add(502.0);

         survey.setAmntOfNumbers(7);

         assertEquals(509.57, survey.average(surveyResults));                                                                                                                                                                                                                survey.average(surveyResults));

    }

    @Test
    void exampleMinCalculation() {
        StatisticsCalculator survey = new StatisticsCalculator();
        ArrayList<Double> surveyResults = new ArrayList<>();

        surveyResults.add(500.0);
        surveyResults.add(325.0);
        surveyResults.add(558.0);
        surveyResults.add(675.0);
        surveyResults.add(496.0);
        surveyResults.add(511.0);
        surveyResults.add(502.0);

        survey.setAmntOfNumbers(7);

        assertEquals(325.0, survey.min(surveyResults));
    }

    @Test
    void exampleMaxCalculation() {
        StatisticsCalculator survey = new StatisticsCalculator();
        ArrayList<Double> surveyResults = new ArrayList<>();

        surveyResults.add(500.0);
        surveyResults.add(325.0);
        surveyResults.add(558.0);
        surveyResults.add(675.0);
        surveyResults.add(496.0);
        surveyResults.add(511.0);
        surveyResults.add(502.0);

        survey.setAmntOfNumbers(7);

        assertEquals(675.0, survey.max(surveyResults));
    }

    @Test
    void exampleStdCalculation() {
        StatisticsCalculator survey = new StatisticsCalculator();
        ArrayList<Double> surveyResults = new ArrayList<>();

        surveyResults.add(500.0);
        surveyResults.add(325.0);
        surveyResults.add(558.0);
        surveyResults.add(675.0);
        surveyResults.add(496.0);
        surveyResults.add(511.0);
        surveyResults.add(502.0);

        survey.setAmntOfNumbers(7);

        assertEquals(103.39, survey.std(surveyResults));
    }
}