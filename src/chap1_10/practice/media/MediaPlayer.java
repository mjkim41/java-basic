package chap1_10.practice.media;

import java.util.ArrayList;

public class MediaPlayer {


    // 생성자
    public MediaPlayer() {
        this.mediaList = new ArrayList<MediaPlayable> ();
    }

    // ArrayList 생성

    // ArrayList getter 생성
    private ArrayList<MediaPlayable> mediaList;
    public ArrayList<MediaPlayable> getMediaList() {
        return mediaList;
    }

    // ArrayList print method 생성
    public void printMediaList() {
        System.out.println(mediaList);
    }

    // addMedia(MediaPlayable media): 미디어 목록에 미디어를 추가합니다.
    public void addMedia(MediaPlayable media) {
        mediaList.add(media);
    }

    // playAll(): 목록에 있는 모든 미디어 파일을 재생합니다.
    public void playAll() {
        for (MediaPlayable media : mediaList) {
            media.play();
        }
    }


}
