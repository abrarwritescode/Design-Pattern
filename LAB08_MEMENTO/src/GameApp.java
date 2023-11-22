public class GameApp {
    public static void main(String[] args) {
        Car car = new Car("Sedan", "Blue", 0);
        RacingGame game = new RacingGame(car);

        System.out.println("STarting Car State: " + car);

        game.moveCar(100);
        System.out.println("After moving : " + car);

        game.moveCar(200);
        System.out.println("After moving again: " + car);

        game.undo();
        System.out.println("after Undo: " + car);
    }
}
