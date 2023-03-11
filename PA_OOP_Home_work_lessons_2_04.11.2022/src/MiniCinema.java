public class MiniCinema extends CinemaHall{
    public MiniCinema(String name, int screenDiagonal, int numberOfSeats, String sound) {
        super(name, screenDiagonal, numberOfSeats, sound);
    }

    public MiniCinema(String movieName, String sessionTime, int row, int place, double ticketPrice) {
        super(movieName, sessionTime, row, place, ticketPrice);
    }
}
