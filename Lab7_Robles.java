import java.util.Scanner;

public class Lab7_Robles{
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    double[] salesArray = new double[12];

    System.out.println("Name: ");
    String name = scnr.nextLine();

    System.out.println("Age: ");
    int age = scnr.nextInt();

    System.out.println("Years in company: ");
    int companyAge = scnr.nextInt();

    System.out.println("Enter your sales ($) for this Quarter:");

    System.out.println("Week 1: ");
    salesArray[0] = scnr.nextDouble();

    int maxIndex = 0;
    int lowIndex = 0;
    double sum = salesArray[0];

    for (int i = 2; i <= 12; i++)
    {
      System.out.println("Week " + i + ": ");
      salesArray[i-1] = scnr.nextDouble();

      if (salesArray[i-1] > salesArray[maxIndex])
          maxIndex = i-1;
      else if (salesArray[i-1] < salesArray[lowIndex])
          lowIndex = i-1;

      sum += salesArray[i-1];
    }

    maxIndex++;
    lowIndex++;

    double average = sum/12;

    System.out.println("Name: " + name);
    System.out.println("Experience: " + companyAge + " years");
    System.out.print("\n\nResults: ");
    System.out.println("\nHighest Sale: " + salesArray[maxIndex-1] + " on week " + maxIndex);
    System.out.println("Lowest Sale: " + salesArray[lowIndex-1] + " on week " + lowIndex);
    System.out.println("Average Sales: " + average);
    System.out.print("Weeks that exceed average: ");

    for (int i = 0; i < 12; i++)
    {
      if (salesArray[i] > average)
      System.out.print(" Week " + (i+1));
    }
  }
}
