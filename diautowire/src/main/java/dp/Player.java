package dp;

public class Player {
	public Player() {
		System.out.println("Player class called");
	}
	private Team team;
	
	public void setTeam(Team team) {
		this.team=team;
	}
	
	public void getTeam() {
		System.out.println("employee.getTeam() called");
		team.showTeam();
	}

}
