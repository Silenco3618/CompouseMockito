public class ManagerFilms {
    private String[] films = new String[0];
    private int limit;

    public ManagerFilms() {
        this.limit = 10;
    }

    public ManagerFilms(int limit) {
        this.limit = limit;
    }

    public void addFilms(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int allLength;
        if (films.length < limit) {
            allLength = films.length;
        } else {
            allLength = limit;
        }
        String[] tmp = new String[allLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
