
public class Main {

	public static void main(String[] args) {
		Pokemon first; // Deklariert
		first = new Pokemon("Glumanda",Type.FIRE);
		first.show();
		// Setze neue Werte
		first.set_name("Glurak");
		first.set_Type(Type.Poisen);
		first.show();
		Pokemon sec = new Pokemon("Bisasam",Type.Poisen);
		
		String _first = first.toString();
		String _sec = sec.toString();
		System.out.println(_first);
		System.out.println(_sec);
	}

}
