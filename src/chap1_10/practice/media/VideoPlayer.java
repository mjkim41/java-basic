package chap1_10.practice.media;

public class VideoPlayer implements MediaPlayable {

    // 재생
    @Override
    public void play() {
        System.out.println("비디오 재생");
    }

    // 일시정지
    @Override
    public void pause() {
        System.out.println("비디오 일시정지");
    }

    // 중지
    @Override
    public void stop() {
        System.out.println("비디오 중지");
    }

}
