import netology.manager.MoviesManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    @Test
    public void shouldFindAll() {
        MoviesManager movies = new MoviesManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель <<Белград>>";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Номер один";
        movies.addMovies(movie1);
        movies.addMovies(movie2);
        movies.addMovies(movie3);
        movies.addMovies(movie4);
        movies.addMovies(movie5);
        movies.addMovies(movie6);

        String[] actual = movies.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {

        MoviesManager movies = new MoviesManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель <<Белград>>";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Номер один";
        movies.addMovies(movie1);
        movies.addMovies(movie2);
        movies.addMovies(movie3);
        movies.addMovies(movie4);
        movies.addMovies(movie5);
        movies.addMovies(movie6);

        String[] actual = movies.findLastMovies();
        String[] expected = {movie6, movie5, movie4, movie3, movie2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindALastMoreLimit() {

        MoviesManager movies = new MoviesManager(4);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель <<Белград>>";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Номер один";
        movies.addMovies(movie1);
        movies.addMovies(movie2);
        movies.addMovies(movie3);
        movies.addMovies(movie4);
        movies.addMovies(movie5);
        movies.addMovies(movie6);

        String[] actual = movies.findLastMovies();
        String[] expected = {movie6, movie5, movie4, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindALastMaxLimit() {

        MoviesManager movies = new MoviesManager(7);
        String movie1 = "Бладшот";
        String movie2 = "Вперёд";
        String movie3 = "Отель <<Белград>>";
        String movie4 = "Джентельмены";
        String movie5 = "Человек-неведимка";
        String movie6 = "Номер один";
        movies.addMovies(movie1);
        movies.addMovies(movie2);
        movies.addMovies(movie3);
        movies.addMovies(movie4);
        movies.addMovies(movie5);
        movies.addMovies(movie6);

        String[] actual = movies.findLastMovies();
        String[] expected = {movie6, movie5, movie4, movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }
}
