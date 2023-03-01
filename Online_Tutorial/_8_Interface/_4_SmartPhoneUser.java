package _8_Interface;

class Phone {
    void call() {
        System.out.println("Calling feature");
    }

    void sms() {
        System.out.println("sms feature");
    }
}

interface Camera {

    void click();
    void record();
}

interface MusicPlayer {
    
    void play();
    void pause();
}

class SmartPhone extends Phone implements Camera,MusicPlayer{

    void videoCall() {
        System.out.println("Video call feature");
    }

    public void click() {
        System.out.println("Clicks Photos");
    }

    public void record() {
        System.out.println("Records videos");
    }

    public void play() {
        System.out.println("Plays music");
    }

    public void pause() {
        System.out.println("Pause music");
    }

}

public class _4_SmartPhoneUser {
    public static void main(String args[]) {
        SmartPhone sp = new SmartPhone();
        sp.videoCall();

        sp.click();
        sp.record();

        sp.play();
        sp.pause();

        System.out.println("\nUsing Phone");
        Phone p = new SmartPhone();
        p.call();
        p.sms();
        
        System.out.println("\nUsing Camera");
        Camera c = new SmartPhone();
        c.click();
        c.record();

        System.out.println("\nUsing Music Player");
        MusicPlayer mp = new SmartPhone();
        mp.play();
        mp.pause();
        
    }
}

/*
************************** OUTPUT **************************
Video call feature
Clicks Photos
Records videos
Plays music
Pause music

 Using Phone
Calling feature
sms feature

 Using Camera
Clicks Photos
Records videos

Using Music Player
Plays music
Pause music
*/
