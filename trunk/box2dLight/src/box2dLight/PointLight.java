package box2dLight;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.MathUtils;

public class PointLight extends PositionalLight {

	/**
	 * @param rayHandler
	 * @param rays
	 * @param color
	 * @param distance
	 * @param x
	 * @param y
	 */
	public PointLight(RayHandler rayHandler, int rays, Color color,
			float distance,
			float x, float y) {
		super(rayHandler, rays, color, distance, x, y, 0f);
		setEndPoints();
	}

	final void setEndPoints() {
		float angleNum = 360f / (rayNum - 1);
		for (int i = 0; i < rayNum; i++) {
			float angle = angleNum * i;
			final float s = sin[i] = MathUtils.sinDeg(angle);
			final float c = cos[i] = MathUtils.cosDeg(angle);
			endX[i] = distance * c;
			endY[i] = distance * s;
		}
	}

	@Override
	public void setDirection(float directionDegree) {
	}

	/**
	 * setDistance(float dist) MIN capped to 1cm
	 * 
	 * @param dist
	 */
	public void setDistance(float dist) {
		super.setDistance(dist);
		setEndPoints();
	}

}
