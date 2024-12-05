package chap1_10.practice.media;


public interface MediaPlayable {

    // 미디어 파일 재생( public 안 붙여도 자동으로 public임)
    void play();

    // 미디어 일시정지
    public void pause();

    // 미디어 재생 중지
    public void stop();

    // toString()
    public String toString();
}
