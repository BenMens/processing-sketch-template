import static nl.benmens.processing.PAppletProxy.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.reactivex.rxjava3.disposables.Disposable;

class Renderer implements AutoCloseable {
	private Logger logger = LogManager.getLogger(Renderer.class);
	private char lastKey = ' ';
	private Disposable subscription; 

	public Renderer() {
		subscription = keyEvents().subscribe(e -> {
			logger.info("Key event action={}, key={}", e.getAction(), e.getKey());

			lastKey = e.getKey();
		});
	}

  public void doDraw() {
		background(0xffffff);
		fill(0x00000);
		textSize(100);
		text("Hello world!", 100, 150);

		text(lastKey, 250, 250);
  }

	public void close() {
		subscription.dispose();
	}
}
