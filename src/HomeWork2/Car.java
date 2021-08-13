package HomeWork2;

public abstract class Car implements Printable {

    private int years;
    private String model;
    private String color;

    public Car (int years,String model,String color){

        this.years = years;
        this.model = model;
        this.color = color;

    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
