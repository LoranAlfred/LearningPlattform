package tasksheet11;

import tasksheet11.lecture.Lecture;
import tasksheet11.professor.Professor;
import tasksheet11.student.Student;


/**
 * Sample class to run the program.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class UniversityMain {

    /**
     * Main method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        Student firstStudent = new Student ( "Leonardo", "Turtle", "Underground", 1, "12345", "New York" );
        Student secondStudent = new Student ( "Donatello", "Turtle", "Underground", 1, "12345", "New York" );

        Professor professor = new Professor ( "Sensei", "Splinter", "Underground", 1, "12345", "New York" );

        Lecture ninjaLesson = new Lecture ( "High ninja lesson", professor );

        ninjaLesson.addStudentToLecture ( firstStudent );
        ninjaLesson.addStudentToLecture ( secondStudent );

        System.out.println ( ninjaLesson );
    }
}
