package HomeWork2;

public class Audi extends Car {

    private double volume;

    public Audi(int years, String model, String color, double volume) {
        super(years, model, color);
        this.volume = volume;
    }

    public Audi(int years, String model, String color) {
        super(years, model, color);
    }

    public double getVolume() {
        return volume;
    }


    @Override
    public void print() {
        System.out.println("" +
                "Year: " + getYears() + "\n" +
                "Model: " + getModel() + "\n" +
                "Volume: " + volume);
    }
}
