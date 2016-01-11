These need to be added to your project for integrating the box2dligths

In create:
```
rayHandler = new RayHandler(world);
rayHandler.setCombinedMatrix(camera.combined);
```

This create new white point light.
```
new PointLight(rayHandler, RAYS_NUM, new Color(1,1,1,1), lightDistance, x, y);
```

In gameloop after everything is drawed that you want to be lit:
```
rayHandler.updateAndRender();
```



Rembember call on dispose:
```
rayHandler.dispose():
```