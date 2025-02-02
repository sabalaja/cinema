import java.util.Date;

class Screening {
    private Movie movie;
    private Hall hall;
    private Date screeningTime;

    public Screening(Movie movie, Hall hall, Date screeningTime) {
        this.movie = movie;
        this.hall = hall;
        this.screeningTime = screeningTime;
    }

    public boolean reservePlaces(String customerName, String... seatNumbers) {
        boolean allReserved = true;
        for (String seatNumber : seatNumbers) {
            boolean reserved = false;
            for (Seat seat : hall.getSeats()) {
                if (seatNumber.equals(seat.getSeatNumber())) {
                    reserved = seat.reserve();
                    break;
                }
            }
            if (!reserved) {
                allReserved = false;
                break;
            }
        }

        if (allReserved) {
            System.out.println("Rezerwacja dla " + customerName + " na miejsca: " + String.join(", ", seatNumbers));
        } else {
            System.out.println("Nie udało się zarezerwować wszystkich miejsc dla " + customerName);
        }

        return allReserved;
    }

    public Movie getMovie() {
        return movie;
    }

    public Hall getHall() {
        return hall;
    }

    public Date getScreeningTime() {
        return screeningTime;
    }
}
