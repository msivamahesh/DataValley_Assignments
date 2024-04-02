import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookReviewAnalyzer {
    
    public static Map<String, Integer> analyzeBookReviews(List<Integer> reviews) {
        Map<String, Integer> result = new HashMap<>();
        int positiveReviews = 0;
        int neutralReviews = 0;
        int negativeReviews = 0;

        for (int review : reviews) {
            if (review >= 1 && review <= 5) {
                negativeReviews++;
            } else if (review >= 6 && review <= 10) {
                positiveReviews++;
            } else {
                neutralReviews++;
            }
        }

        result.put("PositiveReviews", positiveReviews);
        result.put("NeutralReviews", neutralReviews);
        result.put("NegativeReviews", negativeReviews);

        return result;
    }

    public static void main(String[] args) {
        // Sample list of book reviews
        List<Integer> reviews = new ArrayList<>();
        reviews.add(7);
        reviews.add(3);
        reviews.add(9);
        reviews.add(5);
        reviews.add(6);
        reviews.add(2);

        // Analyze book reviews
        Map<String, Integer> analysisResult = analyzeBookReviews(reviews);
        System.out.println("Analysis Result:");
        System.out.println(analysisResult);
    }
}
