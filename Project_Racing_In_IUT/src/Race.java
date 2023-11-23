import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Race {
    private Car car;
    private Track track;
    private String racingType;

    public Race(Car car, Track track, String racingType) {
        this.car = car;
        this.track = track;
        this.racingType = racingType;
    }

    public void startRace() {
        // Display car and track information
        car.carInfo();
        track.trackInfo();

        // Start the race
        car.startCar();
        car.accelerateCar();

        // Pit stop with NOS option
        if (racingType.equalsIgnoreCase("Circuit")) {
            System.out.println("Entering pit stop for NOS");
            ResonacNOS nosCar = new ResonacNOS(car);
            nosCar.accelerateCar();
        }

        if (racingType.equalsIgnoreCase("Sprint")) {
            System.out.println("Entering pit stop for NOS");
            SemaNOS nosCar = new SemaNOS(car);
            nosCar.accelerateCar();
        }


        // Finish line
        System.out.println("Approaching finish line");
        car.accelerateCar();
        car.stopCar();

        // Display lap time
        System.out.println("Lap time: " + getLapTime());
    }
    public String getLapTime() {
        Random random = new Random();
        int hours = random.nextInt(24);
        int minutes = random.nextInt(60);
        int seconds = random.nextInt(60);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(new Date(0, 0, 0, hours, minutes, seconds));
    }
}
