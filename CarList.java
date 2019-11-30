import java.util.Scanner;

public class CarList {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = 0;  //Option that the user enters

        //Create a linked list of 4 cars head, c2, c3, c4
        Car head = new Car ("Dodge", "Dart" , 2015);    //head of the linked list
        Car c2 = new Car ("Toyota", "Corolla", 2010);
        addCar(head, c2);   //add car to the linked list
        Car c3 = new Car ("BMW", "M4" , 2016);
        addCar(head, c3);   //add car to the linked list
        Car c4 = new Car ("Chevy", "Camaro", 2019);
        addCar(head, c4);   //add car to the linked list

        while(n != 4){  //Iterates program until user wants to exit
            System.out.println("Welcome to Car Rental");
            System.out.println("Select an option:");
            System.out.println("\t1. Show all Cars in stock");
            System.out.println("\t2. Add new car at the end of Linked List");
            System.out.println("\t3. Remove one car from the end of Linked List");
            System.out.println("\t4. Exit");
            n = scnr.nextInt();

            if(n == 1){ //Prints Cars in stock with print() function
                System.out.println("This are the Cars currently in stock:");
                print(head);
            }
            else if(n == 2){    //Creates Car object with user's inputs and adds it to the linked list
                System.out.println("Enter the Brand, Model and Year of the new Car:");
                System.out.println("Brand: ");
                String brand = scnr.nextLine();
                brand = scnr.next();
                System.out.println("Model: ");
                String model = scnr.nextLine();
                model = scnr.next();
                System.out.println("Year: ");
                int year = scnr.nextInt();
                Car c5 = new Car(brand, model,year);
                addCar(head, c5);
            }
            else if (n == 3){   //Removes last object Car of the linked list
                System.out.println("Last car of the linked list has been removed");
                removeCar(head);
            }
            else if (n == 4){   //Exits
                System.out.println("Goodbye!! Hope to see you next time!");
            }
            else {  //Makes user enter another option
                System.out.println("Select a valid option, please.");
            }
            System.out.println("****************************************************");
        }


    }

    public static void print(Car head){
        Car temp = head;    //Temporal object
        int index = 1;
        while(temp != null){    //Until last object has printed it's data
            System.out.println("Car " + index);
            System.out.println("\tBrand: " + temp.brand);
            System.out.println("\tModel: " + temp.model);
            System.out.println("\tYear: " + temp.year);
            System.out.println();
            temp = temp.next;
            index++;
        }
        System.out.println();
    }

    public static Car addCar(Car head, Car last){
        Car temp = head;    //Temporal object
        while(temp.next != null){   //Until last object is reached
            temp = temp.next;
        }
        temp.next = last;   //Add "last" object to the end
        return head;
    }

    public static Car removeCar(Car head){
        Car temp = head;    //Temporal object
        while(temp.next.next != null){  //Until penultimate object is reached
            temp = temp.next;
        }
        temp.next = null;   //Make last object null, that is, make the penultimate object last
        return head;
    }
}
