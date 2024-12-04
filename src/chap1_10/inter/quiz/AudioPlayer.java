package chap1_10.inter.quiz;

public class AudioPlayer implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("오디오 재생");
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}
