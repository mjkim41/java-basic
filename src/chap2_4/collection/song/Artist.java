package chap2_4.collection.song;

import java.util.HashSet;
import java.util.Set;

public class Artist {

    private String artistName;
    private Set<String> songList;


    public Artist(String artistName, Set<String> songList) {
        this.artistName = artistName;
        this.songList = new HashSet<>(songList);
    }

    /**
     * 노래 목록에 노래를 추가하는 기능
     * @param songName - 노래목록에 새롭게 추가될 노래 제목
     * @return - 성공적으로 중복없이 추가되면 true, 아니면 false
     */
    // 노래 목록에 노래를 추가하는 기능
    public boolean addSong(String songName) {
        boolean flag = songList.add(songName);
        return flag;
    }

    // 노래 목록을 가져오는 기능
    public Set<String> getSongList() {
        return songList;
    }


}
