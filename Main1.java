abstract class FootballPlayer {
    private String name;
    private int goals;
    private double monthlySalary;

    public FootballPlayer(String name, int goals, double monthlySalary) {
        this.name = name;
        this.goals = goals;
        this.monthlySalary = monthlySalary;
    }

    public String getName() { return name; }
    public int getGoals() { return goals; }

    public abstract double calculateGoalRate(int matchesPlayed);
}

class LaLigaPlayer extends FootballPlayer {
    private String league = "LaLiga";

    public LaLigaPlayer(String name, int goals, double monthlySalary) {
        super(name, goals, monthlySalary);
    }

    @Override
    public double calculateGoalRate(int matchesPlayed) {
        return ((double) getGoals() / matchesPlayed) + 1;
    }

    public void displayDetails(int matches) {
        System.out.println("Player: " + getName());
        System.out.println("League: " + league);
        System.out.println("Goals: " + getGoals());
        System.out.println("Goal Rate: " + calculateGoalRate(matches));
        System.out.println("---------------------------");
    }
}

class PremierLeaguePlayer extends FootballPlayer {
    private String league = "Premier League";

    public PremierLeaguePlayer(String name, int goals, double monthlySalary) {
        super(name, goals, monthlySalary);
    }

    @Override
    public double calculateGoalRate(int matchesPlayed) {
        return ((double) getGoals() / matchesPlayed) + 1;
    }

    public void displayDetails(int matches) {
        System.out.println("Player: " + getName());
        System.out.println("League: " + league);
        System.out.println("Goals: " + getGoals());
        System.out.println("Goal Rate: " + calculateGoalRate(matches));
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        LaLigaPlayer messi = new LaLigaPlayer("Messi", 800, 5000000);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Ronaldo", 850, 4500000);

        messi.displayDetails(100);
        ronaldo.displayDetails(100);
    }
}
