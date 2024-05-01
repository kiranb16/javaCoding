package Java8Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Player{
	String name;
	int score;
	String type;
	public Player() {
		
	}
	public Player(String name, int score, String type) {
		super();
		this.name = name;
		this.score = score;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", type=" + type + "]";
	}
	
	
	
}
public class Team {
 public static void main(String[] args) {
	List<Player> list= new ArrayList<>();
	list.add(new Player("abc", 60, "batsman"));
	list.add(new Player("efg", 70, "batsman"));
	list.add(new Player("mno", 20, "bowler"));
	list.add(new Player("pqr", 10, "bowler"));
	
	Map<String, Long> players=list.stream()
			.collect(Collectors.groupingBy(Player::getType, Collectors.counting()));
	System.out.println(players);
	System.out.println("total score");
	int score=list.stream().mapToInt(Player::getScore).reduce(0, (a,b)->a+b);
	System.out.println(score);
}
}
