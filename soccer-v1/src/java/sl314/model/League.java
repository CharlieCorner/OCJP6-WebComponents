package sl314.model;

/**
 *
 * @author charlie
 */
public class League {

    private int year;
    private String title;
    private String season;

    public League() {
    }

    public League(int year, String title, String season) {
        this.year = year;
        this.title = title;
        this.season = season;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
