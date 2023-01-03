package tasksheet5;

import java.util.StringJoiner;


public class Actor {

    private String firstName;

    private String lastName;

    private int age;

    private boolean actorIsHired = false;

    /**
     * Constructor.
     *
     * @param firstName The first name to set.
     * @param lastName  The last name to set.
     * @param age       The age to set.
     * @since 1.0
     */
    public Actor ( String firstName, String lastName, int age ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public boolean actorIsHired () {
        return actorIsHired;
    }

    public void actorIsHired ( boolean actorIsHired ) {
        this.actorIsHired = actorIsHired;
    }

    /**
     * Returns the values of the object
     *
     * @return The values of the object.
     * @since 1.0
     */
    @Override
    public String toString () {
        StringJoiner stringJoiner = new StringJoiner ( "" );
        stringJoiner.add ( "Actor: " ).add ( this.firstName ).add ( " " ).add ( this.lastName ).add ( " Age: " + this.age );
        stringJoiner.add ( "\nThe actor is hired: " ).add ( "" + actorIsHired );
        return stringJoiner.toString ();
    }
}
