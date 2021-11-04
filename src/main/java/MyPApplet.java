import nl.benmens.processing.SharedPApplet;
import nl.benmens.processing.PApplet;

public class MyPApplet extends PApplet {

	PApplet applet = this;

	public void settings() {
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
	}

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
