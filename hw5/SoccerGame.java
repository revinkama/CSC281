package hw5;

// Kevin Rama
// No Collaborators

public class SoccerGame {
	
	private String team1, team2;
	private int team1Score, team2Score;
	
	private final int MIN_SCORE = 0;
	
	private static int totalGames = 0;
	private static int totalScore = 0;
	private static double avg=0.0;
	
	public SoccerGame() {
		team1="Blaine";
		team2="Hamilton";
		team1Score=MIN_SCORE;
		team2Score=MIN_SCORE;
		totalGames++;
	}
	
	public SoccerGame(String t1, String t2) {
		team1=t1;
		team2=t2;
		team1Score=MIN_SCORE;
		team2Score=MIN_SCORE;
		totalGames++;
	}
	
	public String getTeam1() {
		return team1;
	}
	
	public String getTeam2() {
		return team2;
	}
	
	public boolean incrScore(String team) {
		if(team1.equals(team)){
			team1Score++;
			totalScore++;
			return true;
		}
		else if(team2.equals(team)){
			team2Score++;
			totalScore++;
			return true;
		}
		return false;
	}
	
	public void display() {
		System.out.println("The Current Score is "+ team1+": "+team1Score+", "+team2+": "+team2Score);
	}
	
	public static double getAvg() {
		if(totalGames>0){
			avg=((double)totalScore/totalGames);
			return avg;
		}
		return 0.0;
	}
}
