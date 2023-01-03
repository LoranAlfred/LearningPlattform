package tasksheet1;

/**
 * This class is the class for task TestGrade.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class TestGrade {

    /**
     * Run method.
     *
     * @param args The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] args ) {
        int testScore = 85;
        char grade;

        if ( testScore >= 95 ) {
            grade = 'A';
        } else if ( testScore >= 80 ) {
            grade = 'B';
        } else if ( testScore >= 70 ) {
            grade = 'C';
        } else if ( testScore >= 60 ) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println ("Yor grade is : " + grade);
    }
}