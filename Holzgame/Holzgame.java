import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;








 
public class Holzgame {
	
	
	public static void start(Region reg) throws FindFailed, InterruptedException {
		reg.find("C:/Users/siebe/eclipse-workspace/Spammer/beloh.JPG");
		reg.click("C:/Users/siebe/eclipse-workspace/Spammer/beloh.JPG");
		Thread.sleep(500);
		reg.find("C:/Users/siebe/eclipse-workspace/Spammer/lvl5.JPG");
		reg.click("C:/Users/siebe/eclipse-workspace/Spammer/lvl5.JPG");
		Thread.sleep(500);
		reg.find("C:/Users/siebe/eclipse-workspace/Spammer/try.JPG");
		reg.click("C:/Users/siebe/eclipse-workspace/Spammer/try.JPG");
		Thread.sleep(500);
		reg.find("C:/Users/siebe/eclipse-workspace/Spammer/start.JPG");
		reg.click("C:/Users/siebe/eclipse-workspace/Spammer/start.JPG");
	}


	
	public static void main(String args[]) throws AWTException, InterruptedException, FindFailed {
		Region reg = new Region(730,550,450,300);
		Robot rob = new Robot();
		
		while(true) {
			if(rob.getPixelColor(899,362).getRed()==29) {
				Thread.sleep(5000);
			}
		
			
			Color c = rob.getPixelColor(898,564);
			Color cd = rob.getPixelColor(897,672);
			Color cde = rob.getPixelColor(1071,598);
			
			if(c.getRed()>180 && c.getBlue()<80) {
				 rob.keyPress(KeyEvent.VK_LEFT);
				 Thread.sleep(30);
				 rob.keyRelease(KeyEvent.VK_LEFT);
				 Thread.sleep(270);
				 
				 
				
				 
			}
			if(cd.getRed()>180 && cd.getBlue()<80) {
				 rob.keyPress(KeyEvent.VK_RIGHT);
				 Thread.sleep(30);
				 rob.keyRelease(KeyEvent.VK_RIGHT); 
				 Thread.sleep(270);
				
				
			}
			
			if(cde.getRed()==150 && cde.getGreen()==87) {
				start(reg);
			}
			
			
			}
		}
	}

	