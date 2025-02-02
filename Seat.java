class Seat {
    private String seatNumber;
    private boolean isReserved;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isReserved = false;
    }

    public boolean reserve() {
        if (!isReserved) {
            isReserved = true;
            return true;
        }
        return false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
}