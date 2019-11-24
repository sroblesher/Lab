import java.util.Scanner;

public class RentalCar{
    public static void main(String[] args){

        Scanner sc1 = new Scanner (System.in); //for Strings
        Scanner sc2 = new Scanner (System.in); //for integers
        Scanner sc3 = new Scanner (System.in); //for Last check

        //-----------------------------ENTERING FIRST CAR-------------------------------------
        System.out.println("Enter First Car information\n");
        System.out.print("Brand: ");
        String brand1 = sc1.nextLine();
        //create an object with constructor 1
        System.out.println();
        Car car1 = new Car(brand1); //Create first car object


        //-----------------------------ENTERING SECOND CAR-------------------------------------
        System.out.print("Enter Second Car information\n");
        System.out.print("Brand: ");
        String brand2 = sc1.nextLine();
        System.out.print("Model: ");
        String model = sc1.nextLine();
        System.out.print("Year: ");
        int year = sc2.nextInt();
        //create an object with constructor 2
        System.out.println();
        Car car2 = new Car(brand2, model, year);    //Create second car object


        //-----------------------------ENTERING THIRD CAR-------------------------------------
        System.out.print("Enter Third Car information\n");
        System.out.print("Brand: ");
        String brand3 = sc1.nextLine();
        System.out.print("Model: ");
        String model2 = sc1.nextLine();
        System.out.print("Year: ");
        int year2 = sc2.nextInt();
        System.out.print("Availability: ");
        String av = sc1.nextLine();
        boolean s;

        //----------------------------CHECKING IF THIRD CAR IS AVAILABLE-----------------------
        if(av.equals("Yes")){
            s = true;
        }else{
            s = false;
        }

        //create an object with constructor 3
        Car car3 = new Car(brand3, model2, year2, s);   //Create third car object

        if(!car3.Availability){
            System.out.print("Enter renter's name: ");
            String renter = sc3.nextLine();
            //set renter's name to Car 3
            car3.setName(renter);
        }

        //----------------------------------VIEWING ALL CARS INFORMATION--------------------------
        System.out.println();
        System.out.println("History of cars stored: ");
        System.out.println();

        car1.ViewCar(); //Display car 1 information
        System.out.println();

        car2.ViewCar(); //Display car 2 information
        System.out.println();

        car3.ViewCar(); //Display car 3 information


    }
}