package chap1_10.practice.media;

public class MediaPlayerTestMain {

    public static void main(String[] args) {
        MediaPlayerTest mediaPlayerTest = new MediaPlayerTest();
        mediaPlayerTest.addMedia(new AudioPlayer());
        mediaPlayerTest.addMedia(new AudioPlayer());
        String a = mediaPlayerTest.toString();
        System.out.println(a);
    }

}
