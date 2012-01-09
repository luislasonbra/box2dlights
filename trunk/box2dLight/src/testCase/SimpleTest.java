package testCase;

import box2dLight.PointLight;
import box2dLight.RayHandler;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class SimpleTest extends ApplicationAdapter {
	/** the camera **/
	private OrthographicCamera camera;
	RayHandler rayHandler;

	@Override
	public void create() {
		camera = new OrthographicCamera(48, 32);
		camera.update();
		rayHandler = new RayHandler(new World(new Vector2(0, -10), true)
				);
		rayHandler.setBlurNum(1);
		rayHandler.setCombinedMatrix(camera.combined);
		new PointLight(rayHandler, 32, Color.RED, 10, 0,
					0);

	}

	private FPSLogger log = new FPSLogger();

	@Override
	public void render() {
		log.log();
		// Gdx.graphics.getGL20().glClear(GL10.GL_COLOR_BUFFER_BIT);
		rayHandler.updateAndRender();

	}

}
