import java.awt.AWTException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;


public class Aimbooster {

	private static void moveTo(final int x1, final int y1, final int x2, final int y2) throws AWTException {
		Robot r = new Robot();
	    int pixelJump = 10;
	    final double xSqu = (x2 - x1) * (x2 - x1);
	    final double ySqu = (y2 - y1) * (y2 - y1);
	    final double lineLength = Math.sqrt(xSqu + ySqu);
	    double dt = 0;
	    while (dt < lineLength) {
	        dt += pixelJump;
	        final double t = dt / lineLength;
	        final int dx = (int) ((1 - t) * x1 + t * x2);
	        final int dy = (int) ((1 - t) * y1 + t * y2);
	        r.mouseMove(dx, dy);
	        r.delay(2); // Increase this number if you need to delay the mouse movement
	    }
	    r.mouseMove(x2, y2);
	}
	   private static boolean isOnScreen(BufferedImage bi){
	        BufferedImage image = null;
	        try {
	            image = new Robot().createScreenCapture(new Rectangle(1800,1400));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        for(int x = 0; x< image.getWidth();x++){
	            for(int y = 0; y< image.getHeight();y++){
	                
	                boolean invalid = false;
	                int k = x,l = y;
	                for(int a = 0;a<bi.getWidth();a++){
	                    l = y;
	                    for(int b = 0;b<bi.getHeight();b++){
	                        if(bi.getRGB(a, b) != image.getRGB(k, l)){
	                            invalid = true;
	                            break;
	                        }
	                        else{
	                            l++;
	                        }
	                    }
	                    if(invalid){
	                        break;
	                    }else{
	                        k++;
	                    }
	                        
	                }
	                
	                if(!invalid){
	                	System.out.println("was found");
	                    return true;
	                }
	            }
	        }
	        return false; //If no image is found
	        
	    }
	 
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		int x = 400;
		int y = 500;
		Thread.sleep(2000);
		Robot rob = new Robot();
		Rectangle rec  = new Rectangle(681,366,600,419);
		int n = 0;
		BufferedImage test = ImageIO.read(new File("C:\\Users\\siebe\\eclipse-workspace\\Spammer\\test.JPG"));
		boolean isOnScreen = isOnScreen(test);
		System.out.println(isOnScreen);
		while(true) {
			
			BufferedImage f= rob.createScreenCapture(rec);
			for(int i=0;i<600;i+=5) {
				for(int j=0;j<419;j+=5) {
			
		
			Color c= new Color(f.getRGB(i,j));
				if(c.getBlue()==195 && c.getRed()==255 && c.getGreen()==219 && Math.abs(i+680-x)>=40) {
					System.out.println("hit");
					/*moveTo(x,y,680+i,366+j);
				    x = 680+i;
				    y = 366+j;*/
					rob.mouseMove(i+680,j+366);
					  rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					  Thread.sleep(10);
					  rob.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					  Thread.sleep(50);
					 
				
				}
		
					
				
			
		}
				System.out.println("row done");
	}
			
			
}
}
}