import java.util.Scanner;

public class Lab6_Robles{
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    // 1.- Inverted Triangle:
    for (int i = 0; i < 5 ; i++)
    {
      for (int j = 5; (j -i) >= 1; j--)
      {
        System.out.print(j-i + " ");
      }
      System.out.println("");
    }
    System.out.println("");

    // 2.- Print Matrix
    for (int i = 5 ; i >= 1 ; i--)
    {
      System.out.print(i + " ");
      for (int j = 1; j <= 5; j++)
      {
        System.out.print("0 ");
      }
      System.out.println("");
    }
    System.out.println("  1 2 3 4 5");

    //Ask user to enter coordinate values from 1 to 5
    System.out.print("\nEnter x coord: ");
    int xCoord = scnr.nextInt();
    while ( (xCoord > 5) || (xCoord < 1) ) // in case the user inputs an invalid number
    {
      System.out.println("Enter a valid coordinate for x between 1 and 5: ");
      xCoord = scnr.nextInt();
    }

    System.out.print("\nEnter y coord: ");
    int yCoord = scnr.nextInt();
    while ( (yCoord > 5) || (yCoord < 1) ) // in case the user inputs an invalid number
    {
      System.out.println("Enter a valid coordinate for y between 1 and 5: ");
      yCoord = scnr.nextInt();
    }
    System.out.println("");

    //Display matrix with an X
    for (int i = 5 ; i >= 1 ; i--)
    {
      System.out.print(i + " ");
      for (int j = 1; j <= 5; j++)
      {
        if (xCoord == j && yCoord == i)
          System.out.print("X ");
        else
        System.out.print("0 ");
      }
      System.out.println("");
    }
    System.out.println("  1 2 3 4 5");

  }
}
