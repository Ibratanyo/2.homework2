package HomeWork2;

public class Main {


    public static void main(String[] args) {

        createObject("BMW").print();
        System.out.println();
        createObject("Audi").print();
        System.out.println();
        createObject("Mercedes").print();

    }

    static Car createObject(String className) {
        switch (className) {
            case "Audi":
                Audi audi = new Audi(2015, "A8", "Silver", 3.0);
                return audi;
            case "BMW":
                BMW bmw = new BMW(2015, "A8", "Silver", "Germany");
                return bmw;
            case "Mercedes":
                Mercedes mercedes = new Mercedes(2020, "A70", "BLACK", "4WD");
                return mercedes;
        }

        return null;
    }

}