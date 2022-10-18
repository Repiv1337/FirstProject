import java.util.UUID;

public class Poketest {

	public static boolean check_name() { //Testet ob bei Zufällig generierten Namen Generierter String den Pokemon namen gleicht
		for(int i=0;i<100;i++){
			int desiredLength = 5;
			String random = UUID.randomUUID() .toString().substring(0, desiredLength);
			Pokemon te = new Pokemon(random,Type.FIRE);
			if(random.equals(te.get_name())) {
				continue;
			}
			return false;
			
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("testing name first");
		if(check_name()){
			System.out.println("Worked");
		}
		
		System.out.println("Testing ID");
		Pokemon ID = new Pokemon("Glurak",Type.FIRE);
		ID.dID();
		System.out.println("ID folgt der Annahme das 100 Pokeom generiert wurden");
		
		
	}

}
