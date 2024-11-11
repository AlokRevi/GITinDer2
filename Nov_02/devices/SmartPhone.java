package Nov_02.devices;

import Nov_02.Cameras.Camera;
import Nov_02.Cameras.SelfieCamera;
import Nov_02.applications.*;

public interface SmartPhone extends AudioPlayer, Calculator, MobilePhone, VideoPlayer, Camera, SelfieCamera, WebBrowser {

    void playGames();

}
