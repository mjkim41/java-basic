package chap1_10.practice.media;

public class AudioPlayer implements MediaPlayable {

    @Override
    public void play() {
        System.out.println("오디오 재생");
    }

    @Override
    public void pause() {
        System.out.println("오디오 일시정지");
    }

    @Override
    public void stop() {
        System.out.println("오디오 중지");
    }

    // toString (배열 출력용)
    @Override
    public String toString() {
        return "오디오 플레이어";
    }
}
