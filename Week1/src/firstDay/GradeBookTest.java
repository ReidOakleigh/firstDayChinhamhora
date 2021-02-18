package firstDay;

import java.util.Scanner;

public class GradeBookTest {
// Rumbi Chinhamhora
// Declare a Scanner object
    Scanner in;

   
    public static void main( String[] args ) {
        new GradeBookTest().go();
    }

    private void go() {
        GradeBook gradebook = new GradeBook();
        in = new Scanner(System.in);
        int noScores = promptInt("How many scores would you like to enter? ");
        for ( int i = 0; i < noScores; i++ ) {
            int score = promptInt("Enter a score: ");
            gradebook.addGrade(score);
        }
        System.out.println("\nScore -------- Grade");
        for (Grade grade : gradebook.getGrades()) {
            System.out.printf("%4d  --------   %s\n", grade.getGrade(), grade.getLetter());
        }
    }

    /**
     * Prompts for an integer
     * @param prompt : String
     * @return : int
     */
    private int promptInt(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
}
