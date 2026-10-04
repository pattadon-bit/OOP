package Lab3;
public class ClubManagingSystemTest {
    public static void main(String[] args) {
        Club[] clubs = new Club[4];
        clubs[0] = new Club("Student", 200);
        clubs[1] = new SportsClub("Football", 40);
        clubs[2] = new ESportsClub("RoV", 5);
        clubs[3] = new MarketingClub("Advertising", 10, 100);

        ClubManagingSystem cms = new ClubManagingSystem(clubs);

        System.out.println("Test getHighestMemberClub():");
        Club highest = cms.getHighestMemberClub();
        System.out.println("Club Name: " + highest.getName() + ", Members: " + highest.numMember);

        System.out.println("\nTest determineAllBudget():");
        System.out.println("Total Budget: " + cms.determineAllBudget());

        System.out.println("\nTest getAllMembers():");
        System.out.println("Total Members: " + cms.getAllMembers());
    }
}