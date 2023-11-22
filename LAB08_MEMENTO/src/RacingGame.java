import java.util.Stack;

public class RacingGame {

    //THIS IS THE CARETAKER
    private final Car car;
    private final Stack<CarMemento> mementos = new Stack<>();

    public RacingGame(Car car) {

        this.car = car;
    }

    public void moveCar(int position) {
        mementos.push(car.createMemento());

        car.setPosition(position);
    }
    public void undo() {

        //RESTORING PREVIOUS STATE
        if (!mementos.isEmpty()) {
            CarMemento memento = mementos.pop();
            car.restoreMemento(memento);
        }
    }

    public Car getCar() {

        return car;
    }
}
