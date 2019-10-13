package lotr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Party> parties = initialize();
		
		List<Party> l1 = new ArrayList<Party>();
		List<Party> l2 = new ArrayList<Party>();
		
		// TODO Récuperer les groupes contenant au moins une femme. #girlpower
		/*l1 = parties.stream().filter(p -> {
			for(Character c : p.getMembers()) {
				if (c.getGender() == Gender.FEMALE) {
					return true;
				}
			}
			return false;
		}).collect(Collectors.toList());*/
		
		l1 = parties.stream()
				.filter(p -> p.getMembers().stream()
						.filter(c -> c.getGender().equals(Gender.FEMALE))
						.count()>0)
				.collect(Collectors.toList());
		
		// TODO Récuperer les groupes dont la taille totale ne depasse pas 600cm.
		
		l2 = parties.stream()
				.filter(g -> g.getMembers().stream()
						.map(m -> m.getHeight()).reduce(0, (a,b) -> a+b) > 600)
				.collect(Collectors.toList());
				
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
