package firstDay;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program GradeBook
 * @author Rumbi Chinhamhora
 * @date Jan 25, 2021
 */
public class GradeBook {
    // data members
    private String testName;
    private List<Grade> grades;

    /**
     * Create an empty Gradebook
     */
    public GradeBook() {
        this.grades = new ArrayList<>();
    }

    /**
     * Create a new GradeBook
     * @param testName : String
     * @param grades : List<Grade>
     */
    public GradeBook( String testName, List<Grade> grades ) {
        this.testName = testName;
        this.grades = grades;
        for ( int i = 0; i < grades.size(); i++ ) {
            int grade = grades.get(i).getGrade();
            grades.set(i, new Grade(grade, setLetterGrade(grade)));
        }
    }

    /**
     * Returns the testName
     * @return testName : String
     */
    public String getTestName() {
        return testName;
    }

    /**
     * Sets the testName
     * @param testName : String
     */
    public void setTestName( String testName ) {
        this.testName = testName;
    }

    /**
     * Returns the grades
     * @return grades : List<Grade>
     */
    public List<Grade> getGrades() {
        return grades;
    }

    /**
     * Sets the grades
     * @param grades : List<Grade>
     */
    public void setGrades( List<Grade> grades ) {
        this.grades = grades;
    }

    /**
     * Adds a grade object to the list
     * @param grade : int
     * @return void
     */
    public void addGrade( int grade ) {
        grades.add(new Grade(grade, setLetterGrade(grade)));
    }

    /**
     * Determines a letter grade for a numeric grade
     * @param score : int
     * @return letterGrade char
     */
    private char setLetterGrade( int score ) {
        char letterGrade;
        if ( score >= 90 ) letterGrade = 'A';
        else if ( score >= 80 ) letterGrade = 'B';
        else if ( score >= 70 ) letterGrade = 'C';
        else if ( score >= 60 ) letterGrade = 'D';
        else letterGrade = 'F';
        return letterGrade;
    }
}

class Grade {
    // data members
    private int grade;
    private char letter;

    /**
     * Creates a Grade object
     * @param grade : int
     * @param letter : char
     */
    public Grade( int grade, char letter ) {
        this.grade = grade;
        this.letter = letter;
    }

    /**
     * Returns the numeric grade
     * @return grade : int
     */
    public int getGrade() {
        return grade;
    }
    /**
     * Sets the numeric grade
     * @param grade : int
     */
    public void setGrade(int grade) {this.grade = grade; }

    /**
     * Returns the letter grade
     * @return letter : char
     */
    public char getLetter() {
        return letter;
    }

    /**
     * Sets the letter grade
     * @param c : char
     */
    public void setLetter(char c) { letter = c; }
}

