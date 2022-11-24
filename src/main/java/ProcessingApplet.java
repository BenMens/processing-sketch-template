import nl.benmens.processing.PAppletProxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import nl.benmens.processing.PApplet;

public class ProcessingApplet extends PApplet {

	private Logger logger = LogManager.getLogger(ProcessingApplet.class);

	Renderer drawer = new Renderer();

	public void settings() {
		// initialize the bridging logic
		PAppletProxy.setSharedApplet(this);

		logger.info("App started");

		size(800, 600);
	}

	public void setup() {
	}

	public void draw() {
		drawer.doDraw();
	}

	// ####################################################
	// Application startup. Do not change after this lines
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
