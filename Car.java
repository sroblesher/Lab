public class Car {
    String brand;
    String model;
    int year;
    Car next;

    Car(String brand){
        this.brand = brand;
    }

    Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
