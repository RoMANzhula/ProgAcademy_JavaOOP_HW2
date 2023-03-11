public class CinemaHall {
    private String name;
    private int screenDiagonal;
    private int numberOfSeats;
    private String sound;
    private double ticketPrice;
    private String sessionTime;
    private String movieName;
    private int row;
    private int place;

    public CinemaHall(String name, int screenDiagonal, int numberOfSeats, String sound) {
        this.name = name;
        this.screenDiagonal = screenDiagonal;
        this.numberOfSeats = numberOfSeats;
        this.sound = sound;
    }

    public CinemaHall(String movieName, String sessionTime, int row, int place, double ticketPrice) {
        this.movieName = movieName;
        this.sessionTime = sessionTime;
        this.row = row;
        this.place = place;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "We have cinema hall: " + getName() +
                ", have screen diagonal: " + getScreenDiagonal() +
                " inches, have number of seats: "  + getNumberOfSeats() +
                " and have good sound: " + getSound() +
                ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(int screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(String sessionTime) {
        this.sessionTime = sessionTime;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}

////Домашнее задание:
////У Вас, как инженера стоит задача проработать предметную область для приложения по букингу билетов в кинотеатр.
//// Создать систему классов
////, позволяющую пользователям бронировать билеты на разные сеансы в разных залах(зал должен содержать ряды и места).
//// Реализовать залы с помощью наследования(обычный, 4д, мини).
//// Написать метод для бронирования конкретного места на конкретный сеанс.
//// Написать метод для бронирования первого попавшегося свободного места на любой сеанс.