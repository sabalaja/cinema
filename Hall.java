import java.util.ArrayList;
import java.util.List;

public class Hall {
    private int hallNumber;
    private int totalSeats;
    private List<Seat> seats;

    public Hall(int hallNumber, int totalSeats) {
        this.hallNumber = hallNumber;
        this.totalSeats = totalSeats;
        this.seats = new ArrayList<>();

        for (int i = 1; i <= totalSeats; i++) {
            seats.add(new Seat("A" + i));
        }
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
