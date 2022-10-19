import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class PokemonTest {

	@Test
	void test() {
		int index_for_ID_testing  =1;
		int index_for_Name_testing=1;
		int index_for_setMethod   =1;
		while(index_for_ID_testing<=100){
			int desiredLength =15;
			String random = UUID.randomUUID() .toString().substring(0, desiredLength);
			String rot = "rot";
			Pokemon te = new Pokemon(random,Type.FIRE);
			if(random.equals(te.get_name())) {
				index_for_Name_testing++;
			}
			index_for_ID_testing++;
			te.set_name(rot);
			te.set_Type(Type.Poisen);
			if(rot.equals(te.get_name()) && Type.Poisen == te.get_type()) {
				
				index_for_setMethod++;
			}
		}
		
		Pokemon show = new Pokemon("",Type.WATER);
		System.out.println("Pruefe ID");
		assertEquals(index_for_ID_testing-1,show.ID);
		System.out.println("Es wurden genau 101 ID's generiert, OK \n");
		System.out.println("Pruefe get_name");
		assertEquals(index_for_ID_testing,index_for_Name_testing);  
		System.out.println("Es wurden genau 101 Namen generiert, OK \n ");
		
		Type test = Type.WATER;
		Pokemon TypeTest = new Pokemon("ISW rocks",test);
		System.out.println("Testing get_type");
		assertEquals(test,TypeTest.get_type());
		System.out.println("get Type liefer richtigen Typen zurueck, OK \n");
		System.out.println("Testing set_Name und set_Type");
		
		assertEquals(index_for_setMethod,index_for_ID_testing);
		System.out.println("set_name und set_type konnte durchlaufen, OK");
	}

}
