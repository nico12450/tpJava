package lotr;

public enum Race {
	
	ELF(true, 200, 10),
	HUMAN(true, 170, 70),
	HOBBIT(true, 107, 40),
	DWARF(true, 137,80),
	ENT(true, 400, 2000),
	ORC(false, 140, 80),
	URUK(false, 190, 120),
	MAIAR(false, 250, 200);
	
	private boolean good;
	private int averageHeight;
	private int weight;
	
	
	private Race(boolean good, int averageHeight, int strength) {
		
		this.good = good;
		this.averageHeight = averageHeight;
		this.weight = strength;
		
	}
	
	public int getAverageHeight() {
		return averageHeight;
	}

	public void setAverageHeight(int averageHeight) {
		this.averageHeight = averageHeight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setGood(boolean good) {
		this.good = good;
	}
	
	public boolean isGood() {
		return this.good;
	}
	
	
	
}
