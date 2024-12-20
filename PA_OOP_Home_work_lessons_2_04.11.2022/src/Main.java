import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static RegularCinema regularCinemaOptions = new RegularCinema("Regular cinema", 744, 500, "Dolby Digital");
    static RegularCinema regularCinemaSession = new RegularCinema("Avatar", "17:15, 19:45, 22:15", 20, 25, 100.00);
    static String printRegularCinemaSession = "Movie name: " + regularCinemaSession.getMovieName() + ", session time: " + regularCinemaSession.getSessionTime() + ", number of rows: " +
            regularCinemaSession.getRow() + ", number of place: " + regularCinemaSession.getPlace() + ", ticket price: " + regularCinemaSession.getTicketPrice() + " uah.";

    static Cinema4D cinema4DOptions = new Cinema4D("4D cinema", 200, 40, "audio format 7.1");
    static Cinema4D cinema4DSession = new Cinema4D("King Lion", "12:45, 14:45, 16:45", 5, 8, 49.99);
    static String printCinema4DSession = "Movie name: " + cinema4DSession.getMovieName() + ", session time: " + cinema4DSession.getSessionTime() + ", number of rows: " +
            cinema4DSession.getRow() + ", number of place: " + cinema4DSession.getPlace() + ", ticket price: " + cinema4DSession.getTicketPrice() + " uah.";

    static MiniCinema miniCinemaOptions = new MiniCinema("Mini cinema", 350, 80, "audio format 5.1");
    static MiniCinema miniCinemaSession = new MiniCinema("Green Mile", "18:00, 20:30, 23:00", 8, 10, 99.99);
    static String printMiniCinemaSession = "Movie name: " + miniCinemaSession.getMovieName() + ", session time: " + miniCinemaSession.getSessionTime() + ", number of rows: " +
            miniCinemaSession.getRow() + ", number of place: " + miniCinemaSession.getPlace() + ", ticket price: " + miniCinemaSession.getTicketPrice() + " uah.";

    public static void main(String[] args) {
        System.out.println("Hello movie buff!");
        System.out.println("What day of the week would you like to go to the cinema?");
        System.out.println("Please make your choice:");

        Scanner scanner = new Scanner(System.in);
        String choiceOfDay = scanner.nextLine();

        System.out.println("Do you want to choose a session yourself(please enter 1) or do it for you automatically(please enter 2)?");
        String answerFromUser = scanner.nextLine();

        if (answerFromUser.equals("1")) {
            switch (choiceOfDay) {
                case "Monday":
                    System.out.println(regularCinemaOptions);
                    System.out.println(printRegularCinemaSession);
                    System.out.println(cinema4DOptions);
                    System.out.println(printCinema4DSession);
                    break;
                case "Tuesday":
                    System.out.println(cinema4DOptions);
                    System.out.println(printCinema4DSession);
                    System.out.println(miniCinemaOptions);
                    System.out.println(printMiniCinemaSession);
                    break;
                case "Wednesday":
                    System.out.println(miniCinemaOptions);
                    System.out.println(printMiniCinemaSession);
                    System.out.println(regularCinemaOptions);
                    System.out.println(printRegularCinemaSession);
                    break;
                case "Thursday":
                    System.out.println(regularCinemaOptions);
                    System.out.println(printRegularCinemaSession);
                    System.out.println(cinema4DOptions);
                    System.out.println(printCinema4DSession);
                    break;
                case "Friday":
                    System.out.println(cinema4DOptions);
                    System.out.println(printCinema4DSession);
                    System.out.println(miniCinemaOptions);
                    System.out.println(printMiniCinemaSession);
                    break;
                case "Saturday":
                    System.out.println(miniCinemaOptions);
                    System.out.println(printMiniCinemaSession);
                    System.out.println(regularCinemaOptions);
                    System.out.println(printRegularCinemaSession);
                    break;
                case "Sunday":
                    System.out.println(miniCinemaOptions);
                    System.out.println(printMiniCinemaSession);
                    System.out.println(cinema4DOptions);
                    System.out.println(printCinema4DSession);
                    System.out.println(regularCinemaOptions);
                    System.out.println(printRegularCinemaSession);
                    break;
                default:
                    System.out.println("Oooops, something wrong! Please starts again.");
            }

            System.out.println("Please make your choice: what movie do you want to watch?");
            bookASeatForASession();
        } else if (answerFromUser.equals("2")) {
            freeSeatReservation();
        } else {
            System.out.println("Oooops, something wrong! Please starts again.");
        }


    }
    public static void bookASeatForASession() {
        String[] movieName = new String[3];
        movieName[0] = regularCinemaSession.getMovieName();
        movieName[1] = cinema4DSession.getMovieName();
        movieName[2] = miniCinemaSession.getMovieName();

        Scanner scanner = new Scanner(System.in);
        String choiceMovie = scanner.nextLine();
        if (choiceMovie.equals(movieName[0]))  {
            System.out.println("Please select a row from 1 to 20");
            String choiceRow = scanner.nextLine();
            System.out.println("Please select a place(s) from 1 to 25");
            String choicePlace = scanner.nextLine();
            System.out.println("Congratulations, you have booked your ticket to the " + regularCinemaSession.getMovieName() + " movie, in " + choiceRow + " row, " +
                    choicePlace + " place(s), in cinema hall " + regularCinemaOptions.getName() + ". Payment after watching the session.");
        } else if (choiceMovie.equals(movieName[1])) {
            System.out.println("Please select a row from 1 to 5");
            String choiceRow = scanner.nextLine();
            System.out.println("Please select a place(s) from 1 to 8");
            String choicePlace = scanner.nextLine();
            System.out.println("Congratulations, you have booked your ticket to the " + cinema4DSession.getMovieName() + " movie, in " + choiceRow + " row, " +
                    choicePlace + " place(s), in cinema hall " + cinema4DOptions.getName() + ". Payment after watching the session.");
        } else if (choiceMovie.equals(movieName[2])) {
            System.out.println("Please select a row from 1 to 8");
            String choiceRow = scanner.nextLine();
            System.out.println("Please select a place(s) from 1 to 10");
            String choicePlace = scanner.nextLine();
            System.out.println("Congratulations, you have booked your ticket to the " + miniCinemaSession.getMovieName() + " movie, in " + choiceRow + " row, " +
                    choicePlace + " place(s), in cinema hall " + miniCinemaOptions.getName() + ". Payment after watching the session.");
        } else {
            System.out.println("Oooops, something wrong! Please starts again.");
        }
    }

    public static void freeSeatReservation() {
        ArrayList<String> listGeneral = new ArrayList<>();
        String row = " row, ";
        String place = " place(s). ";

        String[] movieName = new String[3];
        movieName[0] = regularCinemaSession.getMovieName();
        movieName[1] = cinema4DSession.getMovieName();
        movieName[2] = miniCinemaSession.getMovieName();

        String[][] placeRegularCinema = new String[20][25];
        for (int i = 0; i < placeRegularCinema.length; i++) {
            for (int j = 0; j < placeRegularCinema[i].length; j++) {
                placeRegularCinema[i][j] = "Congratulations, you have booked your ticket to the - " + movieName[0] + ", " + (i + 1) + row + (j + 1) +
                        place + "Time session - 19:45. " + regularCinemaOptions + " Ticket price: " + regularCinemaSession.getTicketPrice() + " uah.";
                listGeneral.add(placeRegularCinema[i][j]);
            }
        }
        String[][] placeCinema4D = new String[5][8];
        for (int i = 0; i < placeCinema4D.length; i++) {
            for (int j = 0; j < placeCinema4D[i].length; j++) {
                placeCinema4D[i][j] = "Congratulations, you have booked your ticket to the - " + movieName[1] + ", " + (i + 1) + row + (j + 1) +
                        place + "Time session - 14:45. " + cinema4DOptions + " Ticket price: " + cinema4DSession.getTicketPrice() + " uah.";
                listGeneral.add(placeCinema4D[i][j]);
            }
        }
        String[][] placeMiniCinema = new String[8][10];
        for (int i = 0; i < placeMiniCinema.length; i++) {
            for (int j = 0; j < placeMiniCinema[i].length; j++) {
                placeMiniCinema[i][j] = "Congratulations, you have booked your ticket to the - " + movieName[2] + ", " + (i + 1) + row + (j + 1) +
                        place + "Time session - 20:30. " + miniCinemaOptions + " Ticket price: " + miniCinemaSession.getTicketPrice() + " uah.";
                listGeneral.add(placeMiniCinema[i][j]);
            }
        }
        Random random = new Random();
        int rand = random.nextInt(listGeneral.size());
        System.out.println(listGeneral.get(rand));
    }
}

//Домашнее задание:
//У Вас, як інженеру стоїть завдання проробити предметну область для додатків по купінгу квитків у кінотеатр.
// Створити систему класів
//, що дозволяє користувачам бронювати квитки на різні сеанси в різних залах(зал повинен містити ряди і місця).
// Реалізувати зали з допомогою наслідування(обычный, 4д, мини).
// Написати метод для представлення конкретного місця на конкретний сеанс.
// Написати метод для реєстрації першого попавшего вільного місця на будь-який сеанс.
