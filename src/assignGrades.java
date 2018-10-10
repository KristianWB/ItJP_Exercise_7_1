import java.util.Scanner;

//////////////   Introduction to Java Programming v.11   //////////////
                //////////  Chapter 7   //////////
                  /////   Exercise 7.1    /////
                        /// 10-10-2018///
                          // - WITT - //

public class assignGrades {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // char[] grades = {'A', 'B', 'C', 'D', 'F'};  // Setting up array for allocating grades

        System.out.print("Please enter the number for the best possible score: ");  // Prompting for user to type the best score
        int bestScore = input.nextInt(); // The best (highest) score

        System.out.print("Please enter number of students: "); // User needs to define how many students are taking the test
        int students = input.nextInt();  // Number of students
        int[] scores = new int[students]; // Declaring and assigning an array for scores based upon number of students

        // Next we need to make a for loop which will prompt the user to enter score for each student
        for (int i = 0 ; i < scores.length  ; i++)   {
            System.out.print("Please enter score: "); // Prompting the user
            scores[i] = input.nextInt();    // The score gets allocated to the corresponding array location
        }


        for ( int j = 0 ; j < scores.length ; j++ )   {
            if (scores[j] >= bestScore - 5)
                System.out.println(
                        "Student number " + (j + 1) + ": Score is: " + scores[j] + ": and grade is: " + 'A');
            else if (scores[j] >= bestScore - 10)
                System.out.println(
                    "Student number " + (j + 1) + ": Score is: " + scores[j] + ": and grade is: " + 'B');
            else if (scores[j] >= bestScore - 15)
                System.out.println(
                        "Student number " + (j + 1) + ": Score is:  " + scores[j] + ": and grade is: " + 'C');
            else if (scores[j] >= bestScore - 20)
                System.out.println(
                        "Student number is: " + (j + 1) + " Score is: " + scores[j] + ": and grade is: " + 'D');
            else
                System.out.println(
                        "Student number is: " + (j + 1) + ": Score is: " + scores[j] + ": and grade is: " + 'F');
            }


    }
}
