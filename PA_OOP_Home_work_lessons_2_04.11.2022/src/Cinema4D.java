public class Cinema4D extends CinemaHall{
    public Cinema4D(String name, int screenDiagonal, int numberOfSeats, String sound) {
        super(name, screenDiagonal, numberOfSeats, sound);
    }

    public Cinema4D(String movieName, String sessionTime, int row, int place, double ticketPrice) {
        super(movieName, sessionTime, row, place, ticketPrice);
    }
}
