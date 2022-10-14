import java.awt.AWTException;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class spam {
 
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		File f = null;
		BufferedImage img = null;
		try {
			//f = new File("C:/Users/siebe/eclipse-workspace/Spammer/black.jfif"); // Öffnet Bild von Absoluten Adress -> Bild in Workspace speichern
			img = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize())); // nimmt Bildschirm auf 
		} catch (Exception e) {
				
		    e.printStackTrace();
		}
		while(true) {
		Thread.sleep(1000);
		int x2 = (int) MouseInfo.getPointerInfo().getLocation().getX();
		int y2 = (int) MouseInfo.getPointerInfo().getLocation().getY();
		Color c = new Color(img.getRGB(x2,y2)); 
		System.out.println(c);
	

		}
	}
	
 
	}
 
