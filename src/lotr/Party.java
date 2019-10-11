package lotr;

import java.util.List;

public class Party {
	
	private String name;
	private Character leader;
	private List<Character> members;
	
	public Party(String name, Character leader, List<Character> members) {
		super();
		this.name = name;
		this.leader = leader;
		this.members = members;
	}

	public String getName() {
		return name;
	}

	public Character getLeader() {
		return leader;
	}

	public List<Character> getMembers() {
		return members;
	}
	
}
