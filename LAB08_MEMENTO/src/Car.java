import java.util.Stack;

class Car {
    private String model;
    private String color;
    private int position;

    public Car(String model, String color, int position) {
        this.model = model;
        this.color = color;
        this.position = position;
    }

    public CarMemento createMemento() {
        return new CarMemento(this.model, this.color, this.position);
    }

    public void restoreMemento(CarMemento memento) {
        this.model = memento.getModel();
        this.color = memento.getColor();
        this.position = memento.getPosition();
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Car [Model: " + model + ", Color: " + color + ", Position: " + position + "]";
    }
}

