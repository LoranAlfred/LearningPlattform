package tasksheet6;

import java.util.StringJoiner;


/**
 * This class represents a team.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class Team {

    private String teamName;

    private String status;

    private TeamMember[] team;

    /**
     * Constructor.
     *
     * @param teamName The team name to set.
     * @since 1.0
     */
    public Team ( String teamName ) {
        this.teamName = teamName;
        this.team = new TeamMember[ 0 ];
        this.status = "No team";
    }

    /**
     * Adds a {@link TeamMember} to the {@link Team}.
     *
     * @param teamMemberToAdd The {@link TeamMember} to add.
     * @since 1.0
     */
    public void addTeamMemberToTeam ( TeamMember teamMemberToAdd ) {
        int currentAmountOfTeamMembers = determineAmountOfTeamMembers ();

        if ( currentAmountOfTeamMembers == 0 ) {
            this.team = new TeamMember[ 6 ];
            this.team[ 0 ] = teamMemberToAdd;
            currentAmountOfTeamMembers = determineAmountOfTeamMembers ();
        } else if ( currentAmountOfTeamMembers > 0 && currentAmountOfTeamMembers < 5 ) {
            addTeamMemberToTeamMemberArray ( teamMemberToAdd );
            currentAmountOfTeamMembers = determineAmountOfTeamMembers ();
        } else if ( currentAmountOfTeamMembers >= 5 ) {
            enlargeTeamArray ( teamMemberToAdd );
            currentAmountOfTeamMembers = determineAmountOfTeamMembers ();
        }
        changeTeamStatus ( currentAmountOfTeamMembers );
    }

    /**
     * Determines the amount of {@link TeamMember}s.
     *
     * @return The amount of {@link TeamMember}s.
     * @since 1.0
     */
    private int determineAmountOfTeamMembers () {
        int amountOfTeamMembers = 0;
        for ( int currentTeamMemberIndex = 0; currentTeamMemberIndex < team.length; currentTeamMemberIndex++ ) {
            if ( team[ currentTeamMemberIndex ] != null ) {
                ++amountOfTeamMembers;
            }
        }
        return amountOfTeamMembers;
    }

    /**
     * Adds the {@link TeamMember} to the new array.
     *
     * @param teamMemberToAdd The {@link TeamMember} to add.
     * @since 1.0
     */
    private void addTeamMemberToTeamMemberArray ( TeamMember teamMemberToAdd ) {
        for ( int currentTeamMemberIndex = 0; currentTeamMemberIndex < team.length; currentTeamMemberIndex++ ) {
            if ( team[ currentTeamMemberIndex ] == null ) {
                team[ currentTeamMemberIndex ] = teamMemberToAdd;
                return;
            }
        }
    }

    /**
     * Enlarges the team array and copies the old values into the new generated one.
     *
     * @param teamMemberToAdd The {@link TeamMember} to add
     * @since 1.0
     */
    private void enlargeTeamArray ( TeamMember teamMemberToAdd ) {
        TeamMember[] newTeamArray = new TeamMember[ team.length + 1 ];
        for ( int currentTeamMemberIndex = 0; currentTeamMemberIndex < team.length; currentTeamMemberIndex++ ) {
            newTeamArray[ currentTeamMemberIndex ] = team[ currentTeamMemberIndex ];
        }
        this.team = newTeamArray;

        addTeamMemberToTeamMemberArray ( teamMemberToAdd );
    }

    /**
     * Changing team status.
     *
     * @param amountOfTeamMembers The amount of {@link TeamMember}s to set.
     * @since 1.0
     */
    private void changeTeamStatus ( int amountOfTeamMembers ) {
        if ( amountOfTeamMembers > 0 && amountOfTeamMembers < 5 ) {
            setStatus ( "To few to be a SCRUM team !" );
        } else if ( amountOfTeamMembers == 5 ) {
            setStatus ( "Minimum size of a SCRUM team reached." );
        } else if ( amountOfTeamMembers > 5 && amountOfTeamMembers <= 9 ) {
            setStatus ( "Perfect size of a SCRUM team." );
        } else if ( amountOfTeamMembers > 9 ) {
            setStatus ( "Too much members for a scrum team." );
        }
    }

    public String getTeamName () {
        return teamName;
    }

    public void setTeamName ( String teamName ) {
        this.teamName = teamName;
    }

    public String getStatus () {
        return status;
    }

    private void setStatus ( String status ) {
        this.status = status;
    }

    /**
     * Returns the values of the object.
     *
     * @return The values of the object.
     * @since 1.0
     */
    @Override
    public String toString () {
        StringJoiner stringJoiner = new StringJoiner ( "" );
        stringJoiner.add ( "The team " ).add ( this.teamName ).add ( " contains this team members: \n" );
        stringJoiner.add ( "The team has " ).add ( "" + determineAmountOfTeamMembers () ).add ( " team members.\n" );
        for ( int currentTeamMemberIndex = 0; currentTeamMemberIndex < team.length; currentTeamMemberIndex++ ) {
            if ( team[ currentTeamMemberIndex ] != null ) {
                stringJoiner.add ( team[ currentTeamMemberIndex ].toString () ).add ( "\n" );
            }
        }
        stringJoiner.add ( "\nThe status of the team is:\n" ).add ( getStatus () );
        stringJoiner.add ( "\n\nThe total salary of the team is: " ).add ( "" + determineTotalSalaryOfTeam () ).add ( " €." );

        return stringJoiner.toString ();
    }

    /**
     * Determines the total salary of the team.
     *
     * @return The total salary of the team.
     * @since 1.0
     */
    private float determineTotalSalaryOfTeam () {
        float totalSalaryOfTeam = 0;
        for ( int currentTeamMemberIndex = 0; currentTeamMemberIndex < team.length; currentTeamMemberIndex++ ) {
            if ( team[ currentTeamMemberIndex ] != null ) {
                totalSalaryOfTeam += team[ currentTeamMemberIndex ].getSalary ();
            }
        }
        return totalSalaryOfTeam;
    }
}
