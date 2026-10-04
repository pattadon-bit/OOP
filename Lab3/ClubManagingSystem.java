package Lab3;
public class ClubManagingSystem {
    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public int determineAllBudget() {
        int totalBudget = 0;
        for (int i = 0; i < clubList.length; i++) {
            totalBudget += clubList[i].determineBudget();
        }
        return totalBudget;
    }

    public int getAllMembers() {
        int totalMembers = 0;
        for (int i = 0; i < clubList.length; i++) {
            totalMembers += clubList[i].numMember;
        }
        return totalMembers;
    }

    public Club getHighestMemberClub() {
        if (clubList == null || clubList.length == 0) {
            return null;
        }
        Club highest = clubList[0];
        for (int i = 1; i < clubList.length; i++) {
            if (clubList[i].numMember > highest.numMember) {
                highest = clubList[i];
            }
        }
        return highest;
    }
}
