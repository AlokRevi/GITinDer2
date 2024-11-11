package Nov_02.implementation;

public  class Laptop implements Nov_02.devices.Laptop {

        @Override
        public void selfie () {
            System.out.println("Selfie");
        }

        @Override
        public void clickPic () {
            System.out.println("Only selfie Cam picks");
        }

        @Override
        public void takeVideo () {
            System.out.println("Only selfie Cam videos");
        }

        @Override
        public void playRadioFM () {

        }

        @Override
        public void calculations () {
            System.out.println("Calculator I never use");
        }


        @Override
        public void text () {
            System.out.println("Whatsapp Web :)");
        }

        @Override
        public void calls () {

        }

        @Override
        public void playsMovies () {

        }

        @Override
        public void playMusic () {

        }

        @Override
        public void downloadStuff () {

        }

        @Override
        public void play () {

        }

        @Override
        public void pause () {

        }

        @Override
        public void stop () {

        }
    }

