import java.util.*;

public class Lab8_Robles {
    public static void main(String[] args) {

        List<Integer> available = new ArrayList<Integer>(); //Displays all available numbers
        Scanner scnr = new Scanner(System.in);
        int count = 0;
        int xCoord;   //Represents horizontal value
        int yCoord;   //Represents vertical value
        int badCount = 0;   //Counts number of columns and rows
        int tryAgain = 0;   //If it changes to 1, then exits while loop and finishes the game
        String yesOrNo;     //Let's you know if the user wants to continue

        while (tryAgain == 0) { //MAIN WHILE LOOP
            int[][] array = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};  //Initial arrays of Zeros
            for (int i = 1; i < 10; i++)    //Adds all digits to the list (available numbers)
                available.add(i);

            System.out.println("Welcome!\n");
            System.out.println("Solve the Magic Square.");

            while (count != 9) {        //Continues until user places all digits in place
                for (int i = 0; i < 3; i++) {   //Display updated matrix
                    System.out.print(i + 1 + "| ");
                    for (int j = 0; j < 3; j++)
                        System.out.print(array[i][j] + " ");
                    System.out.println();
                }
                System.out.println("   1 2 3");
                System.out.println("\nAvailable numbers: ");

                for (int i = 0; i < available.size() - 1; i++)
                    System.out.print(available.get(i) + ", ");
                System.out.print(available.get(available.size() - 1) + "\n");//Displays available numbers

                System.out.println("Choose a number: ");
                int replace = scnr.nextInt();
                while (!available.contains(replace)) {      //Until user enters a correct number
                    System.out.println("Choose a number from the available numbers: ");
                    replace = scnr.nextInt();
                }

                do {
                    System.out.println("X coordinate: ");
                    do {
                        xCoord = scnr.nextInt();
                    }
                    while (xCoord != 1 && xCoord != 2 && xCoord != 3);  //Until correct column is selected

                    System.out.println("Y coordinate: ");
                    do {
                        yCoord = scnr.nextInt();
                    } while (yCoord != 1 && yCoord != 2 && yCoord != 3); //Until correct row is selected
                } while (array[yCoord - 1][xCoord - 1] != 0);       //Until row and column is not already taken

                array[yCoord - 1][xCoord - 1] = replace;
                available.remove(new Integer(replace));  //Remove selected number from available numbers

                count++;
            }

            for (int i = 0; i < 3; i++) { //Sum of rows
                int sum = 0;
                for (int j = 0; j < 3; j++)
                    sum += array[i][j];
                if (sum != 15)
                    badCount++; //If not 15, wrong answer!!!
            }

            for (int i = 0; i < 3; i++) {  //Sum of columns
                int sum = 0;
                for (int j = 0; j < 3; j++)
                    sum += array[j][i];
                if (sum != 15)
                    badCount++; //If not 15, wrong answer
            }

            int diagonal = 15;
            for (int i = 0; i < 3; i++) //Diagonal 1
                diagonal -= array[i][i];
            if (diagonal != 0)
                badCount++;

            diagonal = 15;
            for (int i = 0; i < 3; i++) //Diagonal 2
                diagonal -= array[i][2 - i];
            if (diagonal != 0)
                badCount++;

            if (badCount == 0)
                System.out.println("***Congratulations, you solved the puzzle!!***");
            else
                System.out.println("***Sorry, try again.***");

            System.out.println("Do you want to play again?(yes/no)");
            do {
                yesOrNo = scnr.nextLine();
            } while (!yesOrNo.equals("yes") && !yesOrNo.equals("no"));    //Takes user answer

            if (yesOrNo.equals("no"))
                tryAgain = 1;   //Setting it to 1 makes the while loop exit and finish the program

            count = 0;

        }
    }
}
