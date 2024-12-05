package chap1_10.practice.media;

import java.util.ArrayList;

public class MediaPlayerTest {

    // 원하는 결과 [AudioPlayer, ImageDIsplay, VideopLAYER]
    // 하는 방법?
    //   1) 객체가 생성될 때마다 생성된 객체가 빈 배열에 추가되도록 한다.
    //   2) 그 배열을 출력해준다.
    private ArrayList<MediaPlayable> mediaList;

    public MediaPlayerTest() {
        mediaList = new ArrayList<>();
    }

    public void addMedia(MediaPlayable media) {
        mediaList.add(media);
    }

    public ArrayList<MediaPlayable> getMediaList() {
        return mediaList;
    }

    @Override
    public String toString() {
        String toStringResult = "";
        for (MediaPlayable media : mediaList) {
            toStringResult += media.toString() + ",";
        }
        return toStringResult;
    }


}
