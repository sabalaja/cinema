import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private List<Screening> screenings;

    public Cinema(String name, String address) {
        this.name = name;
        this.address = address;
        this.screenings = new ArrayList<>();
    }

    public void addScreening(Screening screening) {
        screenings.add(screening);
    }

    public List<Screening> getScreenings() {
        return screenings;
    }

    public void printProgramme() {
        System.out.println("Repertuar kina " + name + ":");
        for (Screening screening : screenings) {
            System.out.println("Film: " + screening.getMovie().getTitle() + ", Sala: " + screening.getHall().getHallNumber() + ", Czas: " + screening.getScreeningTime());
        }
    }

    public Movie findMovie(String title) {
        for (Screening screening : screenings) {
            if (screening.getMovie().getTitle().equalsIgnoreCase(title)) {
                return screening.getMovie();
            }
        }
        return null;
    }
}
