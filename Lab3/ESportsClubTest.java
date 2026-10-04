package Lab3;
public class ESportsClubTest {
    public static void main(String[] args) {
        ESportsClub e = new ESportsClub("Esport", 100);
        System.out.println("=== Object e (ESportsClub) ===");
        System.out.println("clubName: " + e.getName());
        System.out.println("minNumMember: 1");
        System.out.println("numMember: " + e.getNumMember());
        
        System.out.print("advertise(): ");
        e.advertise();
        
        System.out.println("determineBudget(): " + e.determineBudget());
        System.out.println("getName(): " + e.getName());

        System.out.println("\n=== Object c (Club reference to ESportsClub) ===");
        Club c = new ESportsClub("Esport", 100);
        
        System.out.print("advertise(): ");
        c.advertise();
        
        System.out.println("determineBudget(): " + c.determineBudget());
        System.out.println("getName(): " + c.getName());
    }
}