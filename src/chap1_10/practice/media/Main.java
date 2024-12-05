package chap1_10.practice.media;

public class Main {

    public static void main(String[] args) {

        MediaPlayer mp1 = new MediaPlayer();
        mp1.addMedia(new AudioPlayer());
        mp1.addMedia(new ImageDisplay());
        mp1.addMedia(new VideoPlayer());
        mp1.printMediaList();
        mp1.playAll();
    }
}
