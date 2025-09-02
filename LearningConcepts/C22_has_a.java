
  class videoplayer{
    void start() {
        System.out.println("Video player is starting...");
    }

    void stop() {
        System.out.println("Video player is stopping...");
    }
}

class smartphone2{
    videoplayer mxplayer;
    String name;

    smartphone2(String name) {
        this.name = name;
        this.mxplayer = new videoplayer(); 
    }

    void startvideo() {
        System.out.println("Starting the " + name + " phone.");
        mxplayer.start(); 
}

void stopvideo() {
        System.out.println("Stopping the " + name + " phone.");
        mxplayer.stop();
    }
}


public class C22_has_a {
    public static void main(String[] args) {
        smartphone2 myphone = new smartphone2("Iphone 12");
        myphone.startvideo();
        myphone.stopvideo();
    }
}

