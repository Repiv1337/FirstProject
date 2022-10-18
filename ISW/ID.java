import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class ID {

	@Test
	void test() {
		int i=1;
		while(i<=100){
			int desiredLength =15;
			String random = UUID.randomUUID() .toString().substring(0, desiredLength);
			Pokemon te = new Pokemon(random,Type.FIRE);
			i++;
		}
		Pokemon show = new Pokemon("GG",Type.WATER);
		assertEquals(i,show.ID);
		
	
	}

}
