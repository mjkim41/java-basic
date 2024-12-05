package chap1_10.practice.media;

public class ImageDisplay implements MediaPlayable {

    @Override
    public void play() {
        System.out.println("이미지 재생");
    }

    @Override
    public void pause() {
        System.out.println("이미지 일시정지");
    }

    @Override
    public void stop() {
        System.out.println("이미지 중지");
    }

    // toString (배열 출력용)
    @Override
    public String toString() {
        return "이미지 플레이어";
    }

}
