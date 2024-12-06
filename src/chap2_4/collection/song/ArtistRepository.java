package chap2_4.song;

import chap2_4.collection.song.Artist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 가수객체를 여러 개 관리하는 클래스
public class ArtistRepository {

    // 가수들을 담을 자료구조 선언
    // key: 가수를 찾을 가수명, value: 가수 객체
    private Map<String, Artist> artistMap;

    public ArtistRepository() {
        this.artistMap = new HashMap<>();
    }

    // 현재 저장된 가수의 숫자를 알려주는 메서드
    public int count() {
        return artistMap.size();
    }

    // 현재 주어진 가수명이 map에 있는지 확인하는 기능
    // containsKey() 메서드를 검색해보세요
    public boolean isRegistered(String artistName) {
        return false;
    }

    // 새로운 가수 객체 정보를 map에 저장하는 기능
    public void addNewArtist(String artistName, String songName) {
        artistMap.put(artistName, new Artist(artistName, new HashSet<>(Set.of(songName))));
    }






    // 주어진 가수명으로 가수의 노래트랙리스트를 가져오는 기능
    public Set<String> getTrackList(String artistName) {
        return null;
    }

}
