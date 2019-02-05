package ru.mpryanikov.lesson2;

import org.springframework.stereotype.Component;
import ru.mpryanikov.lesson2.annotation.UnproducableCameraRoll;

@Component("cameraRoll")
//осуществляем подмену
@UnproducableCameraRoll(usingCameraRollClass=BlackAndWhiteCameraRoll.class)
public class ColorCameraRoll implements CameraRoll{
    public void processing(){
        System.out.println("-1 цветной кадр");
    }
}
