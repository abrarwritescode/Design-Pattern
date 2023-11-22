public class CarMemento {
    private final String model;
    private final String color;
    private final int position;

    //memento class

    public CarMemento(String model, String color, int position) {
        this.model = model;
        this.color = color;
        this.position = position;
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
}
