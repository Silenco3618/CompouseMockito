import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {
    ManagerFilms manager = new ManagerFilms();
    @Test
    public void addFilm() {

        manager.addFilms("Film 1");
        manager.addFilms("Film 2");
        manager.addFilms("Film 3");
        manager.addFilms("Film 4");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void beReversAllFilms() {

        manager.addFilms("Film 1");
        manager.addFilms("Film 2");
        manager.addFilms("Film 3");
        manager.addFilms("Film 4");


        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsAsLimitRevers() {

        manager.addFilms("Film 1");
        manager.addFilms("Film 2");
        manager.addFilms("Film 3");
        manager.addFilms("Film 4");
        manager.addFilms("Film 5");
        manager.addFilms("Film 6");
        manager.addFilms("Film 7");
        manager.addFilms("Film 8");
        manager.addFilms("Film 9");
        manager.addFilms("Film 10");



        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addFilmsAsLimit() {

        manager.addFilms("Film 1");
        manager.addFilms("Film 2");
        manager.addFilms("Film 3");
        manager.addFilms("Film 4");
        manager.addFilms("Film 5");
        manager.addFilms("Film 6");
        manager.addFilms("Film 7");
        manager.addFilms("Film 8");
        manager.addFilms("Film 9");
        manager.addFilms("Film 10");



        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addFilmsAboveLimit() {


        manager.addFilms("Film 1");
        manager.addFilms("Film 2");
        manager.addFilms("Film 3");
        manager.addFilms("Film 4");
        manager.addFilms("Film 5");
        manager.addFilms("Film 6");
        manager.addFilms("Film 7");
        manager.addFilms("Film 8");
        manager.addFilms("Film 9");
        manager.addFilms("Film 10");
        manager.addFilms("Film 11");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10", "Film 11"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}
