abstract class FootballPlayer {
    private String name;
    private int goals;
    private double monthlySalary;

    public FootballPlayer(String name, int goals, double monthlySalary) {
        this.name = name;
        this.goals = goals;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public abstract double calculateGoalRate(int matchesPlayed);
}

class LaLigaPlayer extends FootballPlayer {
    String league = "LaLiga";

    public LaLigaPlayer(String name, int goals, double monthlySalary) {
        super(name, goals, monthlySalary);
    }

    public double calculateGoalRate(int matchesPlayed) {
        return ((double) getGoals() / matchesPlayed) + 1;
    }

    public void printInfo(int matches) {
        System.out.println("Name: " + getName());
        System.out.println("League: " + league);
        System.out.println("Goals: " + getGoals());
        System.out.println("Goal Rate: " + calculateGoalRate(matches));
        System.out.println();
    }
}

class PremierLeaguePlayer extends FootballPlayer {
    String league = "Premier League";

    public PremierLeaguePlayer(String name, int goals, double monthlySalary) {
        super(name, goals, monthlySalary);
    }

    public double calculateGoalRate(int matchesPlayed) {
        return ((double) getGoals() / matchesPlayed) + 1;
    }

    public void printInfo(int matches) {
        System.out.println("Name: " + getName());
        System.out.println("League: " + league);
        System.out.println("Goals: " + getGoals());
        System.out.println("Goal Rate: " + calculateGoalRate(matches));
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LaLigaPlayer messi = new LaLigaPlayer("Messi", 800, 50000);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Ronaldo", 850, 60000);

        messi.printInfo(100);
        ronaldo.printInfo(100);
    }
}
