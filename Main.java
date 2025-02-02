import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Super Tarasy", "ul. Akademicka 5");


        Movie movie1 = new Movie("James Bond", 120);
        Movie movie2 = new Movie("Avatar 3", 150);

        Hall hall1 = new Hall(1, 100);
        Hall hall2 = new Hall(2, 80);

        Screening screening1 = new Screening(movie1, hall1, new Date());
        Screening screening2 = new Screening(movie2, hall2, new Date());

        cinema1.addScreening(screening1);
        cinema1.addScreening(screening2);

        cinema1.printProgramme();

        Customer customer = new Customer("Julia Sabała");
        screening1.reservePlaces(customer.getName(), "A1", "A2", "A3");

        Movie foundMovie = cinema1.findMovie("James Bond");
        if (foundMovie != null) {
            System.out.println("Znaleziono film: " + foundMovie.getTitle());
        } else {
            System.out.println("Nie znaleziono filmu.");
        }
    }
}
