import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Movie {
    String category;
    double rating;

    public Movie(String category, double rating) {
        this.category = category;
        this.rating = rating;
    }
}

public class MovieAnalyzer {
    public static void analyzeMovies(List<Movie> movies) {
        Map<String, int[]> stats = new HashMap<>();

        for (Movie movie : movies) {
            stats.putIfAbsent(movie.category, new int[]{0, 0});
            stats.get(movie.category)[0]++;
            stats.get(movie.category)[1] += movie.rating;
        }

        System.out.println("Movies by Category:");
        stats.forEach((category, values) -> {
            int count = values[0];
            double averageRating = (double) values[1] / count;
            System.out.println("Category: " + category + ", Count: " + count + ", Average Rating: " + averageRating);
        });
    }

    public static void main(String[] args) {
        // Sample movie list
        List<Movie> movies = List.of(
                new Movie("PG", 7.5),
                new Movie("PG-13", 8.0),
                new Movie("R", 6.5),
                new Movie("PG", 6.0),
                new Movie("PG-13", 7.0),
                new Movie("R", 8.5)
        );

        // Analyze movies
        analyzeMovies(movies);
    }
}
