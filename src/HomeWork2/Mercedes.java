package HomeWork2;

public class Mercedes extends Car{

    private String kuzov;

    public Mercedes(int years, String model, String color, String kuzov) {
        super(years, model, color);
        this.kuzov = kuzov;
    }

    public Mercedes(int years, String model, String color) {
        super(years, model, color);
    }

    public String getKuzov() {
        return kuzov;
    }

    @Override
    public void print() {
        System.out.println("" +
                "Year: " + getYears() + "\n" +
                "Model: " + getModel() + "\n" +
                "Kuzov: " + kuzov);
    }

}
