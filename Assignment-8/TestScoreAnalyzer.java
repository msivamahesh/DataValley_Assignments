import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestScoreAnalyzer {
    
    public static void analyzeTestScores(List<Integer> scores) {
        int totalStudents = scores.size();
        int sum = 0;
        int aboveAverage = 0;
        int atAverage = 0;
        int belowAverage = 0;

        // Calculate the sum of scores
        for (int score : scores) {
            sum += score;
        }

        // Calculate the average score
        double average = (double) sum / totalStudents;

        // Sort the scores to find the median
        Collections.sort(scores);
        int medianIndex = totalStudents / 2;
        double median = totalStudents % 2 == 0 ?
                (scores.get(medianIndex - 1) + scores.get(medianIndex)) / 2.0 :
                scores.get(medianIndex);

        // Count the number of students above, at, and below the average
        for (int score : scores) {
            if (score > average) {
                aboveAverage++;
            } else if (score == average) {
                atAverage++;
            } else {
                belowAverage++;
            }
        }

        // Print the analysis result
        System.out.println("Analysis Result:");
        System.out.println("Above Average Students: " + aboveAverage + " , Median Score: " + median);
        System.out.println("At Average Students: " + atAverage + " , Median Score: " + median);
        System.out.println("Below Average Students: " + belowAverage + " , Median Score: " + median);
    }

    public static void main(String[] args) {
        // Sample list of student test scores
        List<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(90);
        scores.add(75);
        scores.add(80);
        scores.add(95);

        // Analyze test scores
        analyzeTestScores(scores);
    }
}
