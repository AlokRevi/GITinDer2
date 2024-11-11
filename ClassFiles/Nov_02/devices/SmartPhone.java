package ClassFiles.Nov_02.devices;

import ClassFiles.Nov_02.Cameras.Camera;
import ClassFiles.Nov_02.Cameras.SelfieCamera;
import ClassFiles.Nov_02.applications.*;

public interface SmartPhone extends AudioPlayer, Calculator, MobilePhone, VideoPlayer, Camera, SelfieCamera, WebBrowser {

    void playGames();

}
