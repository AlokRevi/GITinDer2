package ClassFiles.Nov_02.implementation;

public abstract class SmartWatch implements ClassFiles.Nov_02.devices.SmartWatch {


        @Override
        public void playRadioFM () {
            System.out.println("FMRadio");
        }

        @Override
        public void calculations () {
            System.out.println("Tiny Calculator");
        }


        @Override
        public void text () {

        }

        @Override
        public void calls () {

        }
    }