import nl.benmens.processing.SharedPApplet;
import nl.benmens.processing.PApplet;

public class ProcessingApplet extends PApplet {

	public void settings() {
		// initialize the bridging logic
		SharedPApplet.setSharedApplet(this);

		String os = System.getProperty("os.name");
		if (os.equals("Mac OS X")) {
			// Mac OS X only supports the default renderer
			size(800, 600);
		} else {
			size(800, 600, P2D);
		}
	}

	public void setup() {
	}

	public void draw() {
		background(0xffffff);
		fill(0x00000);
		textSize(100);
		text("Hello world!", 100, 150);
	}

	// ####################################################
	// Application startp. Do not change after this lines
	// ####################################################
	static public void main(String[] passedArgs) {
		if (passedArgs != null) {
			PApplet.main(new Object() {
			}.getClass().getEnclosingClass(), passedArgs);
		} else {
			PApplet.main(new Object() {
			}.getClass().getEnclosingClass());
		}
	}
	
}
