package Lab2;
public class ClubTest {
    public static void main(String[] args) {
        SportsClub sc = new SportsClub("Badminton", 5);
        sc.addMember(5);
        System.out.println("Sports Club Name: " + sc.getName());
        sc.changeName("Tennis");
        System.out.println("Sports Club Name after change: " + sc.getName());
        System.out.println("Sports Club Budget: " + sc.determineBudget());
        MarketingClub mc = new MarketingClub("Advertising", 10, 1500);
        System.out.println("Marketing Club Budget (budget > 1000): " + mc.determineBudget());
        System.out.println("Use budget 600: " + mc.useBudget(600));
        System.out.println("Use budget 1000: " + mc.useBudget(1000));
        System.out.println("Marketing Club Budget after use: " + mc.determineBudget());
    }
}
