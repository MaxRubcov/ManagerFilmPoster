package netology.manager;

public class MoviesManager {
    private String[] movies = new String[0];
    private int limit = 5;

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public MoviesManager() {

    }

    public void addMovies(String newMovie) {

        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = newMovie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLastMovies() {
        int resultLength;
        if (limit <= movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        String[] all = findAll();
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = all[movies.length - 1 - i];

        }
        return result;
    }
}