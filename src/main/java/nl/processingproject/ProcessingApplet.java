package nl.processingproject;

import nl.benmens.processing.PAppletProxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import nl.benmens.processing.PApplet;

public class ProcessingApplet extends PApplet {

	private Logger logger = LogManager.getLogger(ProcessingApplet.class);

	Renderer appRenderer = new Renderer();

	@Override
	public void settings() {
		// initialize the bridging logic
		PAppletProxy.setSharedApplet(this);

		logger.info("App started");

		size(800, 600);
	}

	@Override
	public void setup() {
		// Enter setup code here
	}

	@Override
	public void draw() {
		appRenderer.doDraw();
	}

	// ####################################################
	// Application startup. Do not change after this lines
	// ####################################################
	public static void main(String[] passedArgs) {
		Object o = new Object() {
		};

		if (passedArgs != null) {
			PApplet.main(o.getClass().getEnclosingClass(), passedArgs);
		} else {
			PApplet.main(o.getClass().getEnclosingClass());
		}
	}

}
