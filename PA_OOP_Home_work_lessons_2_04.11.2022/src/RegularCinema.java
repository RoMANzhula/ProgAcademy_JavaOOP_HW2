public class RegularCinema extends CinemaHall{
    public RegularCinema(String name, int screenDiagonal, int numberOfSeats, String sound) {
        super(name, screenDiagonal, numberOfSeats, sound);
    }

    public RegularCinema(String movieName, String sessionTime, int row, int place, double ticketPrice) {
        super(movieName, sessionTime, row, place, ticketPrice);
    }
}
