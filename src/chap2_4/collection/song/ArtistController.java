package chap2_4.collection.song;

import chap2_4.song.ArtistRepository;

// 프로그램의 입출력 처리
public class ArtistController {

    private ArtistRepository repository;

    public ArtistController() {
        this.repository = new ArtistRepository();
    }
}
