import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantRatingAnalyzer {
    
    public static Map<String, Double> analyzeRestaurantRatings(List<Integer> ratings) {
        Map<String, Double> result = new HashMap<>();
        int totalRestaurants = ratings.size();
        
        int range1Count = 0;
        int range2Count = 0;
        double sumRange1 = 0;
        double sumRange2 = 0;
        
        for (int rating : ratings) {
            if (rating >= 1 && rating <= 5) {
                range1Count++;
                sumRange1 += rating;
            } else if (rating >= 6 && rating <= 10) {
                range2Count++;
                sumRange2 += rating;
            }
        }
        
        double avgRange1 = range1Count > 0 ? sumRange1 / range1Count : 0;
        double avgRange2 = range2Count > 0 ? sumRange2 / range2Count : 0;
        
        result.put("1-5", avgRange1);
        result.put("6-10", avgRange2);
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> ratings = List.of(3, 8, 6, 4, 9, 2, 7, 10, 5, 1);
        Map<String, Double> analysisResult = analyzeRestaurantRatings(ratings);
        
        System.out.println("Restaurant Ratings Analysis:");
        analysisResult.forEach((range, avgRating) -> {
            System.out.println(range + " Range - Average Rating: " + avgRating);
        });
    }
}
