# Vocabulary #

  * **Ray Handler** is handler class for all the lights. Ray handler manage updating, rendering and disposing the lights. Ray handler also check the current OpenGl es version and use right mode for rendering. If GLes2.0 is detected: gaussian blurred lights map is enabled and used automatically. GLes2.0 have bigger constant time but its scale better with multiple lights becouse ligths are rendered small FBO instead of render target and fragment shader have to do less work.

  * **Light** Abstract class that contain shared parameters and act as "interface" for all the lights. Light is made from bunch of rays that are tested with raycasting against box2d geometry and from this data light mesh is constructed and rendered to scene. All lights have meaningfull color, number of rays, softShadowLenght and some booleans like active, soft, xray, staticLight.


  * **Positional Light** is also abstract class. This contain shared parameters between Point- and Cone light. Positional light have position and finite distance.

  * **Point Light** is first concreate class. It's simplest and most used light. Pointh lights have meaningfull position and distance and all other lights atributes. Point lights is allways circular shaped.

  * **Cone Light** is second concreate class. It's basically point light but only a sector of the full circle. Cone light has direction and cone degree as additional parameters. cone degree is aberration of straight line to both directions. Setting Cone Degree to 180 means that you got full circle.

  * **Directional Light** simulate light source that location is at infinite distance. This means that direction and intensity is same everywhere. -90 direction is straight from up. This type of light is good for simulating sun.