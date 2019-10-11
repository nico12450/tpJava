package lotr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Party> parties = initialize();
		
		// TODO Récuperer les groupes contenant au moins une femme. #girlpower
		
		// TODO Récuperer les groupes dont la taille totale ne depasse pas 600cm.
				
		// TODO Récuperer dans une liste de tous les personnages dont la taille est supèrieure à la taille moyenne de leur race.

		// TODO Récupérer les groupes dans lesquels il existe au moins un personnage dont la gentillesse n'est pas en accord avec leur race.
		
	}
	
	private static List<Party> initialize(){
		
		List<Party> parties = new ArrayList<>();
		
		Character gandalf = new Character("Gandalf", Gender.MALE, Race.MAIAR, 230, true);
		Character frodo = new Character("Frodo", Gender.MALE, Race.HOBBIT, 110, true);
		Character sam = new Character("Sam", Gender.MALE, Race.HOBBIT, 110, true);
		Character gimli = new Character("Gimli", Gender.MALE, Race.DWARF, 80, true);
	
		List<Character> fellowshipMembers = Arrays.asList(gandalf,frodo,sam,gimli);
		Party fellowship = new Party("The fellowship of the ring", gandalf, fellowshipMembers);
		parties.add(fellowship);
		
		Character sauron = new Character("Sauron", Gender.MALE, Race.MAIAR, 240, false);
		Character orc1 = new Character("Emile-Louis", Gender.FEMALE, Race.ORC, 160, false);
		Character orc2 = new Character("Guy-Georges", Gender.MALE, Race.ORC, 170, false);
		Character uruk1 = new Character("Giselle", Gender.FEMALE, Race.URUK, 230, false);
	
		List<Character> theBadGuysMembers = Arrays.asList(sauron,orc1,orc2,uruk1);
		Party TheBadGuys = new Party("Sauron's army", sauron, theBadGuysMembers);
		parties.add(TheBadGuys);
		
		return parties;
				
	}

}
