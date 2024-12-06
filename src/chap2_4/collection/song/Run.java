package chap2_4.collection.song;


import java.util.Set;
import chap2_4.song.ArtistRepository;

public class Run {

    public static void main(String[] args) {

        ArtistController controller = new ArtistController();
//        controller.start();

        Artist a = new Artist("미돌", Set.of("로케펀쳐", "whiplash"));
        boolean isSongAdded = a.addSong("신곡");
        System.out.println(isSongAdded);
        Set<String> songList = a.getSongList();
        System.out.println(songList);

        ArtistRepository b = new ArtistRepository();
        b.addNewArtist("빅뱅", "Power");
        b.ge
        int count = b.count();
        System.out.println("count : " + count);


    }
}
