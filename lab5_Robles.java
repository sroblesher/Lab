import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class lab5_Robles {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner sc = new Scanner(System.in);
    Scanner scnr = new Scanner(new File("student.txt"));
    String user1 = scnr.nextLine();
    String pass1 = scnr.nextLine();
    int count = 0;

    do {
        System.out.println("\nWelcome to UTEP!");
        System.out.printf("\tUsername: ");
        String user2 = sc.nextLine();
        System.out.printf("\tPassword: ");
        String pass2 = sc.nextLine();

        if (user1.equals(user2) && pass1.equals(pass2))
          {
            System.out.println("\nWelcome UTEP Miner!");
            System.out.println("Menu:");
            System.out.printf("\t1.Goldmine\n");
            System.out.printf("\t2.Blackboard\n");
            System.out.printf("\t3.Student Email\n");
            System.out.printf("\t4.Service Desk\n");
            System.out.printf("\t5.Job Mine\n");

            count = 4;
          }

          else
          {
            count++;
            if (count < 3)
            {
              System.out.printf("\nWelcome to UTEP!\n");
              System.out.println("Sorry, you entered invalid credentials.");
              System.out.println("Try again.");

            }
            else
              {
              System.out.println("Sorry, you are temporarily blocked.");
              System.out.println("Try again in a couple of hours.");
              }
          }
        } while (count < 3);

        if (count == 4 )
        {
            System.out.printf("\nAnswer: ");
            int option = sc.nextInt();

            switch(option)
            {
              case 1:
                System.out.println("Welcome to Goldmine!!");
                break;
              case 2:
                System.out.println("Welcome to Blackboard!!");
                break;
              case 3:
                System.out.println("Welcome to Student Email!!");
                break;
              case 4:
                System.out.println("Welcome to Service Desk!!");
                break;
              case 5:
                System.out.println("Welcome to Job Mine!!");
                break;
            }
      }

  }
}
