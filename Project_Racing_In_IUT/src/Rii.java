import java.util.Scanner;
public class Rii {

    private static CarFactory carFactory;

    public static void main(String[] args) {

        TrackFactory trackFactory = new TrackFactory();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Racing Game!");
        System.out.println("Enter your name: ");

        // Create a singleton Player instance
        Player player = Player.getInstance();
        String player_name=scanner.nextLine();
        player.setName(player_name);

        // Choose car type
        System.out.println("Select car type (Coupe or Roadster): ");
        String carType = scanner.nextLine();
        if (carType.equalsIgnoreCase("Coupe")) {
            carFactory = new CoupeFactory();
        } else if (carType.equalsIgnoreCase("Roadster")) {
            carFactory = new RoadsterFactory();
        } else {
            System.out.println("Invalid car type. Defaulting to Coupe.");
        }

        // Choose car model
        System.out.println("Select car model (ToyotaGR86, SubaruBRZ, PorscheBoxster, Ferrari812): ");
        String carModel = scanner.nextLine();
        Car car = carFactory.createCar(carModel);

        // Choose track
        System.out.println("Select track (Blue Moon Bay Speedway, BB Raceway, Circuit de Spa-Francorchamps): ");
        String trackName = scanner.nextLine();
        Track track = trackFactory.createTrack(trackName);

        // Choose racing type
        System.out.println("Select racing type (Sprint or Circuit): ");
        String racingType = scanner.nextLine();




        // Start the race
        Race race = new Race(car, track, racingType);
        race.startRace();

        // Display race results
        System.out.println("Race results:");
        System.out.println("Car: " + car.getCarName());
        System.out.println("Track: " + track.getTrackName());
        System.out.println("Racing type: " + racingType);
        System.out.println("Lap time: " + race.getLapTime());
        System.out.println("You played well "+player.getName());
    }
}
