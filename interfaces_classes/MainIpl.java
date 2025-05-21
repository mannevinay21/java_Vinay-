package interfaces_classes;

interface Team {
    void showTeamName();
}

interface Franchise {
    void showFranchiseOwner();
}

class IPLRules {
    void displayRules() {
        System.out.println("Each team must have a minimum of 7 Indian players.");
    }
}

class IPLTeam extends IPLRules implements Team, Franchise {
    public void showTeamName() {
        System.out.println("Team: Chennai Super Kings");
    }

    public void showFranchiseOwner() {
        System.out.println("Owner: India Cements");
    }

    void showCaptain() {
        System.out.println("Captain: MS Dhoni");
    }
}

public class MainlPL extends IPLTeam {
    public static void main(String[] args) {
        MainlPL ipl = new MainlPL();
        ipl.showTeamName();
        ipl.showFranchiseOwner();
        ipl.displayRules();
        ipl.showCaptain();
    }
}
