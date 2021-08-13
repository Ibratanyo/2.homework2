package HomeWork2;

public class BMW extends Car {

    private String madeIn;

    public BMW(int years, String model, String color, String madeIn) {
        super(years, model, color);
        this.madeIn = madeIn;
    }

    public BMW(int years, String model, String color) {
        super(years, model, color);
    }

    public String getMadeIn() {
        return madeIn;
    }

    @Override
    public void print() {
        System.out.println("" +
                "Year: " + getYears() + "\n" +
                "Model: " + getModel() + "\n" +
                "MadeIn: " + madeIn);
    }

}
