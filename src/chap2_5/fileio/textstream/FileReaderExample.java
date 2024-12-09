package chap2_5.fileio.textstream;

import chap2_4.song.Artist;
import chap2_5.fileio.FileExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileReaderExample {

    public static void main(String[] args) {


            try (FileReader fr = new FileReader(FileExample.ROOT_PATH + "/artist.sav")) {

            // 텍스트를 라인 단위로 읽는 보조스트림 (쓰지 않으면 한 글자씩 출력됨)
                // BufferedReader는 생성자로 FileReader를 받기 때문에, 어쨋든 처음에 FileReader는 생성해야됨
            BufferedReader br = new BufferedReader(fr);

            Map<String, Artist> artistMap = new HashMap<>();

            while (true) {
                String data = br.readLine();

                // 읽을 값이 없으면, 'null'이 저장됨
                if (data == null) break; // 더 이상 읽을게 없으면

                String[] split = data.split("-");
//                System.out.println("artistName = " + split[0]);

                String[] songList = split[1].split(",");
//                System.out.println("songList = " + Arrays.toString(songList));

                Artist artist = new Artist(split[0]);
                for (String song : songList) {
                    artist.addSong(song);
                }

                artistMap.put(split[0], artist);
            }

            System.out.println("artistMap = " + artistMap);


        } catch (Exception e) {
            System.out.println("파일 로드에 실패했습니다.");
        }
    }
}