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

}
