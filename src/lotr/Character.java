package lotr;

public class Character {
	
	private String name;
	private Gender gender;
	private Race race;
	private int height;
	private boolean good;
	
	public Character(String name, Gender gender, Race race, int height, boolean good) {
		super();
		this.name = name;
		this.gender = gender;
		this.race = race;
		this.height = height;
		this.good = good;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public Race getRace() {
		return race;
	}

	public int getHeight() {
		return height;
	}
	
	
	

}
