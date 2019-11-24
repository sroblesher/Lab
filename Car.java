public class Car {
    String Brand = "None";
    String Model = "None";
    int Year = 0;
    boolean Availability = true;
    private String RenterName = "None";

    Car(){
    }

    Car(String newBrand){
       Brand = newBrand;
    }

    Car(String newBrand, String newModel, int newYear){
        Brand = newBrand;
        Model = newModel;
        Year = newYear;
    }

    Car(String newBrand, String newModel, int newYear, boolean newAvailability){
        Brand = newBrand;
        Model = newModel;
        Year = newYear;
        Availability = newAvailability;
    }

    void ViewCar(){ //Print all data form car object
        if(!Brand.equals("None"))
        System.out.println("Brand: \t" + Brand);
        if(!Model.equals("None"))
        System.out.println("Model: \t" + Model);
        if(!(Year == 0))
        System.out.println("Year: \t" + Year);
        if(!RenterName.equals("None"))
        System.out.println("Renter's name: " + RenterName);
        System.out.println("Availability: " + Availability);
        System.out.println();
    }

    void setName(String newName){
        RenterName = newName;
    }
}
