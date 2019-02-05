package ru.mpryanikov.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import javax.annotation.PostConstruct;

@Component ( "camera")
@Scope( "prototype")
public class CameraImpl implements Camera {
    @Autowired
    @Qualifier ("cameraRoll")
    private CameraRoll cameraRoll;

    @Value("false")
    private boolean broken;

    public CameraRoll getCameraRoll(){
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll){
        this.cameraRoll = cameraRoll;
    }

    public boolean isBroken(){
        return broken;
    }

    public void breaking(){
        this.broken = true;
    }

    public void doPhotograph(){
        if (isBroken()){
            System.out.println("Фотоаппарат сломан!");
            return;
        }
        System.out.println ("Сделана фотография!");
        cameraRoll.processing();
    }

    @PostConstruct
    public void ready() {
        System.out.println("Фотоаппарат готов к использованию!");
    }

}
