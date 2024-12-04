package chap1_10.inter.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class MediaPlayer {

    private ArrayList<MediaPlayable> mediaList;

    public ArrayList<MediaPlayable> getMediaList() {
        return mediaList;
    }

    public void printMediaList() {
        System.out.println(mediaList);
    }

    // addMedia(MediaPlayable media): 미디어 목록에 미디어를 추가합니다.
    public void addMedia(MediaPlayable media) {
        if (mediaList == null) {
            mediaList = new ArrayList<MediaPlayable>();
        }
        else {
            mediaList.add(media);
        }
    }



    // playAll(): 목록에 있는 모든 미디어 파일을 재생합니다.
    public void playAll() {
        for (MediaPlayable media : mediaList) {
            media.play();
        }
    }


}
