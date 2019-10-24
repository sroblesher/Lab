import java.util.Scanner;

public class lab4_Robles {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int countTesters = 1;
    int testTakers;
    int countScore = 0;
    int countSuperior = 0;
    int countGenius = 0;
    int countNormal = 0;
    int countBelow = 0;
    int score;
    float average;

    System.out.println("IQ range    |  IQ Classification");
    System.out.println("140 & Above | Genius");
    System.out.println("110 - 139   | Superior Intelligence");
    System.out.println("80 - 109    | Normal");
    System.out.println("79 & Below  | Border-line deficiency");
    System.out.println("");//Just in case

    System.out.println("Enter number of test-takers: ");
    testTakers = scnr.nextInt();

    while (testTakers == 0 )
    {
        System.out.println("We can't show you any data with 0 test-takers");
        System.out.println("Enter number of test-takers: ");
        countTesters = scnr.nextInt();
    }


      while (countTesters <= testTakers){

        score = 0;
        System.out.printf("For test taker %d enter IQ score: ", countTesters);
        score = scnr.nextInt();

        while (score < 0 )
        {
          System.out.println("You entered an ivalid input.");
          System.out.printf("For test taker %d enter IQ score: ", countTesters);
          score = scnr.nextInt();
        }

        countScore += score; //aqui

        if (score > 139)
        {
          countGenius++;
        }
        else if(score > 109)
        {
          countSuperior++;
        }
        else if(score > 79)
        {
          countNormal++;
        }
        else
        {
          countBelow++;
        }

        countTesters++;
    }

    average = countScore / testTakers;

    System.out.printf("\nThe IQ score average is: %.2f \n", average);
    System.out.printf("\nToday's histogram is: \n");
    System.out.printf("Genius: ");

    while (countGenius > 0)
    {
      System.out.printf("*");
      countGenius--;
    }
    System.out.printf("\nSuperior: ");

    while (countSuperior > 0)
    {
      System.out.printf("*");
      countSuperior--;
    }
    System.out.printf("\nNormal: ");

    while (countNormal > 0)
    {
      System.out.printf("*");
      countNormal--;
    }
    System.out.printf("\nBorder-line Deficiency: ");

    while (countBelow > 0)
    {
      System.out.printf("*");
      countBelow--;
    }

    System.out.printf("\n");
  }
}
