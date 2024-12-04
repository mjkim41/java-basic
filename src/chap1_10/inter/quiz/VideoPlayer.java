package chap1_10.inter.quiz;

public class VideoPlayer implements MediaPlayable {

    // 재생
    @Override
    public void play() {
        System.out.println("비디오 재생");
    }

    // 일시정지
    @Override
    public void pause() {

    }

    // 중지
    @Override
    public void stop() {

    }
}
