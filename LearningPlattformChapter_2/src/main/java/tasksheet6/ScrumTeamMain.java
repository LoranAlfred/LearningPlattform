package tasksheet6;

/**
 * This class is the sample for the task.
 *
 * @author Alfred Loran
 * @version 1.0
 */
public class ScrumTeamMain {

    /**
     * Main method.
     *
     * @param arguments The arguments may set.
     * @since 1.0
     */
    public static void main ( String[] arguments ) {
        Team team = new Team ( "A SCRUM team" );

        TeamMember firstTeamMember = new TeamMember ( "Leonardo", "Turtle", 60457.25f );
        TeamMember secondTeamMember = new TeamMember ( "Donatello", "Turtle", 59648.75f );
        TeamMember thirdTeamMember = new TeamMember ( "Michelangelo", "Turtle", 58874.43f );
        TeamMember fourthTeamMember = new TeamMember ( "Raphael", "Turtle", 57754.69f );
        TeamMember fifthTeamMember = new TeamMember ( "Sensei", "Splinter", 68000.00f );

        System.out.println ( "Output of team before adding a team member." );
        System.out.println ( team );
        System.out.println ();
        System.out.println ( "Output of team after adding a team member." );
        team.addTeamMemberToTeam ( firstTeamMember );
        System.out.println ( team );
        System.out.println ();
        System.out.println ( "Output of team after adding five team members." );
        System.out.println ();
        team.addTeamMemberToTeam ( secondTeamMember );
        team.addTeamMemberToTeam ( thirdTeamMember );
        team.addTeamMemberToTeam ( fourthTeamMember );
        team.addTeamMemberToTeam ( fifthTeamMember );
        System.out.println ( team );
    }
}
