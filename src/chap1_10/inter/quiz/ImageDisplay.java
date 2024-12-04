package chap1_10.inter.quiz;

public class ImageDisplay implements MediaPlayable {

    @Override
    public void play() {
        System.out.println("이미지 재생");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}
