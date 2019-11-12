import java.util.Scanner;

public class Lab9_Robles {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        boolean Continue = true;    //Helps to continue game
        String yesOrNo;     //User's decision about playing again
        int function;   //Function chose

        while (Continue){   //Game
            System.out.println("Calculator functions");
            System.out.println("\t1. Convert to Binary");
            System.out.println("\t2. Digit counter");
            System.out.println("\t3. Power function");
            System.out.println("\t4. Print Descending");
            System.out.println("Enter number of function: ");

            do {
                function = scnr.nextInt();
            } while (function < 1 || function > 4);

            if (function == 1)
            {
                System.out.println("Enter number you want to convert to binary: ");
                int a = scnr.nextInt();
                System.out.println("Result using recursion: " + binary(a));
                System.out.println("Result using Loops: " + binaryLoop(a));
            }
            else if (function == 2)
            {
                System.out.println("Enter number you want to get the sum of its digits: ");
                int b = scnr .nextInt();
                System.out.println("Result using recursion: " + DigitCount(b));
                System.out.println("Result using Loops: " + DigitCountLoop(b));
            }
            else if (function == 3)
            {
                System.out.println("Enter the base number: ");
                int c = scnr.nextInt();
                System.out.println("Enter the power: ");
                int d = scnr.nextInt();
                System.out.println("Result using recursion: " + power(c,d));
                System.out.println("Result using Loops: " + powerLoop(c,d));
            }
            else // Don't need function == 4
            {
                System.out.println("Enter number you want to descend from:");
                int e = scnr.nextInt();
                System.out.println("Result using recursion: ");
                descend(e);
                System.out.println("\nResult using Loops: ");
                descendLoop(e);
            }


            System.out.println("\nDo you want to continue using the calculator?(yes/no)");
            do {
                yesOrNo = scnr.nextLine();
            } while (!yesOrNo.equals("yes") && !yesOrNo.equals("no"));  //Until valid answer

            if (yesOrNo.equals("no"))       //Ends while loop and game
                Continue = false;
        }

        System.out.println("\nThank you for using the calculator!!!!");
    }

    public static int binary (int n){
        if (n == 0)
            return 0;
        return (n%2) + 10*(binary(n/2));
    }

    public static int DigitCount (int n){
        if (n < 10)
            return n;
        return (n % 10) + DigitCount(n/10);
    }

    public static int power (int n, int m){
        if (m == 1)
            return n;
        return n * power(n, m-1);
    }

    public static void descend (int n){
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        descend(n-1);
    }

    public static int binaryLoop (int n){
        int number = 0;
        int count = 1;

        while(n != 0)
        {
            int a = 1;

            for (int i = 1; i < count; i++)
                    a *= 10;

            number += a * (n%2);

            n /= 2;
            count++;
        }

        return number;
    }

    public static int DigitCountLoop (int n){
        int number = 0;
        while (n > 0)
        {
            number += n%10;
            n /= 10;
        }
        return number;
    }

    public static int powerLoop (int n, int m){
        int number = 1;
        for (int i = 0; i  < m; i++)
        {
            number *= n;
        }
        return number;

    }

    public static void descendLoop (int n){
      while (n > 0 )
      {
          System.out.print(n + " ");
          n--;
      }

    }
}